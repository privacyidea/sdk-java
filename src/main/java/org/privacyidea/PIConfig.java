package org.privacyidea;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2021 NetKnights GmbH - nils.behlen@netknights.it
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class PIConfig {

    String serverURL = "";
    String realm = "";
    boolean doSSLVerify = true;
    String serviceAccountName = "";
    String serviceAccountPass = "";
    String serviceAccountRealm = "";
    List<Integer> pollingIntervals = new ArrayList<>();
    boolean disableLog = false;
    String userAgent = "";

    public PIConfig(String serverURL, String userAgent) {
        this.serverURL = serverURL;
        this.userAgent = userAgent;
    }
}