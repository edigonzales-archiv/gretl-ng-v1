FROM mdillon/postgis:10-alpine

ENV POSTGRES_DB gretl

COPY init-test-db.sh /docker-entrypoint-initdb.d/

COPY docker-healthcheck /usr/local/bin/

HEALTHCHECK CMD ["docker-healthcheck"]
