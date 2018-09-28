package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int i;
		int max1;
		int max2;
		int b;
		int c;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		max1 = b;
		max2 = c;
		int k;
		int t;
		if (max1 < max2)
		{
			t = max1;
			k = max2;
			max1 = k;
			max2 = t;
		}
		for (i = 2;i < a;i++)
		{
			int m;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
			if (m > max1)
			{
				max2 = max1;
				max1 = m;
			}
			else if (m > max2)
			{
				max2 = m;
			}


		}
		System.out.printf("%d\n%d",max1,max2);

	}

}

