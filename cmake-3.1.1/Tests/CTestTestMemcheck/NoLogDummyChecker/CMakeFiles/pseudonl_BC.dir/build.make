# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.1

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list

# Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /home/pengwu550/leetcode-java/cmake-3.1.1/Bootstrap.cmk/cmake

# The command to remove a file.
RM = /home/pengwu550/leetcode-java/cmake-3.1.1/Bootstrap.cmk/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/pengwu550/leetcode-java/cmake-3.1.1

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/pengwu550/leetcode-java/cmake-3.1.1

# Include any dependencies generated for this target.
include Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/depend.make

# Include the progress variables for this target.
include Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/progress.make

# Include the compile flags for this target's objects.
include Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/flags.make

Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o: Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/flags.make
Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o: Tests/CTestTestMemcheck/NoLogDummyChecker/ret0.c
	$(CMAKE_COMMAND) -E cmake_progress_report /home/pengwu550/leetcode-java/cmake-3.1.1/CMakeFiles $(CMAKE_PROGRESS_1)
	@echo "Building C object Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o"
	cd /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker && /usr/bin/gcc  $(C_DEFINES) $(C_FLAGS) -o CMakeFiles/pseudonl_BC.dir/ret0.c.o   -c /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/ret0.c

Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.i: cmake_force
	@echo "Preprocessing C source to CMakeFiles/pseudonl_BC.dir/ret0.c.i"
	cd /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker && /usr/bin/gcc  $(C_DEFINES) $(C_FLAGS) -E /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/ret0.c > CMakeFiles/pseudonl_BC.dir/ret0.c.i

Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.s: cmake_force
	@echo "Compiling C source to assembly CMakeFiles/pseudonl_BC.dir/ret0.c.s"
	cd /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker && /usr/bin/gcc  $(C_DEFINES) $(C_FLAGS) -S /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/ret0.c -o CMakeFiles/pseudonl_BC.dir/ret0.c.s

Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o.requires:
.PHONY : Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o.requires

Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o.provides: Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o.requires
	$(MAKE) -f Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/build.make Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o.provides.build
.PHONY : Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o.provides

Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o.provides.build: Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o

# Object files for target pseudonl_BC
pseudonl_BC_OBJECTS = \
"CMakeFiles/pseudonl_BC.dir/ret0.c.o"

# External object files for target pseudonl_BC
pseudonl_BC_EXTERNAL_OBJECTS =

Tests/CTestTestMemcheck/NoLogDummyChecker/BC: Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o
Tests/CTestTestMemcheck/NoLogDummyChecker/BC: Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/build.make
Tests/CTestTestMemcheck/NoLogDummyChecker/BC: Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/link.txt
	@echo "Linking C executable BC"
	cd /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/pseudonl_BC.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/build: Tests/CTestTestMemcheck/NoLogDummyChecker/BC
.PHONY : Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/build

Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/requires: Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/ret0.c.o.requires
.PHONY : Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/requires

Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/clean:
	cd /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker && $(CMAKE_COMMAND) -P CMakeFiles/pseudonl_BC.dir/cmake_clean.cmake
.PHONY : Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/clean

Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/depend:
	cd /home/pengwu550/leetcode-java/cmake-3.1.1 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/pengwu550/leetcode-java/cmake-3.1.1 /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker /home/pengwu550/leetcode-java/cmake-3.1.1 /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Tests/CTestTestMemcheck/NoLogDummyChecker/CMakeFiles/pseudonl_BC.dir/depend

