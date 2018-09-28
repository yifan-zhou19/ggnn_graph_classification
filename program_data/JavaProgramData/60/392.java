package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k = 0;
		int f = int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n - 1;i++)
		{
			if ((f(i) == 0) && (f(i + 2) == 0))
			{
			System.out.printf("%d %d\n",i,i + 2);
		k++;
			}
		}
		if (k == 0)
		{
			System.out.print("empty");
		}
	}
	public static int f(int a)
	{
		int b = Math.sqrt(a);
		int i;
		int sum = 0;
		for (i = 2;i <= b;i++)
		{
			if (a % i == 0)
			{
				sum = 1;
				break;
			}
		}
			return (sum);
	}
}

