package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] shou = new int[n];
		int[] zhang = new int[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(shou[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(zhang[i]) = Integer.parseInt(tempVar3);
			}
		}
		int a = 0;
		int e = 0;
		 for (int i = 0;i < n;i++)
		 {
		   if (shou[i] >= 90 && shou[i] <= 140 && zhang[i] >= 60 && zhang[i] <= 90)
		   {
			   a++;
			   if (a > e)
			   {
				   e = a;
			   }
		   }
		   else
		   {
			   a = 0;
		   }
		 }
		System.out.printf("%d",e);
		return 0;
	}
}

