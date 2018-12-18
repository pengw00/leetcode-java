cmake_minimum_required(VERSION 2.8.9)

# Settings:
set(CTEST_DASHBOARD_ROOT                "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck")
set(CTEST_SITE                          "pengwu550")
set(CTEST_BUILD_NAME                    "CTestTest-Linux-g++-MemcheckDummyUndefinedBehaviorSanitizer")

set(CTEST_SOURCE_DIRECTORY              "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyUndefinedBehaviorSanitizer")
set(CTEST_BINARY_DIRECTORY              "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyUndefinedBehaviorSanitizer")
set(CTEST_CVS_COMMAND                   "CVSCOMMAND-NOTFOUND")
set(CTEST_CMAKE_GENERATOR               "Unix Makefiles")
set(CTEST_CMAKE_GENERATOR_PLATFORM      "")
set(CTEST_CMAKE_GENERATOR_TOOLSET       "")
set(CTEST_BUILD_CONFIGURATION           "$ENV{CMAKE_CONFIG_TYPE}")
set(CTEST_COVERAGE_COMMAND              "/usr/bin/gcov")
set(CTEST_NOTES_FILES                   "${CTEST_SCRIPT_DIRECTORY}/${CTEST_SCRIPT_NAME}")

set(CTEST_MEMORYCHECK_COMMAND "")
set(CTEST_MEMORYCHECK_TYPE "${MEMCHECK_TYPE}")

set(CTEST_MEMORYCHECK_SANITIZER_OPTIONS "simulate_sanitizer=1")


CTEST_START(Experimental)
CTEST_CONFIGURE(BUILD "${CTEST_BINARY_DIRECTORY}" RETURN_VALUE res)
CTEST_TEST(BUILD "${CTEST_BINARY_DIRECTORY}" RETURN_VALUE res)
CTEST_MEMCHECK(BUILD "${CTEST_BINARY_DIRECTORY}" RETURN_VALUE res)
