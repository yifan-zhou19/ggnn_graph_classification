package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j;
		int k;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
		}
		for (j = 0;j < 6;j++)
		{
			if (strcmp(a[j],"0") == 0 || strcmp(a[j],"-0") == 0)
			{
				System.out.print("0\n");
			}
			else
			{
				if (a[j][0] == '-')
				{
					System.out.print("-");
					for (i = 9;i > 0;i--)
					{
						if (a[j][i] != '0' && a[j][i] != '\0')
						{
							System.out.printf("%c",a[j][i]);
							break;
						}
					}
					for (k = i - 1;k > 0;k--)
					{
						System.out.printf("%c",a[j][k]);
					}
					System.out.print("\n");
				}
				else
				{
					for (i = 9;i >= 0;i--)
					{
						if (a[j][i] != '0' && a[j][i] != '\0')
						{
							System.out.printf("%c",a[j][i]);
							break;
						}
					}
					for (k = i - 1;k >= 0;k--)
					{
						System.out.printf("%c",a[j][k]);
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

