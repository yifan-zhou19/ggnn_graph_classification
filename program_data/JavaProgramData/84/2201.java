package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i = 0;
	 int n;
	 int tmp = 0;
	 int a = 0;
	 int b = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }

	 for (i = 0;i < n;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   tmp = Integer.parseInt(tempVar2);
	   }
	   if (tmp > a)
	   {
		 b = a;
		 a = tmp;
	   }
	   else
	   {
		 if (tmp > b)
		 {
		   b = tmp;
		 }
	   }
	 }



	System.out.printf("%d\n",a);
	System.out.printf("%d",b);
		return 0;
	}

}

