FROM mysql

# sql scripts
COPY ./schema.sql /tmp/schema.sql
# start-dbsetup
COPY ./dbexecutor.sh /tmp/dbexecutor.sh

# setup database
CMD ["/tmp/dbexecutor.sh"]