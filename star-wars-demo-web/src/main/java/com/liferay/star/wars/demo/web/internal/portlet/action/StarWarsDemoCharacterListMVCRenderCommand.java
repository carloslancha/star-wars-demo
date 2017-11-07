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
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.template.Template;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.star.wars.demo.constants.StarWarsDemoPortletKeys;
import com.liferay.star.wars.demo.model.StarWarsCharacter;
import com.liferay.star.wars.demo.service.StarWarsCharacterService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Lancha
 * @author Jürgen Kappler
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + StarWarsDemoPortletKeys.STAR_WARS_DEMO,
		"mvc.command.name=/", "mvc.command.name=character_list"
	},
	service = MVCRenderCommand.class
)
public class StarWarsDemoCharacterListMVCRenderCommand
	implements MVCRenderCommand {

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse) {

		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		Template template = (Template)renderRequest.getAttribute(
			WebKeys.TEMPLATE);

		try {
			List<StarWarsCharacter> starWarsCharacters =
				_starWarsCharacterService.getStarWarsCharacters(
					themeDisplay.getScopeGroupId());

			template.put(
				"characters", toSoyData(starWarsCharacters, renderResponse));
		}
		catch (PortalException pe) {
			if (_log.isDebugEnabled()) {
				_log.debug(pe);
			}
		}

		template.put("pathThemeImages", themeDisplay.getPathThemeImages());

		return "CharacterList";
	}

	protected List<Map<String, Object>> toSoyData(
		List<StarWarsCharacter> starWarsCharacters,
		RenderResponse renderResponse) {

		List soyStarWarsCharacters = new ArrayList(starWarsCharacters.size());

		for (StarWarsCharacter starWarsCharacter : starWarsCharacters) {
			Map<String, Object> soyStarWarsCharacter = new HashMap<>();

			soyStarWarsCharacter.put(
				"description", starWarsCharacter.getDescription());
			soyStarWarsCharacter.put(
				"fraction", starWarsCharacter.getFraction());
			soyStarWarsCharacter.put("name", starWarsCharacter.getName());
			soyStarWarsCharacter.put("picture", starWarsCharacter.getPicture());

			soyStarWarsCharacters.add(soyStarWarsCharacter);
		}

		return soyStarWarsCharacters;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		StarWarsDemoCharacterListMVCRenderCommand.class);

	@Reference
	private StarWarsCharacterService _starWarsCharacterService;

}