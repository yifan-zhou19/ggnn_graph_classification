package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		int a;
		int max = 0;
		int sec = 0;
		while (i > 0 && i < 100)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Integer.parseInt(tempVar2);
		   }
		   if (a >= max)
		   {
			   sec = max;
		   max = a;
		   }
		   if (a < max && a> sec)
		   {
		   sec = a;
		   }
		   i--;
		}
	System.out.printf("%d\n",max);
	System.out.printf("%d\n",sec);
	return 0;
	}
}

