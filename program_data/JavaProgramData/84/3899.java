package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int i;
		int b;
		int c;
		int max1;
		int max2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a < b)
		{
			max1 = b;
			max2 = a;
		}
		else if (a > b)
		{
			max1 = b;
			max2 = a;
		}

		while (i <= (n - 2))
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if (c >= max2 != 0 && c < max1)
			{
				max2 = c;
				max1 = max1;
			}
			else if (c < max2)
			{
				max2 = max2;
				max1 = max1;
			}
			else if (c >= max1)
			{
				max2 = max2;
				max1 = c;
			}
			i++;
		}
		System.out.printf("%d\n",max1);
		System.out.printf("%d",max2);
	}


}

