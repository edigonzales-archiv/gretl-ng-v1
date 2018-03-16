FROM mdillon/postgis:10-alpine

ENV POSTGRES_DB gretl

COPY init-test-db.sh /docker-entrypoint-initdb.d/

HEALTHCHECK CMD pg_isready -U postgres || exit 1
