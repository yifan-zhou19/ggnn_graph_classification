package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int a;
	   int i;
	   int j;
	   int[] c = new int[10000];
	   int[] b = new int[10000];
	   c[0] = 1;
	   c[1] = 1;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  b[i - 1] = a;
	   }
		for (i = 1;i < 9999;i++)
		{
			c[i + 1] = c[i] + c[i - 1];
		}
		for (i = 0;i < n;i++)
		{
		   j = b[i];
		   System.out.printf("%d\n",c[j - 1]);
		}
		return 0;
	}


}

