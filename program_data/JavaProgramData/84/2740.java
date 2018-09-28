package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int max1;
		int max2;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
		max1 = a;
		max2 = b;
		for (int i = 3;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				temp = Integer.parseInt(tempVar4);
			}
			if (temp >= max1)
			{
				max2 = max1;
				max1 = temp;
			}
			else if (temp >= max2)
			{
				max2 = temp;
			}
		}
		System.out.printf("%d\n%d\n",max1,max2);
		return 0;
	}


}

