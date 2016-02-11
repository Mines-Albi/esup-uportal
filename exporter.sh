#!/bin/sh
# Data Type             | Export | Delete 
# ----------------------+--------+--------
# entity-type           | true   | false  
# event-aggregation     | true   | true   
# fragment-definition   | true   | false  
# fragment-layout       | true   | false  
# group-membership      | true   | false  
# layout                | true   | false  
# permission-owner      | true   | true   
# permission-set        | true   | false  
# portlet-definition    | true   | true   
# portlet-type          | true   | true   
# profile               | true   | false  
# stylesheet-descriptor | true   | true   
# subscribed-fragments  | true   | true   
# user                  | true   | true   
# Add -Dtype=dataType To get a list of data keys for the type

exporter(){
    ant data-export -Dtype=$1 -Ddir=exports
}

case $# in
    1) case $1 in
        tout) echo "export de tous les types:"; 
            exporter 'entity-type'
            exporter event-aggregation
            exporter fragment-definition
            exporter fragment-layout
            exporter group-membership
            exporter layout
            exporter permission-owner
            exporter permission-set
            exporter portlet-definition
            exporter 'portlet-type'
            exporter profile
            exporter stylesheet-descriptor
            exporter subscribed-fragments
            exporter user
            ;;
        *) exporter $1
            ;;
       esac
       ;;
    *) echo "Usage : $0 type, où type est dans { entity-type, event-aggregation, fragment-definition, fragment-layout, group-membership, layout, permission-owner, permission-set, portlet-definition, portlet-type, profile, stylesheet-descriptor, subscribed-fragments, user }"
        ;;

esac

