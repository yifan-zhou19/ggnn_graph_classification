package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int k;
		int[] a = new int[105];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 105;j++)
			{
				a[j] = 0;
			}
			l = String.valueOf(c[i]).length();
			System.out.printf("%s\n",c[i]);
			for (j = l - 1;j >= 0;j--)
			{
				if (c[i][j] == '(')
				{
					for (k = j + 1;k < l;k++)
					{
						if (c[i][k] == ')')
						{
							c[i][k] = 0;
							c[i][j] = 0;
							break;
						}
					}
					if (k == l)
					{
						c[i][j] = 0;
						a[j] = 1;
					}
				}
			}
			for (j = 0;j < l;j++)
			{
				if (c[i][j] == ')')
				{
					a[j] = 2;
				}
			}
				for (j = 0;j < l;j++)
				{
					if (a[j] == 1)
					{
						System.out.print("$");
					}
					else if (a[j] == 2)
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

