package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int k = 0;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
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
				   if (a <= 140 && a >= 90 && b <= 90 && b >= 60)
				   {
				   i++;
				   if (k > i)
				   {
					   k = k;
				   }
				   if (k <= i)
				   {
					   k = i;
				   }
				   }
				   else
				   {
						i = 0;
				   }
		}
		   System.out.printf("%d",k);

		   return 0;
	}


}

