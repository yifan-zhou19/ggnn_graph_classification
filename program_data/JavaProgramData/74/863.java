package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int m;
		int n;
		int temp;
		int x;
		int flag;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		flag = 0;
		for (i = m;i <= n;i++) //??????a??????????,???????b?!!
		{
			a = i;
			b = 0;
			for (j = 1;a != 0;j++)
			{
				temp = b;
				b = a % 10;
				b = 10 * temp + b;
				a = a / 10;
			}
			if (b == i)
			{
				for (x = 2;x <= b;x++)
				{
					if (b % x == 0)
					{
						break;
					}
				}
				if (x == i)
				{
					if (y > 0)
					{
					System.out.print(",");
					}
					System.out.printf("%d",b);
					flag = 1;
					y++;

				}
			}
		}
		if (flag == 0)
		{
			System.out.print("no\n");
		}
	}
}

