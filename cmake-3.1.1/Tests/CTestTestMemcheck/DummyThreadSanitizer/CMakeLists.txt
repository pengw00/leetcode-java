cmake_minimum_required(VERSION 2.8.9)
project(CTestTestMemcheckDummyThreadSanitizer NONE)
include(CTest)

add_test(NAME RunCMake COMMAND "${CMAKE_COMMAND}" --version)

add_test(NAME TestSan COMMAND "/home/pengwu550/leetcode-java/cmake-3.1.1/Bootstrap.cmk/cmake"
-P "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/testThreadSanitizer.cmake")

