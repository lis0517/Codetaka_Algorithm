class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();
        
        int[] currentPos = findStartPosition(park);
        
        for (String route : routes) {
            String[] command = route.split(" ");
            String direction = command[0];
            int distance = Integer.parseInt(command[1]);
            
            int newRow = currentPos[0];
            int newCol = currentPos[1];
            
            switch (direction) {
                case "N":
                    newRow -= distance;
                    break;
                case "S":
                    newRow += distance;
                    break;
                case "W":
                    newCol -= distance;
                    break;
                case "E":
                    newCol += distance;
                    break;
            }
            
            if (isValidMove(park, currentPos[0], currentPos[1], newRow, newCol)) {
                currentPos[0] = newRow;
                currentPos[1] = newCol;
            }
        }
        
        return currentPos;
    }
    
    private int[] findStartPosition(String[] park) {
        int h = park.length;
        int w = park[0].length();
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    return new int[]{i, j};
                }
            }
        }
        
        return new int[]{0, 0};
    }
    
    private boolean isValidMove(String[] park, int startRow, int startCol, int endRow, int endCol) {
        int h = park.length;
        int w = park[0].length();
        
        if (endRow < 0 || endRow >= h || endCol < 0 || endCol >= w) {
            return false;
        }
        
        int rowStep = (endRow - startRow) == 0 ? 0 : (endRow - startRow) / Math.abs(endRow - startRow);
        int colStep = (endCol - startCol) == 0 ? 0 : (endCol - startCol) / Math.abs(endCol - startCol);
        
        int row = startRow;
        int col = startCol;
        
        while (row != endRow || col != endCol) {
            row += rowStep;
            col += colStep;
            
            if (park[row].charAt(col) == 'X') {
                return false;
            }
        }
        
        return true;
    }
}