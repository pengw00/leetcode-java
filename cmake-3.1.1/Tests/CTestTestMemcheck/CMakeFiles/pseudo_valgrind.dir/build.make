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
include Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/depend.make

# Include the progress variables for this target.
include Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/progress.make

# Include the compile flags for this target's objects.
include Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/flags.make

Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o: Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/flags.make
Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o: Tests/CTestTestMemcheck/ret0.cxx
	$(CMAKE_COMMAND) -E cmake_progress_report /home/pengwu550/leetcode-java/cmake-3.1.1/CMakeFiles $(CMAKE_PROGRESS_1)
	@echo "Building CXX object Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o"
	cd /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck && /usr/bin/g++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o -c /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/ret0.cxx

Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.i: cmake_force
	@echo "Preprocessing CXX source to CMakeFiles/pseudo_valgrind.dir/ret0.cxx.i"
	cd /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -E /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/ret0.cxx > CMakeFiles/pseudo_valgrind.dir/ret0.cxx.i

Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.s: cmake_force
	@echo "Compiling CXX source to assembly CMakeFiles/pseudo_valgrind.dir/ret0.cxx.s"
	cd /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -S /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/ret0.cxx -o CMakeFiles/pseudo_valgrind.dir/ret0.cxx.s

Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o.requires:
.PHONY : Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o.requires

Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o.provides: Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o.requires
	$(MAKE) -f Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/build.make Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o.provides.build
.PHONY : Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o.provides

Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o.provides.build: Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o

# Object files for target pseudo_valgrind
pseudo_valgrind_OBJECTS = \
"CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o"

# External object files for target pseudo_valgrind
pseudo_valgrind_EXTERNAL_OBJECTS =

Tests/CTestTestMemcheck/valgrind: Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o
Tests/CTestTestMemcheck/valgrind: Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/build.make
Tests/CTestTestMemcheck/valgrind: Source/libCMakeLib.a
Tests/CTestTestMemcheck/valgrind: Source/kwsys/libcmsys.a
Tests/CTestTestMemcheck/valgrind: Utilities/cmexpat/libcmexpat.a
Tests/CTestTestMemcheck/valgrind: Utilities/cmlibarchive/libarchive/libcmlibarchive.a
Tests/CTestTestMemcheck/valgrind: Utilities/cmliblzma/libcmliblzma.a
Tests/CTestTestMemcheck/valgrind: Utilities/cmbzip2/libcmbzip2.a
Tests/CTestTestMemcheck/valgrind: Utilities/cmcompress/libcmcompress.a
Tests/CTestTestMemcheck/valgrind: Utilities/cmcurl/libcmcurl.a
Tests/CTestTestMemcheck/valgrind: Utilities/cmzlib/libcmzlib.a
Tests/CTestTestMemcheck/valgrind: Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/link.txt
	@echo "Linking CXX executable valgrind"
	cd /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/pseudo_valgrind.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/build: Tests/CTestTestMemcheck/valgrind
.PHONY : Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/build

Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/requires: Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/ret0.cxx.o.requires
.PHONY : Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/requires

Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/clean:
	cd /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck && $(CMAKE_COMMAND) -P CMakeFiles/pseudo_valgrind.dir/cmake_clean.cmake
.PHONY : Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/clean

Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/depend:
	cd /home/pengwu550/leetcode-java/cmake-3.1.1 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/pengwu550/leetcode-java/cmake-3.1.1 /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck /home/pengwu550/leetcode-java/cmake-3.1.1 /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck /home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Tests/CTestTestMemcheck/CMakeFiles/pseudo_valgrind.dir/depend

