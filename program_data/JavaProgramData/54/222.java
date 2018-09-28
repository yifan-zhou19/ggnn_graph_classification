package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int m = 0;
	  int n;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  while (true)
	  {
		int i = ++m;
		int j;
		for (j = 0;j < n;j++,i = (i - k) * (n - 1) / n)
		{
			if ((i - k) % n == 0)
			{
			   continue;
			}
			else
			{
			   break;
			}
		}
		 if (j == n)
		 {
			break;
		 }
	  }
	   System.out.printf("%d",m);

	}
}

