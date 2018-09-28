package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int k1;
	int k2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] an = new int[300];
	int[] silly = new int[300];
	int i;
	int j;
	int e;
	int p = 0;
	int a = 0;
	int b;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		e = Integer.parseInt(tempVar2);
	}
	an[i] = e;
	}
	for (i = 0;i < n;i++)
	{
	p = 0;
	for (j = i - 1;j >= 0;j--)
	{
	if (an[i] == an[j])
	{
		p++;
	}
	}
	if (p == 0)
	{
		silly[a] = an[i];
		a++;
	}
	}
	for (i = 0;i < a;i++)
	{
	System.out.printf("%d",silly[i]);
	if (i != a - 1)
	{
		System.out.print(",");
	}
	}
	return 0;
	}

}

