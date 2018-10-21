package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int max;
		int cmax;
		int[] n = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len = Integer.parseInt(tempVar);
		}
		for (i = 0;i < len;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		max = n[0];
		for (i = 0;i < len - 1;i++)
		{
			if (n[i] < n[i + 1])
			{
				max = n[i + 1];
			}
		}
		System.out.printf("%d\n",max);
		if (max == n[0])
		{
			cmax = n[1];
		}
		 else
		 {
			 cmax = n[0];
		 }
		for (i = 0;i < len - 1;i++)
		{
			if (n[i] < n[i + 1])
			{
			   if (n[i + 1] == max)
			   {
				  if (n[i + 2] != max && n[i] < n[i + 2])
				  {
					  cmax = n[i + 2];
				  }
			   }
			else
			{
				cmax = n[i + 1];
			}
			}
		}
		System.out.printf("%d",cmax);
		return 0;
	}

}

