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
		for (int i = 10;i < 10 * 10 * 10 * 10 * 10 * 10;i *= 10)
		{
		   int a;
		   a = n % i / (i / 10);
		   if (a != 0)
		   {
			   System.out.printf("%d",a);
		   }
		   else
		   {
			   return 0;

		   }
		}



		return 0;
	}
}

