package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[10000];
	int n;
	int i;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		   int sum = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
		sum = fei(b);
		System.out.printf("%d\n",sum);
	}
	}

	public static int fei(int n)
	{
	if (n == 1)
	{
	   return 1;
	}
	 if (n == 2)
	 {
	   return 1;
	 }
	 return (fei(n - 1) + fei(n - 2));

	}
}

