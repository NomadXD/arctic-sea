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
package org.n52.iceland.decode;

import java.util.Collections;
import java.util.Set;

import org.apache.xmlbeans.XmlObject;

import org.n52.iceland.service.ServiceConstants.SupportedType;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann <c.autermann@52north.org>
 *
 * @since 4.0.0
 */
public abstract class AbstractXmlDecoder<S> implements Decoder<S, XmlObject> {

    @Override
    public Set<SupportedType> getSupportedTypes() {
        return Collections.emptySet();
    }

    @Override
    public Set<String> getConformanceClasses(String service, String version) {
        return Collections.emptySet();
    }
}
