package <missing>;

public class GlobalMembers
{
	public static int huiwen(int a)
	{
		int[] b = new int[100];
		int i;
		int j;
		int k;
		for (i = 0;;)
		{
			if (a == 0)
			{
				break;
			}
			else
			{
				b[i] = a % 10;
				a = a / 10;
				i++;
			}
		}
		for (j = 0;j < i;j++)
		{
			if (b[j] != b[i - 1 - j])
			{
				break;
			}
		}
		if (j == i)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int sushu(int a)
	{
		int i;
		int j;
		for (i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i == a)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t1;
		int t2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			t1 = huiwen(i);
			t2 = sushu(i);
			if (t1 == 1 && t2 == 1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		if (i == n + 1)
		{
			System.out.print("no");
		}
		else
		{
			for (j = i + 1;j <= n;j++)
			{
			t1 = huiwen(j);
			t2 = sushu(j);
			if (t1 == 1 && t2 == 1)
			{
				System.out.printf(",%d",j);
			}
			}
		}
	}

}

