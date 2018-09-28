package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int a;
	int b;
	int i;
	int j;

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
		   m = Integer.parseInt(tempVar2);
	   }
	   b = 0;
	   for (j = 0;j < m;j++)
	   {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a = Integer.parseInt(tempVar3);
		  }
		   if (a + b < 60)
		   {
		   if (a + b + 3 < 60)
		   {
			b += 3;
		   }
		   else
		   {
			b = 60 - a;
		   }
		   }
	   }
	   System.out.printf("%d\n",60 - b);
	}
	return 0;
	}
}

