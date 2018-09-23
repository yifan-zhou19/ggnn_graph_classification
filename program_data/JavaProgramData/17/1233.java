package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[102]);
		int i;
		int j;
		int L;
		int k;
		int[] b = new int[102];
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < 102;i++)
			{
				a = a.substring(0, i);
				b[i] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			System.out.printf("%s\n",a);
		L = a.length();
			for (i = L - 1;i >= 0;i--)
			{
				if (a.charAt(i) == '(')
				{
					for (j = i + 1;j < L;j++)
					{
						if (a.charAt(j) == ')')

						{
							a = a.substring(0, i);
							a = a.substring(0, j);
							break;
						}
					}
				if (j == L)
				{
					b[i] = 1;
				}
				}
			}

			for (i = 0;i < L;i++)
			{
				if (a.charAt(i) == ')')
				{
				 b[i] = 2;
				}

			}
			for (i = 0;i < L;i++)
			{
				if (b[i] == 1)
				{
					System.out.print("$");
				}
				else if (b[i] == 2)
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

