package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int result = 0;
	 int sum1 = 0;
	 int sum2;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	for (int i = 0;i <= n;i++)
	{
		if (i % 7 == 0)
		{
			result += i * i;
		}
	  else if (i % 10 == 7)
	  {
		  result += i * i;
	  }
	  else if (i % 100 == 71 || i % 100 == 72 || i % 100 == 73 || i % 100 == 74 || i % 100 == 75 || i % 100 == 76 || i % 100 == 78 || i % 100 == 79)
	  {
		  result += i * i;
	  }
	}
	for (int e = 0;e <= n;e++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			e = Integer.parseInt(tempVar2);
		}
		sum1 += e * e;
	}
	   sum2 = sum1 - result;
	   System.out.printf("%d",sum2);
	return 0;
	}


}

