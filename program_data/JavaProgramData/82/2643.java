package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int time = 0;
		int i;
		int max = 0;
		int hi;
		int lo;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				hi = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				lo = Integer.parseInt(tempVar3);
			}
			if ((hi >= 90) * (hi <= 140) * (lo <= 90) * (lo >= 60) == 1)
			{
				time = time + 1;
			}
			else
			{
				 if (time > max)
				 {
					 max = time;
				 }
				 time = 0;
			}

			if (i == n && time > max)
			{
				max = time;
			}


		}


		System.out.printf("%d", max);


		return 0;


	}





}

