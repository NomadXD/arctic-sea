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
package org.n52.iceland.config;

import java.io.File;
import java.net.URI;
import java.util.Set;

import org.n52.iceland.ds.ConnectionProviderException;
import org.n52.iceland.i18n.MultilingualString;
import org.n52.iceland.ogc.gml.time.TimeInstant;

/**
 * @since 4.0.0
 *
 */
public class SettingsManagerForTesting extends AbstractSettingsManager {

    public static final SettingValueFactory SETTING_FACTORY = new SettingFactoryForTesting();

    @Override
    protected Set<SettingValue<?>> getSettingValues() throws ConnectionProviderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected SettingValue<?> getSettingValue(String key) throws ConnectionProviderException {
        return null;
    }

    @Override
    protected void deleteSettingValue(String key) throws ConnectionProviderException {
        // TODO Auto-generated method stub

    }

    @Override
    protected void saveSettingValue(SettingValue<?> setting) throws ConnectionProviderException {
        // TODO Auto-generated method stub

    }

    @Override
    public SettingValueFactory getSettingFactory() {
        return SETTING_FACTORY;
    }

    @Override
    public Set<AdministratorUser> getAdminUsers() throws ConnectionProviderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AdministratorUser getAdminUser(String username) throws ConnectionProviderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AdministratorUser createAdminUser(String username, String password) throws ConnectionProviderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void saveAdminUser(AdministratorUser user) throws ConnectionProviderException {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAdminUser(String username) throws ConnectionProviderException {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() throws ConnectionProviderException {
        // TODO Auto-generated method stub

    }

    @Override
    public <T> SettingValue<T> getSetting(String key)
            throws ConnectionProviderException {
        /* TODO implement org.n52.iceland.config.SettingsManagerForTesting.getSetting() */
        throw new UnsupportedOperationException("org.n52.iceland.config.SettingsManagerForTesting.getSetting() not yet implemented");
    }

    private static class SettingFactoryForTesting extends AbstractSettingValueFactory {

        @Override
        protected SettingValue<Boolean> newBooleanSettingValue() {
            return new BooleanSettingValueForTesting();
        }

        @Override
        protected SettingValue<Integer> newIntegerSettingValue() {
            return new IntegerSettingValueForTesting();
        }

        @Override
        protected SettingValue<String> newStringSettingValue() {
            return new StringSettingValueForTesting();
        }

        @Override
        protected SettingValue<File> newFileSettingValue() {
            return new FileSettingValueForTesting();
        }

        @Override
        protected SettingValue<URI> newUriSettingValue() {
            return new UriSettingValueForTesting();
        }

        @Override
        protected SettingValue<Double> newNumericSettingValue() {
            return new NumericSettingValueForTesting();
        }

        @Override
        protected SettingValue<TimeInstant> newTimeInstantSettingValue() {
            return new TimeInstantSettingValueForTesting();
        }

        @Override
        protected SettingValue<MultilingualString> newMultiLingualStringSettingValue() {
            return new MultilingualStringValueForTestin();
        }

        @Override
        protected SettingValue<String> newChoiceSettingValue() {
            return new ChoiceSettingValueForTesting();
        }
    }

}
