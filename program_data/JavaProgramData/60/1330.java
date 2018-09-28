package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int k;
	  int j;
	  int p;
	  p = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n < 5)
	  {
	  System.out.print("empty");
	  }
	  if (n >= 5)
	  {
	  for (i = 1;i <= (n - 2);i++)
	  {
		  for (k = 2;k < i;k++)
		  {
			 if (i % k == 0)
			 {
				break;
			 }
			 if (k == i - 1)
			 {
					  for (j = 2;j < i + 2;j++)
					  {
						  if ((i + 2) % j == 0)
						  {
						  break;
						  }
						  if (j == i + 1)
						  {
						  System.out.printf("%d %d\n",i,(i + 2));
						  p = 1;
						  }
					  }
			 }
		  }
	  }
	  }
	if (p = 0)
	{
	System.out.print("empty");
	}

	return 0;
	}

}

