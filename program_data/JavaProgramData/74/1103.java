package <missing>;

public class GlobalMembers
{
	public static int lenth(int a)
	{
		int n = 0;
		while (a / 10 > 0)
		{
			n = n + 1;
			a = a / 10;
		}
		return n;
	}
	public static int nixu(int a,int n)
	{
		int z;
		int m;
		int i;
		if (a < 10)
		{
			z = a;
		}
		else
		{
		  m = a % 10;
		  for (i = 1;i <= n;i++)
		  {
			  m = m * 10;
		  }
		  z = m + nixu(a / 10, n - 1);
		}
		return z;
	}
	public static int huiwen(int a)
	{
		int z;
		int m;
		m = nixu(a, lenth(a));
		if (m == a)
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return z;
	}
	public static int sushu(int a)
	{
		int i;
		int z;
		for (i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
			z = 0;
			break;
			}
		}
		if (i == a)
		{
			z = 1;
		}
		return z;
	}
	public static void Main()
	{
		int a;
		int b;
		int i;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		if (a > b)
		{
			for (i = b;i <= a;i++)
			{
				if (huiwen(i) != 0 && sushu(i) != 0)
				{
				s = s + 1;
				System.out.printf("%d",i);
				break;
				}
			}

			for (i = i + 1;i <= a;i++)
			{
				if (huiwen(i) != 0 && sushu(i) != 0)
				{
				s = s + 1;
				System.out.printf(",%d",i);
				}
			}
			if (s == 0)
			{
				System.out.print("no");
			}
		}
		else
		{
			for (i = a;i <= b;i++)
			{
				if (huiwen(i) != 0 && sushu(i) != 0)
				{
				s = s + 1;
				System.out.printf("%d",i);
				break;
				}
			}
			for (i = i + 1;i <= b;i++)
			{
				if (huiwen(i) != 0 && sushu(i) != 0)
				{
				s = s + 1;
				System.out.printf(",%d",i);
				}
			}
			if (s == 0)
			{
				System.out.print("no");
			}
		}
	}
}

