package <missing>;

public class GlobalMembers
{
	public static int jisuan(int n, int k, int b, int a, tangible.RefObject<Integer> p)
	{
		int sum = 0;
		if (b == 1)
		{
			sum = n * a + k;
		}
		else
		{
			sum = jisuan(n, k, b - 1, a, p) * n / (n - 1) + k;
			if ((sum - k) % n != 0)
			{
				p.argValue = 1;
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int k;
		int b;
		int c = 0;
		int a;
		int s;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
		b = n;
		a = 1;
		p = c;
		if (n == 1)
		{
			System.out.printf("%d\n",1 + k);
		}
		else
		{
			for (a = 1;a <= 1000000;a++)
			{
				p = null;
			tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
				s = jisuan(n, k, b, a, tempRef_p);
				p = tempRef_p.argValue;
				if (p == 1)
				{
					continue;
				}
				if ((s - k) % n == 0)
				{
					break;
				}
					//printf("%d\n",s);
			}
			System.out.printf("%d\n",s);
		}
	}
}

