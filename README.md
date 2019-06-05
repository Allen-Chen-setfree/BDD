# BDD

1. Execute with browser type and tag:
mvn clean test -Dtest=testRunner -Dcucumber.options="--tags @FuctionTest"  -DbrowserName=chrome

2. Parallel execution (branch: parallel)
mvn  -Dtest=anyTest -Dcucumber.options="--tags @UnitTest" -DfailIfNoTests=false -DbrowserName=firefox verify
