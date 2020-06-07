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
import ol.control.Control;

/**
 * @author robi
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Geocoder")
public class Geocoder extends Control {

	public Geocoder() {
	}

	public Geocoder(String controlType, GeocoderOptions geocoderOptions) {
	}

	/**
	 * Returns the layer {ol.layer.Vector} created by Geocoder control.
	 * 
	 * @return
	 */
	@JsProperty
	public native ol.layer.Vector getLayer();

	/**
	 * Returns the source {ol.source.Vector} created by Geocoder control.
	 * 
	 * @return
	 */
	@JsProperty
	public native ol.source.Vector getSource();

	/**
	 * Sets a new provider.
	 * 
	 * @param provider
	 */
	@JsProperty
	public native void setProvider(String provider);

	/**
	 * Sets provider key.
	 * 
	 * @param provider
	 */
	@JsProperty
	public native void setProviderKey(String provider);

}
