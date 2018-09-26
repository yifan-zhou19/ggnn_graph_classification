package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		void apple(int x,int y);
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
		apple(n, k);


	}
	public static void apple(int x,int y)
	{
		int a = 1;
		int b;
		int i = 2;
		int p = 1;
		b = x + y;
		while (i <= x)
		{
			if (b % (x - 1) == 0)
			{
				a = b / (x - 1);
				b = a * x + y;
			i = i + 1;
			}
			else
			{
				p = p + 1;

				a = p;
				b = a * x + y;
				i = 2;

			}

		}
		System.out.printf("%d\n",b);
	}



}

