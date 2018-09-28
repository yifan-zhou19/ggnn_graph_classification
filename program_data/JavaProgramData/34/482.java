package <missing>;

public class GlobalMembers
{
	public static int j(int x)
	{
		int a = 0;
		if (x % 2 == 0)
		{
			a = x / 2;
		}
		else
		{
			a = 3 * x + 1;
		}
		return a;
	}
	public static int Main()
	{
	int e;
	int k;
	int n;
	int i;
	int l;
	int[] a = new int[1000];
	int[] b = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a[0] = n;
	k = n;
	l = 0;
	e = 0;
	while (true)
	{
		if (n == 1)
		{
			l++;
			a[l] = 0;
			e++;
			break;
		}
		if (n % 2 == 0)
		{
			b[l] = 0;
		}
		else
		{
			b[l] = 1;
		}
		n = j(n);
		a[l] = n;
		l++;
		a[l] = j(n);
		e++;
	}
	if (e == 1)
	{
		System.out.print("End");
	}
	if (e == 2)
	{
		System.out.printf("%d/2=%d\n",2,1);
		System.out.print("End");
		return 0;

	}
	for (i = 0;i < e-1;i++)
	{
		if (i == 0)
		{
			if (b[i] == 0)
			{
				System.out.printf("%d/2=%d\n",k,a[i]);
			}
			else
			{
				System.out.printf("%d*3+1=%d\n",k,a[i]);
			}
		}
		else if (i >= 1 && i < e-2)
		{
			if (b[i] == 0)
			{
				System.out.printf("%d/2=%d\n",a[i - 1],a[i]);
			}
			 else
			 {
				System.out.printf("%d*3+1=%d\n",a[i - 1],a[i]);
			 }
		}
		else if (i == e-2)
		{
			System.out.printf("%d/2=%d\n",a[i - 1],a[i]);
			System.out.print("End");
			return 0;
		}
	}
	return 0;
	}


}

