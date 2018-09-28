package <missing>;

public class GlobalMembers
{
	public static int move(int i)
	{
		int j = i / 2;
		int k = i * 3 + 1;
		if (i == 1)
		{
	System.out.print("End");
		}
	else if (i % 2 == 0)
	{
	System.out.printf("%d/2=%d\n",i,j);
	return (j);
	}
	else
	{
	System.out.printf("%d*3+1=%d\n",i,k);
	return (k);
	}
	}
	public static void hanoi(int n)
	{
		int z;
		if (n == 1)
		{
	move(n);
		}
	else
	{
		z = move(n);
	hanoi(z);
	}
	}
	public static void Main()
	{
		int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	hanoi(a);
	}
}

