package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int temp;
		int k;
		int i;
		int flag = 0;
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
		for (;a <= b;a++)
		{
			temp = a;
			d = 0;
			while (temp > 0)
			{
				c = temp % 10;
				d = d * 10 + c;
				temp = temp / 10;
			}
			if (d == a)
			{
				k = Math.sqrt(d);
				for (i = 2;i <= k;i++)
				{
					if (d % i == 0)
					{
					break;
					}
				}
				if (i >= k + 1)
				{
					flag = flag + 1;
					if (flag == 1)
					{
						System.out.printf("%d",d);
					}
					else
					{
						System.out.printf(",%d",d);
					}
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
	}

}

