学习笔记

### MoveZeros
这个题一开始使用了一个比较纯的方法
    
    public void moveZeroes(int[] nums) {
        int zeroPoint = -1;
        for ( int i = 0 ; i < nums.length ; i++) {
            if ( nums[i] == 0 ) {
                if ( zeroPoint == -1 ) {
                    zeroPoint = i;
                }
            } else {
                if ( zeroPoint != -1 && zeroPoint < i ){
                    nums[zeroPoint] = nums[i] ;
                    nums[i] = 0;
                    zeroPoint = -1;
                    for ( int j = zeroPoint + 1 ; j <= i ; j ++) {
                        if ( nums[j] == 0 ) {
                            zeroPoint = j;
                            break;
                        }
                    }
                }
            }
        }

    }
这个方法太顾虑0的位置,后续思考后马上做第二遍。暴力的把前面非0位数置为遍历数字，速度快了很多
    
        public void moveZeroes(int[] nums) {
            int notZeroNum = 0;
            for ( int i = 0 ; i < nums.length ; i++) {
                if ( nums[i] != 0 ) {
                    nums[notZeroNum] = nums[i];
                    notZeroNum++;
                }
            }
    
            if ( notZeroNum == nums.length ) {
                return;
            }
    
            for ( int i = notZeroNum ; i < nums.length; i++) {
                nums[i] = 0;
            }
        }

