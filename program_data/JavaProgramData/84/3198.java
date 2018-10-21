package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int a;
	 int max;
	 int i;
	 int max2;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 i = 1;
		while (i <= n)
		{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = Integer.parseInt(tempVar2);
	  }
	  if (a > max)
	  {
	   max2 = max;
	   max = a;
	  }
	  else if (a > max2)
	  {
	   max2 = a;
	  }
			i = i + 1;
		}
	 System.out.printf("%d\n%d\n",max,max2);
	 return 0;
	}

}

