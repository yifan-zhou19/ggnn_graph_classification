package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		String a = new String(new char[110]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int[] b = new int[110];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			m = a.length();
			for (j = 0;j < m;j++)
			{
				if (a.charAt(j) == '(')
				{
					b[j] = 1;
				}
				else if (a.charAt(j) == ')')
				{
					b[j] = -1;
				}
			}
			for (j = m - 1;j >= 0;j--)
			{
				if (b[j] == 1)
				{
					for (k = j;k < m;k++)
					{
						if (b[k] == -1)
						{
							b[j] = 0;
							b[k] = 0;
							break;
						}
					}
				}
			}
			for (k = 0;k < m;k++)
			{
				System.out.printf("%c",a.charAt(k));
			}
			System.out.print("\n");
			for (k = 0;k < m;k++)
			{
				if (b[k] == 1)
				{
					System.out.print("$");
				}
				else if (b[k] == -1)
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

