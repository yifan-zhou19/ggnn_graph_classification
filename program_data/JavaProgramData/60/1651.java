package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int t = 1;
		int i;
		if (n < 2)
		{
			t = 0;
		}
		for (i = 2;i <= (n - 1);i++)
		{
			if (n % i == 0)
			{
				t = 0;
				break;
			}
		}
			return t;
	}

	public static int Main()
	{
	  int k;
	  int j;
	  k = 2;
	  int c = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  j = Integer.parseInt(tempVar);
	  }
	if (j <= 4)
	{
	System.out.print("empty");
	}
	else
	{
	  {
		  do
		  {
		  if (prime(k) != 0 && prime(k + 2) != 0)
		  {
			  c += 1;
			  System.out.printf("%d %d\n",k,k + 2);
		  }
		  k = k + 1;
		  } while (k < (j - 1));
}
	}
	  return 0;
	}
}

