package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] c = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int n;
	int m;
	int j;
	int a;
	int b;
	int s;
	int i;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (j = 1;j <= m;j++)
	{
	c[2] = 28;
	s = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		b = Integer.parseInt(tempVar4);
	}
	if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
	{
	c[2] = 29;
	}
	if (a > b)
	{
		t = a;
		a = b;
		b = t;
	}
	for (i = a;i < b;i++)
	{
	s += c[i];
	}
	if (s % 7 == 0)
	{
	System.out.print("YES\n");
	}
	else
	{
	System.out.print("NO\n");
	}
	}
	System.in.read();
	System.in.read();
	}

}

