package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
	  int i;
	  for (i = 3;i * i <= n;i += 2)
	  {
		if (n % i == 0)
		{
		return 0;
		}
	  }
	  return 1;
	}

	public static void min(int s)
	{
		int i;
		for (i = 3;i <= s / 2;i += 2)
		{
			if (isprime(i) != 0 && isprime(s - i) != 0)
			{
				System.out.printf("%d=%d+%d\n",s,i,s - i);
				break;
			}
		}
		return;
	}

	public static int Main()
	{
		int ni;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ni = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= ni;i++)
		{
		  if (i % 2 == 0)
		  {
		  min(i);
		  }
		}
		return 0;
	}
}

