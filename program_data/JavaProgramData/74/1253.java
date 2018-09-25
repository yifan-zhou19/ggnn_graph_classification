package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int flag1 = 0;
		int flag2 = 0;
		int k;
		int n;
		int count = 0;
		int q;
		int s;
		int d;
		int w;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
			for (i = a;i <= b;i++)
			{
				for (j = 2;j < (i / 2);j++)
				{
					if (i % j == 0)
					{
						flag1++;
					}
				}
				if (flag1 != 0)
				{
					flag1 = 0;
				continue;
				}
				else
				{

					for (k = 1;k < 100;k++)
					{
						if (i >= Math.pow(10,k - 1) && i < Math.pow(10,k))
						{
							n = k;
						break;
						}
					}
					w = i;

					for (q = 0;q < k / 2;q++)
					{
						d = w % 10;
						s = w / Math.pow(10,n - 1);

						if (d == s)
						{
							w = (w - d - s * Math.pow(10,n - 1)) / 10;
							n = n - 2;
						}
						else
						{
							flag2++;
						}
					}
					if (flag2 == 0)
					{
						if (num == 0)
						{
						System.out.printf("%d",i);
						}
						else
						{
							System.out.printf(",%d",i);
						}
						num++;
					}
					flag2 = 0;
				}
			}
			if (num == 0)
			{
				System.out.print("no");
			}
	}
}

