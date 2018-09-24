package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int a;
	   int b;
	   int c;
	   int i;
	   int t = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
	if (i % 7 == 0)
	{
		a = 0;
	}
	else
	{
	a = i;
	b = (int)(i / 10);
	if (b == 7)
	{
		a = 0;
	}
	else
	{
	a = i;
	c = i - b * 10;
	if (c == 7)
	{
		a = 0;
	}
	else
	{
		a = i;
	}
	}
	}
	t = t + a * a;
	   }
	System.out.printf("%d",t);
	}

}

