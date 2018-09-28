package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[20][21];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=&num[0][0];
		int p = num[0][0];
		int m;
		int n;
		int i;
		int k;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p + 21 * i + k = Integer.parseInt(tempVar3);
				}
			}
		}
		if (num[0][0] >= num[0][1] != 0 && num[0][0] >= num[1][0])
		{
			System.out.print("0 0");
			flag = 1;
		}
		for (k = 1;k < n;k++)
		{
			if (*(p + k) >= *(p + k + 1) && *(p + k) >= *(p + k - 1) && *(p + k) >= *(p + 21 + k))
			{
				if (flag != 0)
				{
					System.out.print("\n");
				}
				System.out.printf("0 %d",k);
				flag = 1;
			}

		}
		for (i = 1;i < m - 1;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (*(p + 21 * i + k) >= *(p + 21 * i + k + 1) && *(p + 21 * i + k) >= *(p + 21 * i + k - 1) && *(p + 21 * i + k) >= *(p + 21 * (i - 1) + k) && *(p + 21 * i + k) >= *(p + 21 * (i + 1) + k))
				{
					if (flag != 0)
					{
						System.out.print("\n");
					}
					System.out.printf("%d %d",i,k);
					flag = 1;
				}
			}
		}
		for (k = 0;k < n;k++)
		{
			if (*(p + (m - 1) * 21 + k) >= *(p + (m - 1) * 21 + k + 1) && *(p + (m - 1) * 21 + k) >= *(p + (m - 1) * 21 + k - 1) && *(p + (m - 1) * 21 + k) >= *(p + (m - 2) * 21 + k))
			{
				if (flag != 0)
				{
					System.out.print("\n");
				}
				System.out.printf("%d %d",m - 1,k);
				flag = 1;
			}
		}
		return 0;
	}
}

