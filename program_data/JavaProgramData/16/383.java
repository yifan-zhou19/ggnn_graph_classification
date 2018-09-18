package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int num;
		int len;
		a1 = a2 = a3 = a4 = a5 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		if (num > 9)
		{
			a1 = num % 10;
			a2 = num / 10;
			if (a2 > 9)
			{
				a3 = a2 / 10;
				a2 = a2 % 10;
				if (a3 > 9)
				{
					a4 = a3 / 10;
					a3 = a3 % 10;
					if (a4 > 9)
					{
						a5 = a4 / 10;
						a4 = a4 % 10;
						len = 5;
					}
					else
					{
						len = 4;
					}
				}
				else
				{
					len = 3;
				}
			}
			else
			{
				len = 2;
			}
		}
		else
		{
			a1 = num;
			len = 1;
		}

		if (a5 != 0)
		{
		//{
	//		printf("%d %d %d %d %d\n",a5,a4,a3,a2,a1);
			System.out.printf("%d%d%d%d%d\n",a1,a2,a3,a4,a5);
		}
	//	}
		else
		{
			if (a4 != 0)
			{
	//		{
	//			printf("%d %d %d %d\n",a4,a3,a2,a1);
				System.out.printf("%d%d%d%d\n",a1,a2,a3,a4);
			}
	//		}
			else
			{
				if (a3 != 0)
				{
	//			{
	//				printf("%d %d %d\n",a3,a2,a1);
					System.out.printf("%d%d%d\n",a1,a2,a3);
				}
	//			}
				else
				{
					if (a2 != 0)
					{
	//				{
	//					printf("%d %d\n",a2,a1);
						System.out.printf("%d%d\n",a1,a2);
					}
	//				}
					else
					{
						System.out.printf("%d\n",a1);
					}
				}
			}
		}
		return 0;
	}

}

