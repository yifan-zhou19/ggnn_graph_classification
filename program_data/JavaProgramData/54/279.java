package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int k;
	int a;
	int i;
	i = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	if (n == 2)
	{
		a = 8 - k;
	}
	else
	{
		a = n;
		do
		{
		a = a * n;
		i = i + 1;
		}while (i != n);
		a = a - (n - 1) * k;
	}
	System.out.printf("%d",a);
	}
}

