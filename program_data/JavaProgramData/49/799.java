import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[505]);
		int i;
		int j;
		int m;
		int length;
		int[][] a = new int[255][505];
		int flag = 0;
		str = new Scanner(System.in).nextLine();
		length = str.length();
		for (i = 0; i < length - 1; i++)
		{
			if (str.charAt(i) == str.charAt(i + 1))
			{
				a[0][i] = 1;
				j = 1;
				while (i + j + 1 < length && i - j >= 0)
				{
					if (str.charAt(i - j) == str.charAt(i + j + 1))
					{
						a[j][i] = 1;
						j++;
					}
					else
					{
						break;
					}
				}
			}
		}
		for (i = 0; i < length / 2; i++)
		{
			for (j = 0; j < length - 1; j++)
			{
				if (a[i][j] == 1)
				{
					flag = 1;
					for (m = j - i; m <= j + 1 + i; m++)
					{
						System.out.print(str.charAt(m));
					}
				}
				if (flag == 1)
				{
					System.out.print("\n");
					flag = 0;
				}
			}
		}
		return 0;
	}
}
