# -*- coding: utf-8 -*-
"""
Created on Mon Apr 15 20:30:55 2024

@author: MATHLIN SARORAI
"""

from itertools import product
from collections import defaultdict

def calc_probs(die_a, die_b):
    probs = defaultdict(int)
    for roll in product(die_a, die_b):
        probs[sum(roll)] += 1
    total_rolls = len(die_a) * len(die_b)
    return {str(k): v / total_rolls for k, v in probs.items()}

def transform_dice(die_a, die_b):
    orig_probs = calc_probs(die_a, die_b)
    
    new_die_a, new_die_b = None, None
    fixed_a, fixed_b = {1, 4}, {1, 8}
    input_a, input_b = set(range(1, 5)), set(range(2, 8))
    for a in product(input_a, repeat=4):
        if fixed_a.issubset(set(a)):
            for b in product(input_b, repeat=4):
                if fixed_b.issubset(set(b)):
                    if sum(a) + sum(b) == 42 and orig_probs == calc_probs(a, b):
                        new_die_a, new_die_b = tuple(sorted(a)), tuple(sorted(b))
                        break
    return new_die_a, new_die_b
def DoomedDice():
    die_a, die_b = (1, 2, 3, 4, 5, 6), (1, 2, 3, 4, 5, 6)
    new_die_a, new_die_b = transform_dice(die_a, die_b)
    print("New Die A:", new_die_a)
    print("New Die B:", new_die_b)
DoomedDice()
