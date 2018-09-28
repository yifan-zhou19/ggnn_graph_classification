package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
		int[] smart = new int[1000];
		int[] stupid = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int n;
		int i;
		int j;
		int e;
		int profit;
		p = smart;
		q = stupid;
		for (;;)
		{
			profit = -100000;

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			else
			{
				for (i = 0;i < n;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						p + i = Integer.parseInt(tempVar2);
					}
				}
				for (i = 0;i < n;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						q + i = Integer.parseInt(tempVar3);
					}
				}
				for (i = n - 1;i >= 0;i--)
				{
					for (j = 0;j < i;j++)
					{
						if (*(p + j) < *(p + j + 1))
						{
							e = (p + j);
							*(p + j) = *(p + j + 1);
							*(p + j + 1) = e;
						}
					}
				}
				for (i = n - 1;i >= 0;i--)
				{
					for (j = 0;j < i;j++)
					{
						if (*(q + j) < *(q + j + 1))
						{
							e = (q + j);
							*(q + j) = *(q + j + 1);
							*(q + j + 1) = e;
						}
					}
				}
				for (i = 0;i < n;i++)
				{
					for (j = i;j < n;j++)
					{
						if (*(p + j - i) > *(q + j))
						{
							money = money + 200;
						}
						else if (*(p + j - i) < *(q + j))
						{
							money = money - 200;
						}
					}
					for (j = i - 1;j >= 0;j--)
					{
						if (*(p + n - 1 - j) > *(q + j))
						{
							money = money + 200;
						}
						else if (*(p + n - 1 - j) < *(q + j))
						{
							money = money - 200;
						}
					}
					if (money > profit)
					{
						profit = money;
					}
					money = 0;
				}
				System.out.printf("%d\n",profit);
			}

		}
		return 0;
	}

}

