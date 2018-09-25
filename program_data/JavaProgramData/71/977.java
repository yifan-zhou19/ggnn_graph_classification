package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int c;
		int sum;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				if (b < c)
				{
					for (j = b,sum = 0;j < c;j++)
					{
						if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
						{
							sum = sum + 31;
						}
						else if (j == 4 || j == 6 || j == 9 || j == 11)
						{
							sum = sum + 30;
						}
						else
						{
							sum = sum + 29;
						}
					}
					if (sum % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				else if (b > c)
				{
					for (j = c,sum = 0;j < b;j++)
					{
						if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
						{
							sum = sum + 31;
						}
						else if (j == 4 || j == 6 || j == 9 || j == 11)
						{
							sum = sum + 30;
						}
						else
						{
							sum = sum + 29;
						}
					}
					if (sum % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				else if (b == c)
				{
					System.out.print("YES\n");
				}
			}
			else
			{
				if (b < c)
				{
					for (j = b,sum = 0;j < c;j++)
					{
						if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
						{
							sum = sum + 31;
						}
						else if (j == 4 || j == 6 || j == 9 || j == 11)
						{
							sum = sum + 30;
						}
						else
						{
							sum = sum + 28;
						}
					}
					if (sum % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				else if (b > c)
				{
					for (j = c,sum = 0;j < b;j++)
					{
						if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
						{
							sum = sum + 31;
						}
						else if (j == 4 || j == 6 || j == 9 || j == 11)
						{
							sum = sum + 30;
						}
						else
						{
							sum = sum + 28;
						}
					}
					if (sum % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				else if (b == c)
				{
					System.out.print("YES\n");
				}
			}
		}
	}

}

