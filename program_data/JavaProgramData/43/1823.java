package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int a;
	   int b;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   for (a = 2;a <= (m / 2);a++)
	   {
		   b = m - a;
		   for (i = 2;i < a;i++)
		   {
			   if (a % i != 0)
			   {
		   continue;
			   }
		   else
		   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		   goto a;
		   }
		   }
		   for (i = 2;i < b;i++)
		   {
			   if (b % i != 0)
			   {
			   continue;
			   }
			   else
			   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   goto a;
			   }
		   }
		System.out.printf("%d %d\n",a,b);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		a:
		continue;
	   }
	   return 0;
	}

}

