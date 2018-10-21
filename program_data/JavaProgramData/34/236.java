package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int count = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 1)
	{
	System.out.print("End");
	}
	else
	{
	do
	{
	if (n % 2 != 0)
	{
	n = n * 3 + 1; //?????n?3?1
	System.out.printf("%d*3+1=%d\n",(n - 1) / 3,n);
	}
	else
	{
	n /= 2; //????n??2
	System.out.printf("%d/2=%d\n",2 * n,n);
	}
	}while (n != 1); //n???1???????
	System.out.print("End");
	}
	}
}

