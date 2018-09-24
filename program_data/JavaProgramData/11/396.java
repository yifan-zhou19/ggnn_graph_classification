package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int m;
		int d;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (k % 4 == 0)
		{
			if (k % 100 == 0)
			{
				if (k % 400 == 0)
				{
					i = 29;
				}
				else
				{
					i = 28;
				}
			}
			else
			{
				i = 29;
			}
		}
		else
		{
			i = 28;
		}
		if (m == 1)
		{
			System.out.printf("%d\n",d);
		}
		if (m == 2)
		{
			n = d + 31;
			System.out.printf("%d\n",n);
		}
			if (m == 3)
			{
				n = d + i + 31;
				System.out.printf("%d\n",n);
			}
			if (m == 4)
			{
				n = d + i + 31 + 31;
	System.out.printf("%d\n",n);
			}
	if (m == 5)
	{
				n = d + i + 31 + 30 + 31;
				System.out.printf("%d\n",n);
	}
			if (m == 6)
			{
				n = d + i + 31 + 31 + 30 + 31;
	System.out.printf("%d\n",n);
			}
	if (m == 7)
	{
				n = d + i + 31 + 31 + 31 + 60;
				System.out.printf("%d\n",n);
	}
			if (m == 8)
			{
				n = d + i + 184;
	System.out.printf("%d\n",n);
			}
	if (m == 9)
	{
				n = d + i + 184 + 31;
				System.out.printf("%d\n",n);
	}
			if (m == 10)
			{
				n = d + i + 31 + 30 + 184;
	System.out.printf("%d\n",n);
			}
			if (m == 11)
			{
				n = d + i + 31 + 61 + 184;
				System.out.printf("%d\n",n);
			}
			if (m == 12)
			{
				n = d + i + 31 + 30 + 61 + 184;
	System.out.printf("%d\n",n);
			}
	}
}

