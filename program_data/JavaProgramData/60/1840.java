package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	t = 0;
	for (i = 3;i <= n - 2;i++)
	{
	   for (j = 2;j <= (int)Math.sqrt(i) + 1;j++)
	   {
		   if (i % j == 0 || (i + 2) % j == 0)
		   {
		   break;
		   }
	   }
	   if (j > (int)Math.sqrt(i) + 1)
	   {
			  System.out.printf("%d %d\n",i,i + 2);
		  t += 1;
	   }
	}
	if (t == 0)
	{
	System.out.print("empty");
	}
	}

}

