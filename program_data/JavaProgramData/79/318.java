package <missing>;

public class GlobalMembers
{
	public static int calculate(int n,int m)
	{
		int num;
		int[] monkey = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		num = n;
		for (i = 0;i < n;i++)
		{
			monkey[i] = 1;
		}
		p = monkey[0] - 1;

		while (num != 1)
		{
			for (i = 1;i <= m;i++)
			{
				p += 1;
				if (p > monkey + n - 1)
				{
					p -= n;
				}
				while (p == 0)
				{
					p += 1;
					if (p > monkey + n - 1)
					{
						p -= n;
					}
				}
			}
			p = null;
			num -= 1;
		}
		i = 0;
		while (monkey[i] == 0)
		{
			i += 1;
		}
		return (i + 1);
	}


	public static void Main()
	{
		int n;
		int m;
		int king;
		do
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
			if (n != 0 && m != 0)
			{
				king = calculate(n, m);
				System.out.printf("%d\n",king);
			}
		}while (n != 0 && m != 0);
	}
}

