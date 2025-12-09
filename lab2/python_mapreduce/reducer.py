#!/usr/bin/env python
from operator import itemgetter
import sys

current_word = None
current_count = 0

for line in sys.stdin:
    line = line.strip()
    if not line:
        continue
        
    try:
        word, count = line.split('\t', 1)
        count = int(count)
    except:
        continue
    
    if word == current_word:
        current_count += count
    else:
        if current_word:
            print(f"{current_word}\t{current_count}")
        current_word = word
        current_count = count

if current_word:
    print(f"{current_word}\t{current_count}")