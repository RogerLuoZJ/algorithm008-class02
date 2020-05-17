package Week_04;

import java.util.Arrays;

//https://leetcode-cn.com/problems/assign-cookies/description/
public class FindContentChildren {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int num = 0;
        while (i < g.length && j < s.length ){
            if ( s[j] >= g[i] ){
                i++;
                j++;
                num++;
            } else if (s[j] < g[i]) {
                j++;
            }
        }
        return num;

    }

}
