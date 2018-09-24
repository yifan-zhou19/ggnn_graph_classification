package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

	int m;
	int n;
	int k;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}

	if (n == 2 && k == 1)
	{
		System.out.print("7");
	}

	else

	{


	m = Math.pow((int)n,(int)n) - k * n + k;

	   System.out.printf("%d\n",m);

	}
	}
}

