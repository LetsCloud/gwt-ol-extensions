/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2020 GwtMaterialDesign
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
/**
 * 
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

	@JsProperty
	public native void setProvider(String provider);

	@JsProperty
	public native void setLang(String lang);

	@JsProperty
	public native void setPlaceholder(String lang);

	@JsProperty
	public native void setLimit(int limit);

	@JsProperty
	public native void setDebug(boolean debug);

	@JsProperty
	public native void setAutoComplete(boolean autoComplete);

	@JsProperty
	public native void setKeepOpen(boolean keepOpen);

	@JsProperty
	public native void setCrs(String crs);

}
