package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;
	  int k;
	  int i;
	  n > 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	for (;;i++)
	{
	  if (n == 1)
	  {
		  System.out.print("End");
	  }
	  else if (n % 2 == 0)
	  {
		   m = n / 2;
		   System.out.printf("%d/2=%d\n",n,m);
		   n = m;
		   continue;
	  }
	  else
	  {
			m = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",n,m);
			n = m;
			continue;
	  }
		break;
	}
	}
}

