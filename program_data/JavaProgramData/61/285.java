package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = Integer.parseInt(tempVar2);
	   }
	   int[] b = new int[a];
	   if (a == 1 || a == 2)
	   {
		   System.out.print("1\n");
	   }
	   else
	   {
		   b[0] = 1;
		   b[1] = 1;
		   for (int j = 2;j < a;j++)
		   {
			  b[j] = b[j - 1] + b[j - 2];
		   }
		   System.out.printf("%d\n",b[a - 1]);
	   }
	}
	}
}

