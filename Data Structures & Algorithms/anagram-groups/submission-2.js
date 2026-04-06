class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const map=new Map();
        for(let word of strs){
            let sortedWord=word.split('').sort().join('')
            if(!map.has(sortedWord)) map.set(sortedWord,[])
            map.get(sortedWord).push(word)
        }
        return Array.from(map.values());
    }
}
