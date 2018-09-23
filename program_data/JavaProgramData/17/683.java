package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		String a = new String(new char[101]);
		int i;
		int j;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			System.out.printf("%s\n",a);
			for (i = 0;i < a.length();i++)
			{
				if (a.charAt(i) == 40)
				{
					if (i == a.length() - 1)
					{
						System.out.print("$");
					}
					else
					{
						flag = 1;
						for (j = i + 1;j < a.length();j++)
						{
							if (a.charAt(j) == 41 && flag == 1)
							{
								flag--;
								break;
							}
							else if (a.charAt(j) == 41 && flag != 1)
							{
								flag = flag - 1;
							}
							else if (a.charAt(j) == 40)
							{
								flag = flag + 1;
							}

						}
						if (flag == 0)
						{
							System.out.print(" ");
						}
						else
						{
							System.out.print("$");
						}
					}
				}


				else if (a.charAt(i) == 41)
				{
					if (i == 0)
					{
						System.out.print("?");
					}
					else
					{
						flag = 1;
						for (j = i - 1;j >= 0;j--)
						{
							if (a.charAt(j) == 40 && flag == 1)
							{
								flag--;
								break;
							}
							else if (a.charAt(j) == 40 && flag != 1)
							{
								flag = flag - 1;
							}
							else if (a.charAt(j) == 41)
							{
								flag = flag + 1;
							}
						}
						if (flag == 0)
						{
							System.out.print(" ");
						}
						else
						{
							System.out.print("?");
						}
					}
				}

				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}




	}
}

