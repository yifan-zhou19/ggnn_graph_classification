package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int Fibonacci = int n;
		int n;
		int[] a = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0; i < n; i++)
		{
			System.out.printf("%d\n", Fibonacci(a[i]));
		}
	}
	public static int Fibonacci(int n)
	{
		int i;
		int[] a = new int[20];
		a[0] = 1;
		a[1] = 1;
		for (i = 2; i < n; i++)
		{
			a[i] = a[i - 2] + a[i - 1];
		}
		return (a[n - 1]);
	}
}

