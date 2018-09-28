package <missing>;

public class GlobalMembers
{
	public static void judge_huiwen(int n, int[] t)
	{
		if (n / 10 == 0)
		{
			t[0] = 10 * t[0] + n;
		}
		else if (n / 10 != 0)
		{
			t[0] = n % 10 + 10 * t[0];
			n = n / 10;
			judge_huiwen(n, t);
		}
	}

	public static void judge_sushu(int n, int[] t)
	{
		int i;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				t[1] = 1;
				break;
			}
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int[] t = new int[2];
		int x = 0;
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
		for (i = m;i <= n;i++)
		{
			judge_huiwen(i, t);
			judge_sushu(i, t);
			if ((t[0] == i) && (t[1] == 0))
			{
				System.out.printf("%d",i);
				x = 1;
				break;
			}
			t[0] = 0;
			t[1] = 0;
		}
		for (i = i + 1;i <= n;i++)
		{
			judge_huiwen(i, t);
			judge_sushu(i, t);
			if (t[0] == i && t[1] == 0)
			{
				System.out.printf(",%d",i);
			}
			t[0] = 0;
			t[1] = 0;
		}
		if (x == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}
}

