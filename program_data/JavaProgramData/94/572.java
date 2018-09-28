package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int N;
		int e;
		int h;
		int[] s = new int[500];
		int[] j = new int[500];
		int i = 0;
		int k = 0;
		int g = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(s[i]) = Integer.parseInt(tempVar2);
			}
			if (s[i] % 2 != 0)
			{
				j[k] = s[i];
				k++;
			}
		}
		h = k;
		k = 0;
	   for (g = 1;g <= h;g++)
	   {
			for (k = 0;k < h - g;k++)
			{
				if (j[k] > j[k + 1])
				{
					e = j[k + 1];
					j[k + 1] = j[k];
					j[k] = e;
				}
			}
	   }
	   k = 0;
	  for (k = 0;k < h;k++)
	  {


			   if (k < h - 1)
			   {
			  System.out.printf("%d,",j[k]);
			   }
		  if (k == h - 1)
		  {
			  System.out.printf("%d",j[k]);

		  }
	  }

		return 0;

	}
}

