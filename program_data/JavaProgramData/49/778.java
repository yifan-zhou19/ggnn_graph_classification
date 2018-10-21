import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	*8-4
	*??? 1200012851
	*????
	*2012.11.13
	**/
	public static int Main()
	{
		String str = new String(new char[500]);
		int i;
		int j;
		int m;
		int k;
		int t;
		int len;
		int flag = 1;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 2; i <= len; i++)
		{
			for (m = 0; m <= len - i; m++)
			{
				flag = 1;
				if (str.charAt(m) != str.charAt(m + i - 1))
				{
					continue;
				}
				else
				{
					k = m + 1;
					t = m + i - 2;
					while (k < t)
					{
						if (str.charAt(k) != str.charAt(t))
						{
							flag = 0;
						}
						k++;
						t--;
					}
					if (flag != 0)
					{
						for (j = m; j <= m + i - 1; j++)
						{
							System.out.print(str.charAt(j));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}
