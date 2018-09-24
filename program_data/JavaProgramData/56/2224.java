package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int i = 1;
	int j = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	while (i *= 10)
	{
	  if (a / i == 0)
	  {
		  break;
	  }
	}

	while (j < i)
	{
	  System.out.printf("%d",(a / j) % 10);
	  j *= 10;
	}
	}
}

