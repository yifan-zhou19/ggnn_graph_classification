package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int[] k = new int[101];
		int l;
		int max;
		int sec = 0;
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
				k[i] = Integer.parseInt(tempVar2);
			}

		}
		   max = k[0];
		for (i = 0;i < n;i++)
		{
			   if (k[i] >= max)

			   {
				sec = max;
			max = k[i];
			   }
		   else if ((k[i] < max) && (k[i] >= sec))
		   {
			sec = k[i];
		   }

		}
		 System.out.printf("%d\n",max);
		 System.out.printf("%d",sec);
		 return 0;

	}

}

