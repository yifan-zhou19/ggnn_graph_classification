package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int sum1 = 0;
	  int sum2 = 0;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (int i = 1;i <= n;i++)
	  {
		if (i % 7 == 0 || i == 17 || i == 27 || i == 37 || i == 47 || i == 57 || i == 67 || i == 87 || i == 97 || i == 71 || i == 72 || i == 73 || i == 74 || i == 75 || i == 76 || i == 78 || i == 79)
		{
		   sum1 = sum1 + i * i;
		}
	  }
	  for (int j = 1;j <= n;j++)
	  {
		sum2 = sum2 + j * j;
	  }
	System.out.printf("%d",sum2 - sum1);
	return 0;
	}
}

