package <missing>;

public class GlobalMembers
{
	public static void f(int n,int m)
	{
		int i;
		int k = 0;
		int t = 0;
		int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		for (i = 0;i < 300;i++)
		{
			a[i] = i + 1;
		}
		p = a;
		i = 0;
		while (t < n - 1)
		{
			if (*(p + i) != 0)
			{
				k++;
			}
			if (k == m)
			{
				*(p + i) = 0;
				t++;
				k = 0;
			}
			i++;
			if (i == n)
			{
				i = 0;
			}
		}
		while (p == 0)
		{
			p++;
		}
		System.out.printf("%d\n", p);
		k = 0;
		t = 0;
	}
	public static void Main()
	{
		int n;
		int m;

		for (;;)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n == 0)
		{
			break;
		}
		f(n, m);
		}
	}
}

