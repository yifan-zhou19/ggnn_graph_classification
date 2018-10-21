package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int max1;
		int max2;
		int n;
		int i;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a > b)
		{
			max1 = a;
			max2 = b;
		}
		else
		{
			max1 = b;
			max2 = a;
		}
		for (i = 0; i < n - 2; i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				temp = Integer.parseInt(tempVar4);
			}
			if (temp > max1)
			{
				max2 = max1;
				max1 = temp;
			}
			else if (temp > max2)
			{
				max1 = max1;
				max2 = temp;
			}
			else
			{
			   max1 = max1;
			   max2 = max2;
			}
		}
		System.out.printf("%d\n%d", max1, max2);
		return 0;
	}


}

