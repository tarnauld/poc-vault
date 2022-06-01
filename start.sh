export VAULT_ADDR=$1
export VAULT_TOKEN=$2
vault login $VAULT_TOKEN &> /dev/null
export HOST_ENV_VARIABLE=`vault kv get -field=MY_SECRET secret/poc-vault`
docker-compose build
docker-compose up