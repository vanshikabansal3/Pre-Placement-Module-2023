class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        int c=image[sr][sc];
         image[sr][sc]=color;
        if(sc>0 && image[sr][sc-1] ==c)
            floodFill(image, sr, sc-1,color);
        
        if(sc<image[sr].length-1 && image[sr][sc+1] ==c) 
            floodFill(image,sr,sc+1,color);
        
        if(sr>0 && image[sr-1][sc] ==c) 
            floodFill(image, sr-1, sc,color);
        if(sr<image.length-1 && image[sr+1][sc]==c) 
            floodFill(image, sr+1, sc,color);
        
        return image;
    }
}
