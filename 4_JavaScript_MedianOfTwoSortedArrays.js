/**
 * @Tegan Jennings
 * @01/11/2022
 */
var findMedianSortedArrays = function(nums1, nums2) {
    const mergedArray = nums1.concat(nums2);
    mergedArray.sort((a, b) => a - b);

    const middleLeft = Math.floor(mergedArray.length / 2);

    if (mergedArray.length % 2) {
        return mergedArray[middleLeft];
    } else {
        return (mergedArray[middleLeft] + mergedArray[middleLeft + 1]) / 2;
    }
};

