package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int time;
		int n;
		int m;
		int i;
		int j;
		int k;
		int[] a = new int[61];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
		  for (j = 1;j <= m;j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[j] = Integer.parseInt(tempVar3);
			  }
		  }
		  k = 1;
		  time = 0;
		  for (j = 1;j <= 60;j++)
		  {
			   time++;
			   if (time == a[k])
			   {
								 k++;
								 j = j + 3;
			   }
		  }
		  for (j = 1;j <= m;j++)
		  {
			  a[j] = 0;
		  }
		   System.out.printf("%d\n",time);
		}
	return 0;
	}

}

