package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int max;
		int max2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = Integer.parseInt(tempVar2);
		}
		max = max2 = t;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t = Integer.parseInt(tempVar3);
			}
			if (t > max)
			{
				max2 = max;
				max = t;
			}
			else if (t > max2)
			{
				max2 = t;
			}
		}
		System.out.printf("%d\n",max,max2);
		System.out.printf("%d\n",max2);
		return 0;
	}
}

