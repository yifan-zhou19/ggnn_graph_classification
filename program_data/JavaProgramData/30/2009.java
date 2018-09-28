package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int sum = 0;
	int n;
	int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (i = 1;i <= n;i++)
	{
		if (i < 7)
		{
			sum += i * i;
		}
		else if (i >= 7)
		{
		  if (i % 7 == 0 || (i - 7) % 10 == 0 || i / 10 == 7)
		  {
			continue;
		  }
		  else
		  {
			sum += i * i;
		  }
		}
	}
	  System.out.printf("%d",sum);
	  return 0;
	}

}

