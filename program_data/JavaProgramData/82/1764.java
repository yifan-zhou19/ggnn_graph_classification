package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int T;
		int i;
		int j = 0;
		int k;
		int K = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			T = Integer.parseInt(tempVar);
		}

		for (i = 0;i < T;i++)
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
		   if (b <= 90 && b >= 60 && a >= 90 && a <= 140)
		   {
			   j = j + 1;
			   k = j;
			  if (K < k)
			  {
				  K = k;
			  }
		   }
		   else
		   {

			  k = 0;
			  j = 0;
		   }
		}
		System.out.printf("%d",K);
	}
}

