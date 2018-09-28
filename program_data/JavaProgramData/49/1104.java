package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int r = 0;
		int k;
		int p;
		int q;
		int m;
		int n;
		for (i = 0;i < 500;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			r++;
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		r = r - 1;
		for (j = 1;j <= r - 1;j++)
		{
			for (k = 0;k < r;k++)
			{
				m = 0;
				p = r;
				q = j;
				for (i = k;i <= k + j / 2;i++)
				{
					if (a.charAt(i) == a.charAt(i + q))
					{
						q = q - 2;
						m++;
					}
					else
					{
						break;
					}
				}
				if (m == (j + 1) / 2)
				{
					for (n = k;n <= k + j;n++)
					{
						 System.out.printf("%c",a.charAt(n));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

