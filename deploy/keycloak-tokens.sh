#!/bin/bash

ACCESS_TOKEN=`curl \
  -d "client_id=$KCCLIENT_ID" \
  -d "username=$KCUNAME" \
  -d "password=$KCPASSWORD" \
  -d "grant_type=password" \
  "$KCHOST/realms/$KCREALM/protocol/openid-connect/token"  | jq -r '.access_token'`
echo "$ACCESS_TOKEN"
