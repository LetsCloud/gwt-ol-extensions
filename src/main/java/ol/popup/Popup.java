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
package ol.popup;

import jsinterop.annotations.JsType;
import ol.Overlay;
import ol.OverlayOptions;

/**
 * @author robi
 *
 */
@JsType(isNative = true, namespace = "ol.Overlay", name = "Popup")
public class Popup extends Overlay {

	public Popup() {
	}

	public Popup(OverlayOptions overlayOptions) {
	}
}
