package <missing>;

public class GlobalMembers
{
	public static void judge_huiwen(int n, int[] t, int y, int x)
	{
		if (n / 10 == 0)
		{
			x = x * 10 + n;
			t[0] = x;
		}
		else
		{
			x = x * 10 + n % 10;
			n = n / 10;
			judge_huiwen(n, t, y, x);
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
		int y;
		int temp = 0;
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
			y = i;
			judge_huiwen(i, t, y, 0);
			judge_sushu(i, t);
			if (t[0] == i && t[1] == 0)
			{
				System.out.printf("%d",i);
				temp = 1;
				break;
			}
			t[0] = 0;
			t[1] = 0;
		}
		for (i = i + 1;i <= n;i++)
		{
			y = i;
			judge_huiwen(i, t, y, 0);
			judge_sushu(i, t);
			if (t[0] == i && t[1] == 0)
			{
				System.out.printf(",%d",i);
			}
			t[0] = 0;
			t[1] = 0;
		}
		if (temp == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}
}

