package <missing>;

public class GlobalMembers
{
	public static int checkprime(int af)
	{
		int i;
		for (i = 2;i < (af);i++)
		{
			if (af % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main(String[] args)
	{
		int a;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		a = 0;
		for (i = 2;i < n - 1;i++)
		{
			if (checkprime(i) == 1 && checkprime(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
			a++;
			}
		}
	if (a == 0)
	{
	System.out.print("empty");
	}
	}


}

