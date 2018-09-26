package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int prime_number = int i;
		int palindrome_number = int i;
		int m;
		int n;
		int a;
		int b;
		int i;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m,flag = 0;i <= n;i++)
		{
			a = prime_number(i);
			b = palindrome_number(i);
			if (a == 1 && b == 1)
			{
				flag++;
				if (flag == 1)
				{
					System.out.printf("%d",i);
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("no\n");
		}
	}
		public static int prime_number(int i)
		{
			int j;
			int k;
			int z;
			int p;
			int l;
			z = 0;
			k = Math.sqrt(i);
			for (j = 2,l = 0;j <= k;j++)
			{
				p = i % j;
				if (p == 0)
				{
					l++;
				}
			}
			if (l == 0)
			{
				z = 1;
			}
			return (z);
		}
		public static int palindrome_number(int i)
		{
			int a;
			int b;
			int c;
			int d;
			int e;
			int h;
			int z;
			z = 0;
			if (i > 0 && i < 10)
			{
				z = 1;
			}
			else if (i >= 10 && i < 100)
			{
				b = i / 10;
				a = i - b * 10;
				h = a * 10 + b;
				if (h == i)
				{
					z = 1;
				}
			}
			else if (i >= 100 && i < 1000)
			{
				c = i / 100;
				b = (i - c * 100) / 10;
				a = i - c * 100 - b * 10;
				h = a * 100 + b * 10 + c;
				if (h == i)
				{
					z = 1;
				}
			}
			else if (i >= 1000 && i < 10000)
			{
				d = i / 1000;
				c = (i - d * 1000) / 100;
				b = (i - d * 1000 - c * 100) / 10;
				a = i - d * 1000 - c * 100 - b * 10;
				h = a * 1000 + b * 100 + c * 10 + d;
				if (h == i)
				{
					z = 1;
				}
			}
			else
			{
				e = i / 10000;
				d = (i - e * 10000) / 1000;
				c = (i - e * 10000 - d * 1000) / 100;
				b = (i - e * 10000 - d * 1000 - c * 100) / 10;
				a = i - e * 10000 - d * 1000 - c * 100 - b * 10;
				h = a * 10000 + b * 1000 + c * 100 + d * 10 + e;
				if (h == i)
				{
					z = 1;
				}
			}
			return (z);
		}






}

