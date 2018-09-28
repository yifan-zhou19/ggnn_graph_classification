package <missing>;

public class GlobalMembers
{
	public static int sushu(int p,int n)
	{
		if (p > n / 2)
		{
			return 1;
		}
		else if (n % p == 0)
		{
			return 0;
		}
		else
		{
			return sushu(p + 1, n);
		}
	}
	public static int huiwen(int n)
	{
		int[] a = new int[100];
		int flag;
		int i;
		for (i = 0;n != 0;i++)
		{
			a[i] = n % 10;
			n = n / 10;
			flag = i;
		}
		for (i = 0;i <= flag;i++)
		{
			if (a[i] != a[flag - i])
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int a;
		int b;
		int i;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = a;i <= b;i++)
		{
			if (huiwen(i) == 1 && sushu(2, i) == 1 && flag == 0)
			{
				System.out.printf("%d",i);
				flag = 1;
			}
			else if ((huiwen(i) == 1) && (sushu(2, i) == 1) && (flag == 1))
			{
				System.out.printf(",%d",i);
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}



}

