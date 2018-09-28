package <missing>;

public class GlobalMembers
{
	public static int feibo(int m)
	{
		if (m == 1 || m == 2)
		{
		   return 1;
		}
		else
		{
		   return feibo(m - 1) + feibo(m - 2);
		}
	}

	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int place;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  place = Integer.parseInt(tempVar2);
		  }
		  System.out.printf("%d\n",feibo(place));
	  }
	}

}

