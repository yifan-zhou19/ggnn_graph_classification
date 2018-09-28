package <missing>;

public class GlobalMembers
{
	public static int prime(int k)
	{
		int i;
		int n;
	  n = Math.sqrt(k);
	  for (i = 2;i <= n;i++)
	  {
		  if (k % i == 0)
		  {
			  break;
		  }
	  }
	  if (i > n)
	  {
		  return (1);
	  }
	  else
	  {
		  return (0);
	  }

	}

	public static int same(int k)
	{
		int m = 0;
		int n;
	  n = k;
	  while (n > 0)
	  {
		  m = m * 10 + n % 10;
		n = n / 10;
	  }

	  if (m == k)
	  {
		  return (1);
	  }
	  else
	  {
		  return (0);
	  }

	}

	public static void Main()
	{
		int n;
		int m;
		int i;
		int t = 0;
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
	  for (i = m;i <= n;i++)
	  {
		if (prime(i) != 0 && same(i) != 0)
		{
		   if (t > 0)
		   {
			   System.out.print(",");
		   }
		 System.out.printf("%d",i);
		 t++;
		}
	  }
	 if (t == 0)
	 {
		 System.out.print("no");
	 }

	}
}

