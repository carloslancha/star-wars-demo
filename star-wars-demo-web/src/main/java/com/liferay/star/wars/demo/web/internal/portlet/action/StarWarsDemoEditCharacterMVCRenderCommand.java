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

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.template.Template;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.star.wars.demo.constants.StarWarsDemoPortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Carlos Lancha
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + StarWarsDemoPortletKeys.STAR_WARS_DEMO,
		"mvc.command.name=edit_character"
	},
	service = MVCRenderCommand.class
)
public class StarWarsDemoEditCharacterMVCRenderCommand
	implements MVCRenderCommand {

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse) {

		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		Template template = (Template)renderRequest.getAttribute(
			WebKeys.TEMPLATE);

		PortletURL saveCharacterURL = renderResponse.createActionURL();

		saveCharacterURL.setParameter(
			ActionRequest.ACTION_NAME, "add_character");

		template.put("backURL", getBackURL(renderResponse));

		template.put("pathThemeImages", themeDisplay.getPathThemeImages());

		template.put("saveCharacterURL", saveCharacterURL.toString());

		return "EditCharacter";
	}

	protected String getBackURL(RenderResponse renderResponse) {
		PortletURL portletURL = renderResponse.createRenderURL();

		portletURL.setParameter("mvcRenderCommandName", "character_list");

		return portletURL.toString();
	}

}