package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[10];
		int i;
		int count = 0;
		for (i = 0; i < 6; ++i)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			count += n[i];
		}
		while (count > 0)
		{
			  n[3] += 12;

			  if (n[5] < n[2])
			  {
				 n[5] += 60;
				 --n[4];
			  }
			  if (n[4] < n[1])
			  {
				 n[4] += 60;
				 --n[3];
			  }
			  long ans = (n[5] - n[2]) + 60 * (n[4] - n[1]) + 3600 * (n[3] - n[0]);
			  System.out.printf("%lld\n", ans);
			  count = 0;
			  for (i = 0; i < 6; ++i)
			  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  n[i] = Integer.parseInt(tempVar2);
				  }
				  count += n[i];
			  }
		}
		return 0;
	}

}

