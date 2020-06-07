/*
 * #%L
 * LetsCloud
 * %%
 * Copyright (C) 2020 LetsCloudTeam
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package ol.geocoder;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Options;

/**
 * @author robi
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class GeocoderOptions implements Options {

	/**
	 * Your preferable provider: 'osm' (default), 'mapquest', 'photon', 'pelias',
	 * 'bing', 'opencage', custom provider instance
	 * 
	 * @param provider
	 */
	@JsProperty
	public native void setProvider(String provider);

	/**
	 * API Key if required
	 * 
	 * @param key
	 */
	@JsProperty
	public native void setKey(String key);

	/**
	 * Search as you type:
	 * 
	 * @param autoComplete
	 */
	@JsProperty
	public native void setAutoComplete(boolean autoComplete);

	/**
	 * The minimum number of characters to trigger search: 2
	 * 
	 * @param autoCompleteMinLength
	 */
	@JsProperty
	public native void setAutoCompleteMinLength(boolean autoCompleteMinLength);

	/**
	 * Placeholder for text input: 'Search for an address'
	 * 
	 * @param placeholder
	 */
	@JsProperty
	public native void setPlaceholder(String placeholder);

	/**
	 * 'glass-button'; Can also be 'text-input'
	 * 
	 * @param targetType
	 */
	@JsProperty
	public native void setTargetType(String targetType);

	/**
	 * Feature style
	 * 
	 * @param featureStyle
	 */
	@JsProperty
	public native void setFeatureStyle(ol.style.Style featureStyle);

	/**
	 * Preferable language: 'en-US'
	 * 
	 * @param lang
	 */
	@JsProperty
	public native void setLang(String lang);

	/**
	 * Limit of results: 5
	 * 
	 * @param limit
	 */
	@JsProperty
	public native void setLimit(int limit);

	/**
	 * Only valid for osm and mapquest; Limit search results to a specific country
	 * (or a list of countries). This is an [ISO 3166-1alpha2 code]
	 * (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), e.g. gb for the United
	 * Kingdom, br for Brazil, etc;
	 * 
	 * @param countrycodes
	 */
	@JsProperty
	public native void setCountrycodes(String countrycodes);

	/**
	 * Whether the results keep openned: false
	 * 
	 * @param keepOpen
	 */
	@JsProperty
	public native void setKeepOpen(boolean keepOpen);

	/**
	 * Whether panning (and creating marker) when an address is chosen: false
	 * 
	 * @param preventDefault
	 */
	@JsProperty
	public native void setPreventDefault(boolean preventDefault);

	/**
	 * If true logs provider's response: false
	 * 
	 * @param debug
	 */
	@JsProperty
	public native void setDebug(boolean debug);
}
