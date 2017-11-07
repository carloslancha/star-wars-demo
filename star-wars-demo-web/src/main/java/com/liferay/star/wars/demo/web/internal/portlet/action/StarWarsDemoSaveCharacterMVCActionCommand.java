/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.star.wars.demo.web.internal.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.star.wars.demo.constants.StarWarsDemoPortletKeys;
import com.liferay.star.wars.demo.service.StarWarsCharacterService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletURL;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Lancha
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + StarWarsDemoPortletKeys.STAR_WARS_DEMO,
		"mvc.command.name=save_character"
	},
	service = MVCActionCommand.class
)
public class StarWarsDemoSaveCharacterMVCActionCommand
	extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		LiferayPortletResponse liferayPortletResponse =
			_portal.getLiferayPortletResponse(actionResponse);

		PortletURL portletURL = liferayPortletResponse.createRenderURL();

		long starWarsCharacterId = ParamUtil.getLong(
			actionRequest, "starWarsCharacterId");
		String description = ParamUtil.getString(actionRequest, "description");
		String fraction = ParamUtil.getString(actionRequest, "fraction");
		String name = ParamUtil.getString(actionRequest, "name");
		String picture = ParamUtil.getString(actionRequest, "picture");

		try {
			ThemeDisplay themeDisplay =
				(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

			_starWarsCharacterService.updateStarWarsCharacter(
				starWarsCharacterId, name, picture, fraction, description);

			portletURL.setParameter("mvcRenderCommandName", "character_list");
		}
		catch (PortalException pe) {
			SessionErrors.add(
				actionRequest, "Sorry, an error occurred with your request.");

			portletURL.setParameter("mvcRenderCommandName", "edit_character");
		}

		sendRedirect(actionRequest, actionResponse, portletURL.toString());
	}

	@Reference
	private Portal _portal;

	@Reference
	private StarWarsCharacterService _starWarsCharacterService;

}