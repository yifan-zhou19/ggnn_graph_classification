package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int sum = 0;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  if ((i % 7 != 0) && (((i + 3) % 10) != 0) && (i != 70) && i != 71 && i != 72 && i != 73 && i != 74 && i != 75 && i != 76 && i != 77 && i != 78 && i != 79)
		  {
			  sum = sum + i * i;
		  }
	  }
	  System.out.printf("%d",sum);
	  return 0;
	}
}

