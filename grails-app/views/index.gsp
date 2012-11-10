<%--
  - Copyright 2012 David M. Carr, Commerce Technologies
  -
  - Licensed under the Apache License, Version 2.0 (the "License");
  - you may not use this file except in compliance with the License.
  - You may obtain a copy of the License at
  -
  -   http://www.apache.org/licenses/LICENSE-2.0
  -
  - Unless required by applicable law or agreed to in writing, software
  - distributed under the License is distributed on an "AS IS" BASIS,
  - WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  - See the License for the specific language governing permissions and
  - limitations under the License.
  --%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Mongeez Test App</title>
</head>
<body>
    <p>Welcome to the Mongeez Test App.</p>

    <p>Links:</p>
    <ul>
        <li><g:link controller="mongeez" action="index">Mongeez Index</g:link></li>
        <li><g:link controller="mongeez" action="pendingChangeSets">Mongeez Pending ChangeSets</g:link></li>
        <li><g:link controller="mongeez" action="executedChangeSets">Mongeez Executed ChangeSets</g:link></li>
    </ul>
</body>
</html>
