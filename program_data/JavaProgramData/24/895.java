package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		char[][] c = new char[100][50];
		int[] a = new int[50];
		int i;
		int j = 0;
		int k = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != 0;i++)
		{
			if (s.charAt(i) != ' ')
			{
			c[j][k] = s.charAt(i);
			k++;
			}
			else
			{
				c[j][k + 1] = 0;
				k = 0;
				j++;
			}
		}
		c[j][k + 1] = 0;
		int n = j;
		for (i = 0;i <= n;i++)
		{
			for (j = 0;j <= n - i - 1;j++)
			{
				if (String.valueOf(c[j]).length() <= String.valueOf(c[j + 1]).length())
				{
					String p = new String(new char[50]);
				p = c[j];
				c[j] = c[j + 1];
				c[j + 1] = p;
				}
			}
		}
		System.out.print(c[0]);
		System.out.print("\n");
		System.out.print(c[n]);
		System.out.print("\n");
		return 0;
	}



}
