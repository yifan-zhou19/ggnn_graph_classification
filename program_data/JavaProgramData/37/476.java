package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int k;
		int i;
		int j;
		int n;
		int p;
		int flag = 0;
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (k = 1;k <= t;k++)
		{
			flag = 0;

			a = new Scanner(System.in).nextLine();
			n = a.length();
			for (i = 0;i < n;i++)
			{
				if (i == 0)
				{
					for (j = i + 1;j < n;j++)
					{
						if (a.charAt(j) == a.charAt(i))
						{
						break;
						}
					}
					if (j == n)
					{
						System.out.printf("%c\n",a.charAt(i));
						flag = 1;
						i = n;
					}
				}
				if (i == n - 1)
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (a.charAt(j) == a.charAt(i))
						{
							break;
						}
					}
					if (j == -1)
					{
						System.out.printf("%c\n",a.charAt(i));
						flag = 1;
						i = n;
					}
				}
				if (i > 0 && i < n - 1)
				{
					for (j = i + 1;j < n;j++)
					{
						if (a.charAt(j) == a.charAt(i))
						{
						break;
						}
					}
					if (j == n)
					{
						for (p = i - 1;p >= 0;p--)
						{
							if (a.charAt(p) == a.charAt(i))
							{
								break;
							}
						}
						if (p == -1)
						{
							System.out.printf("%c\n",a.charAt(i));
							flag = 1;
							i = n;
						}
					}
				}


			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
		}


		return 0;
	}
}

