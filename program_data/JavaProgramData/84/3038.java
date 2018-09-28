package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int t;
		int max;
		int secondmax;
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
		max = secondmax = t;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t = Integer.parseInt(tempVar3);
			}
			if ((t < max) && (t> secondmax))
			{
				secondmax = t;
			}
			else
			{
				if (t > max)
				{
				secondmax = max;
				max = t;
				}
			}
		}
		System.out.printf("%d\n%d",max,secondmax);
	}
}

