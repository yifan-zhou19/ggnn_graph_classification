package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int t = 0;
		int m;
		int max = 0;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
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
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				t++;
				if (t > max)
				{
				  max = t;
				}
			}
			else
			{
				t = 0;
			}
		}
		System.out.printf("%d",max);
		return 0;
	}

}

