from typing import List
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group = {}
        for items in strs:
            key = "".join(sorted(items))
            if key not in group:
                group[key] = []
            group[key].append(items)
        return list(group.values())