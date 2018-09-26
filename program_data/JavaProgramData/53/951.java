package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] su = new int[300];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(su[i]) = Integer.parseInt(tempVar2);
		}
		}

		for (i = 0;i < n - 1;i++)
		{
		  for (j = i + 1;j < n;j++)
		  {
			 if (su[i] == su[j])
			 {
			   su[j] = -10;
			 }
		  }
		}
		  System.out.printf("%d", su[0]);
		  for (i = 1;i < n;i++)
		  {
		   if (su[i] != -10)
		   {
			System.out.printf(",%d", su[i]);
		   }
		  }

		return 0;
	}

}

