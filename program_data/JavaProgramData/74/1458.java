package <missing>;

public class GlobalMembers
{
	public static int huiwen(int a)
	{
		int i;
		int j = 0;
		int flag = 1;
		int[] b = new int[10];
		while (a != 0)
		{
			b[j] = a % 10;
			a = a / 10;
			j++; //??
		}
		for (i = 0;i < j - i;i++)
		{
			if (b[i] != b[j - i - 1])
			{
				flag = 0;
				break;
			}
		}

		return flag;
	}
	public static int sushu(int n)
	{
		int i;
		int flag = 1;

			for (i = 2;i < n;i++)
			{
				if (n % i == 0)
				{
					flag = 0;
					break;
				}
			}

		return flag;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[100];
		int t = 0;
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
			if (huiwen(i) == 1 && sushu(i) == 1)
			{
				a[t] = i;
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < t;i++)
			{
			System.out.printf(",%d",a[i]);
			}
		}

		return 0;
	}
}

