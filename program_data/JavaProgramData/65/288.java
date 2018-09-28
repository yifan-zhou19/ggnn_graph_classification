package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
	int[] s = new int[200];
	int[] p = new int[200];
	a = 0;
	b = 0;
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
		s[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p[i] = Integer.parseInt(tempVar3);
	}
	if (s[i] == 0 && p[i] == 1 || s[i] == 1 && p[i] == 2 || s[i] == 2 && p[i] == 0)
	{
	a++;
	}
	else if (p[i] == 0 && s[i] == 1 || p[i] == 1 && s[i] == 2 || p[i] == 2 && s[i] == 0)
	{
	b++;
	}
	else if (p[i] == 0 && s[i] == 0 || p[i] == 1 && s[i] == 1 || p[i] == 2 && s[i] == 2)
	{
	a = a;
	b = b;
	}
	}
	if (a > b)
	{
	System.out.print("A");
	}
	if (a < b)
	{
	System.out.print("B");
	}
	if (a == b)
	{
	System.out.print("Tie");
	}
	return 0;
	}
}

