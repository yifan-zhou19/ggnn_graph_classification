package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int a;
		int i;
		int j;
		int temp;
		int x;
		int y;
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
		for (j = 0;m <= n;m++)
		{
			if (m == 1)
			{
				continue;
			}
			for (i = 2;i < m;i++)
			{
				a = m % i;
				if (a == 0)
				{
					break;
				}
			} //???????
			if (a != 0) // printf("%d\n",m);
			{
				temp = m;
				y = 0;
				while (temp > 0)
				{
					x = temp % 10;
					y = y * 10 + x;
					temp = temp / 10;
				}
				if (m == y) //?????
				{
					j = j + 1; //??m????????
					if (j == 1)
					{
						System.out.printf("%d",m);
					}
					else
					{
						System.out.printf(",%d",m);
					}
				}
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
	}
}

