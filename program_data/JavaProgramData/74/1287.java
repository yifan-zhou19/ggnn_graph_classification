package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sushu = int k;
		int hui = int j;
		int n;
		int m;
		int i;
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
			if (sushu(i) == 1 && hui(i) == 1)
			{
			t++;
		if (t == 1)
		{
			System.out.printf("%ld",i);
		}
		else if (t > 1)
		{
			System.out.printf(",%ld",i);
		}
			}
		}
		if (t == 0)
		{
			System.out.print("no\n");
		}
	}

	public static int sushu(int k)
	{
		int x;
	 for (x = 2;x < k / 2;x++)
	 {
		 if (k % x == 0)
		 {
			 return (0);
			 break;
		 }
	 }
	 if (x == k / 2)
	 {
		 return (1);
	 }
	}

	public static int hui(int j)
	{
		int p = 0;
		int temp;
		int a;
	temp = j;
	while (temp > 0)
	{
		a = temp % 10;
	p = p * 10 + a;
	temp /= 10;
	}
	if (p == j)
	{
		return (1);
	}
	else
	{
		return (0);
	}
	}
}

