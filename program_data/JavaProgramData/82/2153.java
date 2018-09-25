package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int max;
		int s;
		String ch = new String(new char[300]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0;
			 max = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			if (((j >= 90) && (j <= 140)) && ((k >= 60) && (k <= 90)))
			{
				s++;
			}
			else
			{
				if (s > max)
				{
					max = s;
				}
				s = 0;
			}
		}
		if (s > max)
		{
			max = s;
		}

		System.out.printf("%d",max);


		return 0;
	}
}

