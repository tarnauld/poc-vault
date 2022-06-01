# Poc Vault

## Pre-requisites

You need to have installed on your machine:
* ```docker```
* ```docker-compose```
* ```vault```

To start the project, you need to start vault and get the vault address and the vault token:

```sh
vault server -dev
```

And start using:

```sh
./start.sh $VAULT_ADDR $VAULT_TOKEN
```
