package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int min;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		min = (d < c)?d:c;
		max = (d >= c)?d:c;
		if (a > 2)
		{
		for (;a >= 3;a--)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			if (b > max)
			{
				min = max;
				max = b;
			}
			else if (b > min)
			{
				min = b;
			}

		}
		}
		System.out.printf("%d\n%d",max,min);
	}



}

