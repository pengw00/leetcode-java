# CMake generated Testfile for 
# Source directory: /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck
# Build directory: /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck
# 
# This file includes the relevant testing commands required for 
# testing this directory and lists subdirectories to be tested as well.
add_test(CTestTestMemcheckDummyThreadSanitizer "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyThreadSanitizer/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyThreadSanitizer/testOutput.log" "-DMEMCHECK_TYPE=ThreadSanitizer")
set_tests_properties(CTestTestMemcheckDummyThreadSanitizer PROPERTIES  PASS_REGULAR_EXPRESSION ".*Memory checking results:.*data race.* - 1.*data race on vptr .ctor/dtor vs virtual call. - 1.*heap-use-after-free - 1.*thread leak - 1.*destroy of a locked mutex - 1.*double lock of a mutex - 1.*unlock of an unlocked mutex .or by a wrong thread. - 1.*read lock of a write locked mutex - 1.*read unlock of a write locked mutex - 1.*signal-unsafe call inside of a signal - 1.*signal handler spoils errno - 1.*lock-order-inversion .potential deadlock. - 1.*")
add_test(CTestTestMemcheckDummyLeakSanitizer "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyLeakSanitizer/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyLeakSanitizer/testOutput.log" "-DMEMCHECK_TYPE=AddressSanitizer")
set_tests_properties(CTestTestMemcheckDummyLeakSanitizer PROPERTIES  PASS_REGULAR_EXPRESSION ".*Memory checking results:.*Direct leak - 2.*Indirect leak - 1.*")
add_test(CTestTestMemcheckDummyAddressSanitizer "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyAddressSanitizer/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyAddressSanitizer/testOutput.log" "-DMEMCHECK_TYPE=AddressSanitizer")
set_tests_properties(CTestTestMemcheckDummyAddressSanitizer PROPERTIES  PASS_REGULAR_EXPRESSION ".*Memory checking results:.*heap-buffer-overflow - 1.*")
add_test(CTestTestMemcheckDummyMemorySanitizer "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyMemorySanitizer/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyMemorySanitizer/testOutput.log" "-DMEMCHECK_TYPE=MemorySanitizer")
set_tests_properties(CTestTestMemcheckDummyMemorySanitizer PROPERTIES  PASS_REGULAR_EXPRESSION ".*Memory checking results:.*use-of-uninitialized-value - 1.*")
add_test(CTestTestMemcheckDummyUndefinedBehaviorSanitizer "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyUndefinedBehaviorSanitizer/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyUndefinedBehaviorSanitizer/testOutput.log" "-DMEMCHECK_TYPE=UndefinedBehaviorSanitizer")
set_tests_properties(CTestTestMemcheckDummyUndefinedBehaviorSanitizer PROPERTIES  PASS_REGULAR_EXPRESSION ".*Memory checking results:.*left shift of negative value -256 - 1.*")
add_test(CTestTestMemcheckDummyPurify "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyPurify/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyPurify/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail")
set_tests_properties(CTestTestMemcheckDummyPurify PROPERTIES  PASS_REGULAR_EXPRESSION "
1/1 MemCheck #1: RunCMake \\.+   Passed +[0-9]+\\.[0-9]+ sec

100% tests passed, 0 tests failed out of 1
.*
-- Processing memory checking output:( )
Memory checking results:
((BullseyeCoverage|==)[^
]*
)*\$")
add_test(CTestTestMemcheckDummyValgrind "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrind/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrind/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail")
set_tests_properties(CTestTestMemcheckDummyValgrind PROPERTIES  PASS_REGULAR_EXPRESSION "
1/1 MemCheck #1: RunCMake \\.+   Passed +[0-9]+\\.[0-9]+ sec

100% tests passed, 0 tests failed out of 1
.*
-- Processing memory checking output:( )
Memory checking results:
((BullseyeCoverage|==)[^
]*
)*\$")
add_test(CTestTestMemcheckDummyBC "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyBC/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyBC/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail")
set_tests_properties(CTestTestMemcheckDummyBC PROPERTIES  PASS_REGULAR_EXPRESSION "
1/1 MemCheck #1: RunCMake \\.+   Passed +[0-9]+.[0-9]+ sec

100% tests passed, 0 tests failed out of 1
(.*
)?Error parsing XML in stream at line 1: no element found
")
add_test(CTestTestMemcheckDummyPurifyNoLogfile "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyPurifyNoLogfile/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyPurifyNoLogfile/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/valgrind")
set_tests_properties(CTestTestMemcheckDummyPurifyNoLogfile PROPERTIES  PASS_REGULAR_EXPRESSION "
Cannot find memory tester output file: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyPurifyNoLogfile/Testing/Temporary/MemoryChecker.1.log
(.*
)?Error in read script: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyPurifyNoLogfile/test.cmake
")
add_test(CTestTestMemcheckDummyValgrindNoLogfile "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindNoLogfile/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindNoLogfile/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/valgrind")
set_tests_properties(CTestTestMemcheckDummyValgrindNoLogfile PROPERTIES  PASS_REGULAR_EXPRESSION "
Cannot find memory tester output file: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyValgrindNoLogfile/Testing/Temporary/MemoryChecker.1.log
(.*
)?Error in read script: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyValgrindNoLogfile/test.cmake
")
add_test(CTestTestMemcheckDummyBCNoLogfile "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyBCNoLogfile/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyBCNoLogfile/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/valgrind")
set_tests_properties(CTestTestMemcheckDummyBCNoLogfile PROPERTIES  PASS_REGULAR_EXPRESSION "
Cannot find memory tester output file: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyBCNoLogfile/Testing/Temporary/MemoryChecker.1.log
(.*
)?Error in read script: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyBCNoLogfile/test.cmake
")
add_test(CTestTestMemcheckDummyValgrindPrePost "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindPrePost/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindPrePost/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail")
set_tests_properties(CTestTestMemcheckDummyValgrindPrePost PROPERTIES  PASS_REGULAR_EXPRESSION "
1/1 MemCheck #1: RunCMake \\.+   Passed +[0-9]+\\.[0-9]+ sec

100% tests passed, 0 tests failed out of 1
.*
-- Processing memory checking output:( )
Memory checking results:
((BullseyeCoverage|==)[^
]*
)*\$")
add_test(CTestTestMemcheckDummyValgrindFailPost "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindFailPost/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindFailPost/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail")
set_tests_properties(CTestTestMemcheckDummyValgrindFailPost PROPERTIES  PASS_REGULAR_EXPRESSION "
Problem running command: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck[^
]*fail[^
]*
(.*
)?Problem executing post-memcheck command\\(s\\).
(.*
)?Error in read script: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyValgrindFailPost/test.cmake
")
add_test(CTestTestMemcheckDummyValgrindFailPre "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindFailPre/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindFailPre/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail")
set_tests_properties(CTestTestMemcheckDummyValgrindFailPre PROPERTIES  PASS_REGULAR_EXPRESSION "
Problem running command: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck[^
]*fail[^
]*
(.*
)?Problem executing pre-memcheck command\\(s\\).
(.*
)?Error in read script: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyValgrindFailPre/test.cmake
")
add_test(CTestTestMemcheckDummyValgrindIgnoreMemcheck "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindIgnoreMemcheck/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindIgnoreMemcheck/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail")
set_tests_properties(CTestTestMemcheckDummyValgrindIgnoreMemcheck PROPERTIES  PASS_REGULAR_EXPRESSION "
2/2 Test #2: RunCMakeAgain .*
1/1 MemCheck #1: RunCMake \\.+   Passed +[0-9]+\\.[0-9]+ sec

100% tests passed, 0 tests failed out of 1
.*
-- Processing memory checking output:( )
Memory checking results:
((BullseyeCoverage|==)[^
]*
)*\$")
add_test(CTestTestMemcheckDummyValgrindTwoTargets "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindTwoTargets/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindTwoTargets/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail" "-VV")
set_tests_properties(CTestTestMemcheckDummyValgrindTwoTargets PROPERTIES  PASS_REGULAR_EXPRESSION "
Memory check project /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyValgrindTwoTargets
.*
 *Start 1: RunCMake
(.*
)?Memory check command: .* \"--log-file=/home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyValgrindTwoTargets/Testing/Temporary/MemoryChecker.1.log\" \"-q\".*
 *Start 2: RunCMakeAgain
(.*
)?Memory check command: .* \"--log-file=/home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyValgrindTwoTargets/Testing/Temporary/MemoryChecker.2.log\" \"-q\".*
")
add_test(CTestTestMemcheckDummyValgrindInvalidSupFile "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindInvalidSupFile/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindInvalidSupFile/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail")
set_tests_properties(CTestTestMemcheckDummyValgrindInvalidSupFile PROPERTIES  PASS_REGULAR_EXPRESSION "
Cannot find memory checker suppression file: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/does-not-exist
")
add_test(CTestTestMemcheckDummyValgrindCustomOptions "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindCustomOptions/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindCustomOptions/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail")
set_tests_properties(CTestTestMemcheckDummyValgrindCustomOptions PROPERTIES  PASS_REGULAR_EXPRESSION "
Cannot find memory tester output file: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/DummyValgrindCustomOptions/Testing/Temporary/MemoryChecker.1.log
(.*
)?Error in read script: /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/DummyValgrindCustomOptions/test.cmake
")
add_test(CTestTestMemcheckNotExist "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NotExist/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NotExist/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail")
set_tests_properties(CTestTestMemcheckNotExist PROPERTIES  PASS_REGULAR_EXPRESSION "Memory checker \\(MemoryCheckCommand\\) not set, or cannot find the specified program.")
add_test(CTestTestMemcheckUnknown "/home/pengwu550/leetcode-java/cmake-3.1.1/bin/ctest" "-C" "" "-S" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/Unknown/test.cmake" "-V" "--output-log" "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/Unknown/testOutput.log" "-D" "PSEUDO_BC=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/BC" "-D" "PSEUDO_PURIFY=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/purify" "-D" "PSEUDO_VALGRIND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/valgrind" "-D" "ERROR_COMMAND=/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/memcheck_fail")
set_tests_properties(CTestTestMemcheckUnknown PROPERTIES  PASS_REGULAR_EXPRESSION "Do not understand memory checker: /home/pengwu550/leetcode-java/cmake-3.1.1/Bootstrap.cmk/cmake
(.*
)?Error in read script: /home/pengwu550/leetcode-java/cmake-3\\.1\\.1/Tests/CTestTestMemcheck/Unknown/test.cmake
")
subdirs(NoLogDummyChecker)
