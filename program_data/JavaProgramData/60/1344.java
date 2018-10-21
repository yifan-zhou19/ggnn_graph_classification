package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n < 5)
	{
	System.out.print("empty");
	}
	else
	{
		for (i = 3;i <= n - 2;i++,a = 1)
		{
	for (j = 2;j <= i / 2;j++)
	{
		if (i % j == 0 || (i + 2) % j == 0)
		{
		   a = 0;
		   break;
		}
	}
	  if (a != 0)
	  {
		  System.out.printf("%d %d\n",i,i + 2);
	  }


		}
	}
	}

}

