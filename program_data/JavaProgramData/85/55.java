package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[220]);
		int n;
		int i;
		int j;
		int l1 = 0;
		int l2 = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l1 = 1;
			for (m = 0;m <= 9;m++)
			{
				if (s.charAt(0) == 48 + m)
				{
					l1 = 0;
					l2 = 0;
					m = 20;
				}
			}
			if (l1 == 1)
			{
				l2 = 1;
				for (j = 0;s.charAt(j) != '\0';j++)
				{
					for (m = 0;m <= 14;m++)
					{
						if (s.charAt(j) == 33 + m)
						{
							l2 = 0;
							m = 30;
						}
					}
				}
				if (l2 == 1)
				{
					for (j = 0;s.charAt(j) != '\0';j++)
					{
						for (m = 0;m <= 6;m++)
						{
							if (s.charAt(j) == 58 + m)
							{
							l2 = 0;
							m = 30;
							}
						}
					}
					if (l2 == 1)
					{
						for (j = 0;s.charAt(j) != '\0';j++)
						{
							for (m = 0;m <= 5;m++)
							{
								if ((s.charAt(j) == 91 + m) && (s.charAt(j) != '_'))
								{
									l2 = 0;
									m = 30;
								}
							}
						}
						if (l2 == 1)
						{
							for (j = 0;s.charAt(j) != '\0';j++)
							{
								for (m = 0;m <= 3;m++)
								{
									if (s.charAt(j) == 123 + m)
									{
										l2 = 0;
										m = 30;
									}
								}
							}
						}
					}
				}
			}
			if (l2 == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

