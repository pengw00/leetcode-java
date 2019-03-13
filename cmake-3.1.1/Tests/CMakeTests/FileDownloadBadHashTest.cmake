set(url "file:///home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CMakeTests/FileDownloadInput.png")
set(dir "/home/pengwu550/leetcode-java/cmake-3.1.1/Tests/CMakeTests/downloads")

file(DOWNLOAD
  ${url}
  ${dir}/file3.png
  TIMEOUT 2
  STATUS status
  EXPECTED_HASH SHA1=5555555555555555555555555555555555555555
  )
