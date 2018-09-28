package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int n1;
	int i;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 1)
	{
		System.out.print("End\n");
	}


	if (n != 1)
	{
	do
	{
	if (n % 2 == 1)
	{
	n1 = n * 3 + 1;
	System.out.printf("%d*3+1=%d\n",n,n1);
	n = n1;
	}
	if (n % 2 == 0)
	{
	n1 = n / 2;
	System.out.printf("%d/2=%d\n",n,n1);
	n = n1;
	}
	}while (n != 1);
	System.out.print("End\n");
	}
	}
}

