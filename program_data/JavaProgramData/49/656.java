import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[510]);
		int[][] a = new int[125000][3]; //??????
		int n = 0;
		int m = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		ch = new Scanner(System.in).nextLine();
		while (ch.charAt(n) != '\0') //???????
		{
			n++;
		}
		for (k = 0;k < n;k++) //??????
		{
			for (i = k + 1;i < n;i++)
			{
				int count = 0;
				for (j = k;j <= i;j++)
				{
					if (ch.charAt(j) == ch.charAt(k + i - j))
					{
						count++;
					}
				}
				if (count == i - k + 1) //???????
				{
					a[m][1] = k; //????
					a[m][2] = i; //????
					a[m][0] = i - k + 1; //??
					m++; //????????
				}
			}
		}
		for (k = 0;k < m - 1;k++) //?????
		{
			for (i = 0;i < m - 1 - k;i++)
			{
				if (a[i][0] > a[i + 1][0])
				{
					int t = 0;
					t = a[i][0];
					a[i][0] = a[i + 1][0];
					a[i + 1][0] = t;
					t = a[i][1];
					a[i][1] = a[i + 1][1];
					a[i + 1][1] = t;
					t = a[i][2];
					a[i][2] = a[i + 1][2];
					a[i + 1][2] = t;
				}
			}
		}
		for (k = 0;k < m;k++)
		{
			for (i = a[k][1];i <= a[k][2];i++)
			{
				System.out.print(ch.charAt(i));
			}
			System.out.print('\n');
		}
		return 0;
	}
}
