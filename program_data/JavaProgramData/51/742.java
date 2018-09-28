package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[5]);
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
		int l;
		int m;
		int max;
		int[] c = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < 500;i++)
		{
			c[i] = 0;
		}
		l = a.length();
		for (i = 0;i < l - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j + i));
			}
			for (k = i;k < l - n + 1;k++)
			{
				m = 0;
				for (j = 0;j < n;j++)
				{
					if (b.charAt(j) != a.charAt(k + j))
					{
						m++;
					}
				}
				if (m == 0)
				{
					c[i]++;
				}
			}
		}
		max = c[0];
		for (i = 0;i < l - n + 1;i++)
		{
		if (c[i] > max)
		{
		max = c[i];
		}
		}
		if (max != 1)
		{
			System.out.print(max);
			System.out.print("\n");
		}
		for (i = 0;i < l - n + 1;i++)
		{
			if (c[i] == max)
			{
				if (max == 1)
				{
					System.out.print("NO");
					break;
				}
			for (j = 0;j < n;j++)
			{
			System.out.print(a.charAt(i + j));
			}
			System.out.print("\n");
			}
		}
		return 0;
	}



}

