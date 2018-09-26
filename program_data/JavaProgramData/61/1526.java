package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b = 1;
	int c = 1;
	int y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int j = 0;j < n;j++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = Integer.parseInt(tempVar2);
	   }
	   for (int i = 0;i < a;i++)
	   {
		   if (i == 0 || i == 1)
		   {
			 y = 1;
		   }
		   else
		   {
			 y = b + c;
			 c = b;
			 b = y;

		   }
	   }
	   System.out.printf("%d\n",y);
	   c = 1;
	   b = 1;
	}



	return 0;
	}
}

