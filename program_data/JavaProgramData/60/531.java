package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sushu = int x;
		int n;
		int i;
		int t;
		int k;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i < n - 1;i++)
		{
			t = sushu(i);
			k = sushu(i + 2);
			if (t == 1 && k == 1)
			{
				System.out.printf("\n%d %d",i,i + 2);
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("empty");
		}
	}

	public static int sushu(int x)
	{
		int i;
		int q = 1;
		float p;
		p = Math.sqrt(x);
		for (i = 2;i <= p;i++)
		{
		if (x % i == 0)
		{
			q = 0;
			break;
		}
		}
		return (q);
	}
}

