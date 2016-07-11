#!/bin/sh
reimporter_repertoire(){
    echo "===== reimport batch répertoire: $1 ====="
    ant data-import -Ddir=$1
}

reimporter_fichier(){
    echo "===== reimport fichier: $1 ====="
    ant data-import -Dfile=$1
}

reimporter_repertoire exports/user
reimporter_repertoire exports/profile
# reimporter_repertoire exports/pags-group
# reimporter_repertoire exports/group-membership
# reimporter_repertoire exports/portlet-definition
# reimporter_repertoire exports/fragment-definition
# reimporter_repertoire exports/fragment-layout
# reimporter_fichier exports/user/sosinfo-lo.user.xml
# reimporter_fichier exports/group-membership/Fragment_Owners.group-membership.xml
# reimporter_fichier exports/fragment-layout/sosinfo-lo.fragment-layout.xml
# reimporter_fichier exports/fragment-definition/sosinfo.fragment-definition.xml
