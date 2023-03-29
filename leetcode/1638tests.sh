#!/bin/zsh

# Define test cases
tests=(
  "aba baba"
  "ab bb"
  "a a"
  "abe bbc"
  "abbab bbbbb"
)

# Define expected outputs
expected_outputs=(
  6
  3
  0
  10
  33
)
i=0
for test in "${tests[@]}"; do
  # Split test string into s and t
  s=${test// / }
  t=${s#* }
  s=${s%% *}

  # Compile the Java program
  javac -d ./ ./leetcode/1638.java

  # Run the Java program and compare output with expected output
  output=$(java Solution "${s}" "${t}")
  expected_output=${expected_outputs[$((i+1))]}
  if [ "$output" -eq "$expected_output" ]; then
    echo "Test case $i is correct."
  else
    echo "Test case $i is incorrect.\n s is '${s}', t is '${t}' Expected '$expected_output', but got '$output'"
  fi
  i=$((i+1))

  # Clean up generated class files
  rm ./*.class
done
