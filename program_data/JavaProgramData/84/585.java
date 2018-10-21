package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int[] s = new int[100];
	int n;
	int a;
	int b;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s[0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		s[1] = Integer.parseInt(tempVar3);
	}
	if (s[0] > s[1])
	{
		a = s[0];
		b = s[1];
	}
	else
	{
		a = s[1];
		b = s[0];
	}
	for (i = 2;i <= (n - 1);i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		s[i] = Integer.parseInt(tempVar4);
	}
	if (a > s[i] && s[i] > b)
	{
		t = b;
		b = s[i];
		s[i] = t;
	}
	else if (s[i] > a)
	{
	t = a;
	b = t;
	a = s[i];
	}
	}
	System.out.printf("%d\n%d\n",a,b);
	return 0;
	}

}

