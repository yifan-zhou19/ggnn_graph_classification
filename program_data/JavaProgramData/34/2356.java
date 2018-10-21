package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int b;
		int[] a = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n != 1)
	{
	do
	{
	if (n % 2 != 0)
	{
		System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
	 n = n * 3 + 1;
	}
	else
	{
		System.out.printf("%d/2=%d\n",n,n / 2);
			n = n / 2;
	}
	} while (n > 1);

	System.out.print("End");
	}
	else
	{

	System.out.print("End");
	}

	return 0;
	}
}

