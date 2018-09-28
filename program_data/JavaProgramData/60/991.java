package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
	int i;
	int n;
	int k;
	int re;
	n = x;
	k = 0;
	for (i = 1;i <= n;i++)
	{
		  if (x % i == 0)
		  {
			  k++;
		  }
	}
	if (k == 2)
	{
	re = 1;
	}
	else
	{
	re = 0;
	}
	return re;
	}
	public static int Main()
	{

		int n;
		int k = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (i = 1;i <= n - 2;i = i + 2)
	{
	if (sushu(i) == 1 && sushu(i + 2) == 1)
	{
	System.out.printf("%d %d\n",i,i + 2);
	k = k + 1;
	}
	}
	if (k == 0)
	{
	System.out.print("empty");
	}
		return 0;
	}
}

