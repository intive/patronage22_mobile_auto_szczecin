# MAKEFILE

# CONST
export BROWSERSTACK_KEY=<secrete>
export BROWSERSTACK_USER=<secrete>

MAVEN_NORMAL_RUN:
	mvn clean test -Ddevice="default"

MAVEN_BS_RUN:
	mvn clean test -Ddevice="bs_samsung" -Dbrowserstack="True"