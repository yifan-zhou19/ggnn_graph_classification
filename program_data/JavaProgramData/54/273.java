package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int k;
	  int m;
	  int m1;
	  int i;
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
	  for (m = 1;;m++)
	  {
		m1 = m;
		for (i = 1;i <= n;i++)
		{
		  if (m1 % n == k)
		  {
			  m1 = (m1 - k) * (n - 1) / n;
		  }
		  else
		  {
			  m1 = 0;
			  break;
		  }
		}
		if (m1 != 0)
		{
			System.out.printf("%d",m);
			break;
		}
	  }
	}
}

