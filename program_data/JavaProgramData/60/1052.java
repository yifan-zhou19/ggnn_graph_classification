package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int k = 2;
		int j = 1;
		int i;
		for (i = 1;i <= x;i++)
		{
		while ((k <= x / 2) && j != 0)
		{
			if (x % k == 0)
			{
		j = 0;
			}
		else
		{
			k = k + 1;
		}
		}
		}
		return j;
	}

	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
		  if (sushu(i) != 0 && sushu(i + 2) != 0)
		  {
		   System.out.printf("%d %d\n",i,i + 2);
		  }
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
	  return 0;
	}
}

