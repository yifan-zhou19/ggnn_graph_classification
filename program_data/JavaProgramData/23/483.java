import java.util.*;

package <missing>;

public class GlobalMembers
{
	/* * dancidaopai.cpp
	 *
	 *  Created on: 2012-11-21
	 *      Author: Lenovo
	 */
	public static int Main()
	{
		String s = new String(new char[105]);
		char[][] v = new char[100][100];
		String m = new String(new char[100]);
		int i;
		int j = 0;
		int k = 0;
		int p;
		int[] num = new int[100];
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != ' ')
			{
				v[k][j] = s.charAt(i);
				j = j + 1;
			}
			if (s.charAt(i) == ' ')
			{
				num[k] = j;
				k = k + 1;
				j = 0;
			}

		}
		num[k] = j;
		for (i = 0;i <= k / 2;i++)
		{
			m = v[i];
			p = num[i];
			v[i] = v[k - i];
			num[i] = num[k - i];
			v[k - i] = m;
			num[k - i] = p;
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < num[i];j++)
			{
				System.out.print(v[i][j]);
			}
		System.out.print(' ');
		}
		for (i = 0;i < num[k];i++)
		{
			System.out.print(v[k][i]);
		}
	return 0;
	}

}
