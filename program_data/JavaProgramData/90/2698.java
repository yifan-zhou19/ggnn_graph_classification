package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int sum;
		int a;
		int b;
		int i;
	int f = new int(int x,int y);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (i = 0;i < a;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	sum = f(m, n);
	System.out.printf("%d\n",sum);
	}
		return 0;
	}

	public static int f(int m,int n)

	{
		if (m == 0 || n == 1)
		{
			return 1;
		}
	 if (n > m)
	 {
		 return f(m, m);
	 }
	 if (n == 1)
	 {
		 return 1;
	 }
	 else if (n != 1)
	 {
		 return (f(m, n - 1) + f(m - n, n));
	 }


	}





}

