package <missing>;

public class GlobalMembers
{
	public static int sushu(int b)
	{
		int flag = 1;
		int i;
		if (b == 2)
		{
			return 1;
		}
		if (b % 2 == 0)
		{
			return 0;
		}
		for (i = 2;i <= b / 2;i++)
		{
			if (b % i == 0)
			{
				flag = 0;
				break;
			}
		}
		if (flag == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int number(int a,int b)
	{
		int i;
		int total = 1;
		if (sushu(a) != 0)
		{
			total = 1;
			return total;
		}
		for (i = b;i <= a;i++)
		{

			if (a % i == 0 && a / i >= i)
			{
				total = total + number(a / i, i);
			}
		}
		return total;
	}
	public static void Main()
	{
		int n;
		int i;
		int[] A = new int[100];
		int[] B = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
			B[i] = number(A[i], 2);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",B[i]);
		}
	}
}

