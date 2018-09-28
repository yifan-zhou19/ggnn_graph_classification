package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int y;
	 int m = 0;
	 int q;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int i;
	 for (i = 1;i <= n;i++)
	 {
	  if (i % 7 == 0)
	  {
	   continue;
	  }
	   else
	   {
	   q = i;
	   while (q > 0)
	   {
	   y = (q % 10);
	   if (y == 7)
	   {
		break;
	   }
		if (q < 10)
		{
		m += i * i;
		}
		q = q / 10;

	   }
	   }
	 }
	 System.out.printf("%d",m);
	 return 0;
	}
}

