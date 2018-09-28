package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int i;
	int j;
	int[] d = new int[1000];
	int[] e = new int[1000];
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
		d[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < a;i++)
	{
		e[0] = 1;
	e[1] = 1;
	if (d[i] <= 2)
	{
	System.out.print("1");
	}
	else
	{
		for (j = 2;j < d[i];j++)
		{
	e[j] = e[j - 1] + e[j - 2];
		}
	System.out.printf("%d\n",e[j - 1]);
	}
	}
	}
}

