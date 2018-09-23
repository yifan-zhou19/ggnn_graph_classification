package <missing>;

public class GlobalMembers
{
	public static int sushu(int p)
	{
		int i;
		if (p == 2)
		{
			return 1;
		}
		else
		{
			for (i = 2;i < p;i++)
			{
				if (p % i == 0)
				{
					return 0;
				}
			}
			if (i == p)
			{
				return 1;
			}
		}
	}
	public static int nixu(int n)
	{
		int i;
		int sit = 0;
		int[] data = new int[1000];
		int sum = 0;
		for (i = 0;n != 0;i++)
		{
			data[i] = n % 10;
			n = n / 10;
		}
		sit = i;
		for (i = 0;i < sit;i++)
		{
			sum += data[sit - 1 - i] * Math.pow(10,i);
		}
		return sum;
	}
	public static int jiecheng(int n)
	{
		int i;
		int sum = 1;
		if (n == 0)
		{
			return 1;
		}
		else
		{
			for (i = 1;i <= n;i++)
			{
				sum *= i;
			}
			return sum;
		}
	}
	public static void Main()
	{
		String a = new String(new char[300]);
		int[] b = new int[200];
		a = new Scanner(System.in).nextLine();
		int l;
		int i;
		int j;
		int c = 0;
		l = a.length();
		for (i = 0;i < 200;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < l;i++)
		{
			if ((a.charAt(i) > 64 && a.charAt(i) < 91) || (a.charAt(i)>96 && a.charAt(i) < 123))
			{
				b[a.charAt(i)]++;
				j = a.charAt(i);
				c++;
			}
		}
		if (c == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 65;j < 91;j++)
			{
				if (b[j] != 0)
				{
					System.out.printf("%c=%d\n",j,b[j]);
				}
			}
			for (j = 97;j < 123;j++)
			{
				if (b[j] != 0)
				{
					System.out.printf("%c=%d\n",j,b[j]);
				}
			}
		}
	}

}
