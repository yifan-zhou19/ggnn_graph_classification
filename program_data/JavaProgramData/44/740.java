package <missing>;

public class GlobalMembers
{
	public static int number(int n)
	{
		int a;
		int number = 0;
		if (n >= 0)
		{
		while (n != 0)
		{
			a = n % 10;
			number = number * 10 + a;
			n = n / 10;
		}
		return number;
		}
		if (n < 0)
		{
			n = -n;
			while (n != 0)
			{
			 a = n % 10;
			 number = number * 10 + a;
			 n = n / 10;
			}
			return -number;
		}

	}
	public static void Main()
	{
		int[] A = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				A[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",number(A[i]));
		}

	}
}

