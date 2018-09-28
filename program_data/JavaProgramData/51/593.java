import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**  
	* @file   homework.cpp  
	* @author ??? 
	* @date   2013-12-12 
	* @description 
	*          ??????: n-gram????    
	*/ 
	public static int Main()
	{
		int a;
		String b = new String(new char[502]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		b = new Scanner(System.in).nextLine();
		int len = b.length();
		char[][] c = new char[502][4];
		int i;
		int j;
		int k;
		for (i = 0 ; i <= len - a ; i++) //????
		{
			for (j = 0 ; j < a ; j++)
			{
				c[i][j] = b.charAt(i + j);
			}
		}
		int[] d = new int[502]; //????
		for (i = 0 ; i < len - a ;i++)
		{
			for (j = i + 1 ; j <= len - a ; j++)
			{
				for (k = 0 ; k < a ; k++)
				{
					if (c[i][k] != c[j][k])
					{
						break;
					}
				}
				if (k == a)
				{
					d[i]++;
				}
			}
		}
		int max = INT_MIN;
		for (i = 0 ; i < len - a ; i++)
		{
			if (d[i] >= max)
			{
				max = d[i];
			}
		}
		if (max >= 1)
		{
			System.out.print(max + 1);
			System.out.print("\n");
			for (i = 0 ; i < len - a ; i++)
			{
				if (d[i] == max)
				{
					for (j = 0 ; j < a ; j++)
					{
						 System.out.print(c[i][j]);
					}
					System.out.print("\n");
				}
			}
		}
		else
		{
			System.out.print("NO");
		}

		return 0;
	}
}

