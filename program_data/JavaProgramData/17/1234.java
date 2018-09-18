package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		int len;
		int i;
		int j;
		int[] a = new int[100];
		while (scanf("%s",c) != EOF)
		{
			if (c.charAt(0) == '\0')
			{
				break;
			}
			System.out.printf("%s\n",c);
			len = c.length();
			for (i = 0;i < len;i++)
			{
				if (c.charAt(i) == '(')
				{
					a[i] = -1;
				}
				else
				{
					if (c.charAt(i) == ')')
					{
						a[i] = 1;
						for (j = i - 1;j >= 0;j--)
						{
							if (a[j] == -1)
							{
								a[j] = 0;
								a[i] = 0;
								break;
							}
						}
					}
					else
					{
						a[i] = 0;
					}
				}
			}
			for (i = 0;i < len;i++)
			{
				if (a[i] == -1)
				{
					System.out.print("$");
				}
				if (a[i] == 1)
				{
					System.out.print("?");
				}
				if (a[i] == 0)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}







}
