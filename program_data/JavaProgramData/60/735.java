package <missing>;

public class GlobalMembers
{
	public static int zhi(int a)
	{
		int b = 1;
		for (int i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
				break;
			}
			else
			{
				b++;
			}
		}
		if (b == a - 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
	int n;
	int i;
	int t;
	int k;
	k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 3;i <= n - 2;i++)
	{
		if (zhi(i) == 1)
		{
			t = i + 2;
			if (zhi(t) == 1)
			{
				k++;
				System.out.printf("%d %d\n",i,t);
			}
		}
	}
	if (k == 0)
	{
		System.out.print("empty\n");
	}
		return 0;
	}

}

