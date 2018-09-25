package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int t;
		int prime = int t;
		int m;
		int n;
		int t;
		int k = 0;
		int rev;
		int f = 0;
		int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (t = m;t <= n;t++)
		{
			rev = reverse(t);
			if (t == rev)
			{
				f = prime(t);
				if (f == 1)
				{
					*p = t;
					p++;
					k++;

				}
			}

		}

		if (p > a)
		{
		for (p = a;p < a + k - 1;p++)
		{
				System.out.printf("%d,",*p);
		}
			System.out.printf("%d",*p);
		}
		else
		{
			System.out.print("no\n");
		}

	}
	public static int reverse(int t)
	{
		int r = 0;
		int[] b = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int rev;

		for (q = b;t >= 1;q++,r++)
		{
			*q = t % 10;
			t = t / 10;
		}
		q = b;
		for (rev = 0;q < b + r;q++)
		{
			rev = rev * 10 + *q;
		}
		return rev;
	}

	public static int prime(int t)
	{
		int k;
		int i;
		k = Math.sqrt(t);
		for (i = 2;i <= k;i++)
		{
			if (t % i == 0)
			{
				break;
			}
		}
		if (i > k)
		{
			return 1;
		}
		else
		{
			return 0;
		}

	}

}

