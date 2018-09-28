package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		int b;
		int gede = int;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
	for (j = 6;j <= b;j = j + 2)
	{
	gede(j);
	}
	}
	public static int gede(int n)
	{
	int i;
	int d;
	int sushu = int;
	d = n / 2;
	for (i = 3;i <= d;i = i + 2)
	{
			 if (sushu(i) == 1 && sushu(n - i) == 1)
			 {
				 System.out.printf("%d=%d+%d\n",n,i,n - i);
			 break;
			 }
	}
	return (0);
	}
	public static int sushu(int a)
	{
		int i;
		int b;
		int ok;
	ok = 1;
	b = Math.sqrt(a) + 1;
	for (i = 2;i <= b;i++)
	{
	if (a % i == 0)
	{
		ok = 0;
	}
	}
	return (ok);
	}

}

