package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int a;
		int b;
		int c = 0;
		int e = 0;
		int d;
		int f = 0;
		int sum = 0;
		int j;
		int rever;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = a;i <= b;i++)
		{
			sum = 0;
			d = i;
			k = (int)Math.sqrt(i);
			for (j = 2;j <= k;j++)
			{
				if (i % j == 0)
				{
					c = 0;
					break;
				}
				else
				{
					c = 1;
				}
			}
			if (c == 1)
			{
				do
				{
				sum = sum * 10;
				rever = d % 10;
				d = d / 10;
				sum = sum + rever;
				}while (d != 0);
			}
			if (sum == i)
			{
				f++;
				e = 1;
				if (f == 1)
				{
					System.out.printf("%d",i);
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (e == 0)
		{
			System.out.print("no");
		}
	}
}

