package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k = 0;
		int flag;
		int a;
		int b;
		int s;
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
		i = n;
		while (i <= m)
		{
			a = i;
			s = 0;
			while (a > 0)
			{
				b = a % 10;
				s = s * 10 + b;
				a = a / 10;
			}
			if (s == i)
			{
				j = 2;
				flag = 0;
				while (j <= i / 2)
				{
					if (i % j == 0)
					{
						flag = 1;
					}
					j++;
				}
				if (flag == 0)
				{
					k++;
					if (k == 1)
					{
						System.out.printf("%d",i);
					}
					if (k > 1)
					{
						System.out.printf(",%d",i);
					}
				}
			}
			i++;
		}

		if (k == 0)
		{
			System.out.print("no");
		}
	}





}

