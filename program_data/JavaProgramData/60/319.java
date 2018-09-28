package <missing>;

public class GlobalMembers
{
	public static int ss(int n)
	{
		  int i = 2;
		  int k = 0;
		  int j = 0;
		  for (i = 2;i <= (n / 2);i++)
		  {
			  if ((n % i) == 0)
			  {
				  k++;
				  break;
			  }
		  }
		  if (k == 0)
		  {
		  j++;
		  }
		  k = 0;
		  for (i = 2;i <= (n + 2 / 2);i++)
		  {
			  if (((n + 2) % i) == 0)
			  {
				  k++;
				  break;
			  }
		  }
		  if (k == 0)
		  {
		  j++;
		  }
		  return j;
	}

	public static int Main()
	{
		int n;
		int i = 0;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty");
		}
		else
		{
			for (i = 2;i < (n - 1);i++)
			{
				a = ss(i);
				if (a == 2)
				{
				System.out.printf("%d %d\n",i,i + 2);
				}
			}
		}
		return 0;
	}

}

