#!/bin/sh

chercher(){
echo $1
git diff $1 | grep USE_SIDEBAR_TOGGLE
}

chercher        uportal-war/src/main/data/required_entities/stylesheet-descriptor/DLMTabsColumns.stylesheet-descriptor.xml
chercher        uportal-war/src/main/data/required_entities/stylesheet-descriptor/DLMXHTML.stylesheet-descriptor.xml
chercher        uportal-war/src/main/resources/layout/structure/columns/columns.xsl
chercher        uportal-war/src/main/resources/layout/theme/universality/navigation.xsl
chercher        uportal-war/src/main/resources/layout/theme/universality/universality.xsl
chercher        uportal-war/src/main/resources/properties/contexts/requestParameterProcessingContext.xml
chercher        uportal-war/src/main/webapp/WEB-INF/web.xml
chercher        uportal-war/src/main/webapp/media/skins/universality/albi/portal.css
chercher        uportal-war/src/main/webapp/media/skins/universality/coal/portal.css
chercher        uportal-war/src/main/webapp/media/skins/universality/common/scss/_navigation.scss
chercher        uportal-war/src/main/webapp/media/skins/universality/hc/portal.css
chercher        uportal-war/src/main/webapp/media/skins/universality/ivy/portal.css
chercher        uportal-war/src/main/webapp/media/skins/universality/uportal3/portal.css
