package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[305]);
		int i;
		int j;
		int p = 0;
		int n;
		int[] a = new int[52];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		n = str1.length();
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 'A';j <= 'Z';j++)
			{
				if (str1.charAt(i) == j)
				{
					a[j - 'A'] = a[j - 'A'] + 1;
					p++;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 'a';j <= 'z';j++)
			{
				if (str1.charAt(i) == j)
				{
					a[j + 26 - 'a']++;
					p++;
				}
			}
		}
		for (i = 0;i <= 51;i++)
		{
			if (p == 0)
			{
				System.out.print("No\n");
				break;
			}
			else
			{
				if (a[i] != 0 && i <= 25 && i >= 0)
				{
					System.out.printf("%c=%d\n",i + 'A',a[i]);
				}
				else
				{
					if (a[i] != 0 && i <= 51 && i >= 26)
					{
						System.out.printf("%c=%d\n",(i - 26 + 'a'),a[i]);
					}
					else
					{
						if (a[i] == 0)
						{
							continue;
						}
					}
				}
			}
		}
	}
}

