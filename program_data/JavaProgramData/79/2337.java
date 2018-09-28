package <missing>;

public class GlobalMembers
{
	public static int num(int a,int b)
	{
		int i;
		if (a == 1)
		{
			i = 1;
		}
		if (a == 2)
		{
			if (b % 2 == 0)
			{
				i = 1;
			}
			else
			{
				i = 2;
			}
		}
		if (a > 2)
		{
			i = (num(a - 1, b) + b % a) % a;
		}
		if (i == 0)
		{
			i = a;
		}
		return i;
	}
	public static int Main()
	{
	   int c;
	   for (c = 1;c != 0;)
	   {
		int n;
		int m;
		int k;
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
		c = n;
		if (c == 0)
		{
			break;
		}
		k = num(n, m);
		if (k == 0)
		{
		   System.out.printf("%ld\n",n);
		}
		else
		{
		   System.out.printf("%ld\n",k);
		}
	   }

	}
}

