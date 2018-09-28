package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int isok(int sum,int step)
	{
		if (step == n)
		{
			return 1;
		}
		if (sum % (n - 1) != 0)
		{
			return 0;
		}
		return isok(sum / (n - 1) * n + k, step + 1);
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int i;
		int s = 1;

		while (true)
		{
		  if (isok(s * n + k, 1) != 0)
		  {
								s = s * n + k;
								for (i = 1;i < n;i++)
								{
									s = s * n / (n - 1) + k;
								}
								System.out.printf("%d\n",s);
								break;
		  }
		  s++;
		}
		  return 0;
	}

}

