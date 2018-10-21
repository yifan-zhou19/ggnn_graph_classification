import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ??
	* @date 2010?11?26
	* @description
	* ??????: ?????   
	*/
	public static int Main()
	{
		int[][] a = new int[2000][2]; //????
		int i = 0;
		int j = 0;
		int k;
		int l;
		int l1;
		int l2;
		int m;
		int n;
		int maxt;
		int mint;
		int q;
		int g = 0;
		int max = 0;
		String b = new String(new char[9000]); //??????????
		String c = new String(new char[9000]);
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine(); //??
		l1 = b.length();
		l2 = c.length();
		for (k = 0;k < l1;k++)
		{
			if (b.charAt(k + 1) == ',' || b.charAt(k + 1) == '\0')
			{
				a[i][0] = b.charAt(k) - '0';
				i++;
				k = k + 1;
				continue;
			}
			else
			{
				if (b.charAt(k + 2) == ',' || b.charAt(k + 2) == '\0')
				{
					m = b.charAt(k) - '0';
					n = b.charAt(k + 1) - '0';
					a[i][0] = 10 * m + n;
					i++;
					k = k + 2;
					continue;
				}
				if (b.charAt(k + 3) == ',' || b.charAt(k + 3) == '\0')
				{
					m = b.charAt(k) - '0';
					n = b.charAt(k + 1) - '0';
					q = b.charAt(k + 2) - '0';
					a[i][0] = 100 * m + 10 * n + q;
					i++;
					k = k + 3;
					continue;
				}
			}
		} //????????
		for (k = 0;k < l2;k++)
		{
			if (c.charAt(k + 1) == ',' || c.charAt(k + 1) == '\0')
			{
				a[j][1] = c.charAt(k) - '0';
				j++;
				k = k + 1;
				continue;
			}
			else
			{
				if (c.charAt(k + 2) == ',' || c.charAt(k + 2) == '\0')
				{
					m = c.charAt(k) - '0';
					n = c.charAt(k + 1) - '0';
					a[j][1] = 10 * m + n;
					j++;
					k = k + 2;
					continue;
				}
			}
				if (c.charAt(k + 3) == ',' || c.charAt(k + 3) == '\0')
				{
					m = c.charAt(k) - '0';
					n = c.charAt(k + 1) - '0';
					q = c.charAt(k + 2) - '0';
					a[j][1] = 100 * m + 10 * n + q;
					j++;
					k = k + 3;
					continue;
				}
		} //????????
		mint = a[0][0];
		maxt = a[0][1];
		for (k = 1;k < i;k++)
		{
			if (mint > a[k][0])
			{
				mint = a[k][0];
			}
			if (maxt < a[k][1])
			{
				maxt = a[k][1];
			}
		} //????????
		for (k = mint;k <= maxt;k++)
		{

				g = 0;
				for (l = 0;l < i;l++)
				{
					if (a[l][0] <= k != 0 && a[l][1] > k)
					{
						g++;
					}
				}
				if (max < g)
				{
					max = g;
				}
		} //??
		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}
}
