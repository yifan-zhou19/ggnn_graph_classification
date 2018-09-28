package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int c;
		int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
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
	 if (a < b)
	 {
		 c = a;
		 a = b;
		 b = c;
	 }
	 for (i = 1;i <= n - 2;i++)
	 {
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 c = Integer.parseInt(tempVar4);
		 }
	  if (c <= b)
	  {
		  continue;
	  }
	  if (c > b && c <= a)
	  {
		  b = c;
		  continue;
	  }
	  if (c > a)
	  {
		  b = a;
		  a = c;
	  }
	 }
	 System.out.printf("%d\n%d\n",a,b);
	}

}

