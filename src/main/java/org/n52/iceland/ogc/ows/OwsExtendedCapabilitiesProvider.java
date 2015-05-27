/*
 * Copyright 2015 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.iceland.ogc.ows;

import java.util.Set;

import org.n52.iceland.component.Component;
import org.n52.iceland.request.GetCapabilitiesRequest;

/**
 * @author Carsten Hollmann <c.hollmann@52north.org>
 *
 * @since 4.0.0
 *
 */
public interface OwsExtendedCapabilitiesProvider extends Component<OwsExtendedCapabilitiesProviderKey> {

    /**
     * Get the {@link OwsExtendedCapabilities} for the
     * {@link GetCapabilitiesRequest}
     *
     * @param request
     *            Capabilities request
     * @return Resulting {@link OwsExtendedCapabilities}
     * @throws OwsExceptionReport
     *             If an error occurs when creating extended capabilities
     */
    OwsExtendedCapabilities getOwsExtendedCapabilities(GetCapabilitiesRequest request) throws OwsExceptionReport;

    /**
     * @param request
     * @return
     */
    boolean hasExtendedCapabilitiesFor(GetCapabilitiesRequest request);

    /**
     * @return
     */
    @Deprecated
    Set<OwsExtendedCapabilitiesProviderKey> getExtendedCapabilitiesKeyType();

}
