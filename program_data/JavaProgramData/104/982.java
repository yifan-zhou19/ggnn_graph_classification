package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int m;
	  int n;
	  int temp;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  if (m < n)
	  {
		temp = m;
		m = n;
		n = temp;
	  }
	  if (m == n)
	  {
		  System.out.printf("%d\n",m);
	  }
	  else
	  {
	  for (;;)
	  {
		if (m / 2 == n)
		{
			System.out.printf("%d\n",n);
			break;
		}
		else
		{
		  if (m / 2 > n)
		  {
			  m /= 2;
		  }
		  else
		  {
			temp = n;
			n = m / 2;
			m = temp;
		  }
		}
	  }
	  }
	}
}

