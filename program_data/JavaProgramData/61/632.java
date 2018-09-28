package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] u = new int[1000];
	int i;
	int a1;
	int a2;
	int a;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			u[i] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
		a1 = 1;
		a2 = 1;
	for (j = 1;j <= u[i];j++)
	{
		if (j == 1 || j == 2)
		{
			a = 1;
		}
	else
	{
		a = a1 + a2;
		a1 = a2;
		a2 = a;
	}
	}
	System.out.printf("%d\n",a);
	}
	return 0;
	}
}

