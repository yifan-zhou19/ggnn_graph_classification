package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int r;
	 int t;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 if (n >= 5)
	 {
	 for (i = 3;i <= n - 2;i++)
	 {
		for (r = 2;r < i + 1;r++)
		{
			if (i % r == 0)
			{
		break;
			}
		}
		if (i == r)
		{
		  t = i + 2;
	   for (r = 2;r < t + 1;r++)
	   {
		 if (t % r == 0)
		 {
		 break;
		 }
	   }
	   if (t == r)
	   {
	   System.out.printf("%d %d\n",i,t);
	   }

		}
	 }
	 }
	  else
	  {
		  System.out.print("empty");
	  }
	}

}

