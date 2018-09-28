package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int an;
		int bn;
		int[] c = new int[100];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			an = a.length();
			bn = b.length();
			for (j = 0;j < an;j++)
			{
				if (j < an - bn)
				{
					c[j] = a.charAt(j) - 48;
				}
				else
				{
					if (a.charAt(j) >= b.charAt(j + bn - an))
					{
						c[j] = a.charAt(j) - b.charAt(j + bn - an);
					}
					else
					{
						c[j] = a.charAt(j) + 10 - b.charAt(j + bn - an);
						if (c[j - 1] != 0)
						{
							c[j - 1] = c[j - 1] - 1;
						}
						else
						{
							if (c[j - 2] != 0)
							{
								c[j - 1] = 9;
								c[j - 2] = c[j - 2] - 1;
							}
							else
							{
								if (c[j - 3] != 0)
								{
							c[j - 1] = 9;
							c[j - 2] = 9;
							c[j - 3] = c[j - 3] - 1;
								}
							}
						}
					}
				}
			}
			for (j = 0;j < an;j++)
			{
				System.out.printf("%d",c[j]);
				if (j == an - 1)
				{
					System.out.print("\n");
				}
			}
		}
	}

}

