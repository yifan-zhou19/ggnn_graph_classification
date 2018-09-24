package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int m;
	int k = 0;
	int l = 0;
	String s1 = new String(new char[10]);
	String s2 = new String(new char[10]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s1 = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		s2 = tempVar2.charAt(0);
	}

	n = s1.length();
	m = s2.length();

	for (i = 0;i < n;i++)
	{
		k = k + s1.charAt(i);
	}
	for (j = 0;j < m;j++)
	{
		l = l + s2.charAt(j);
	}

	if (k == l)
	{
		System.out.print("YES");
	}
	else
	{
		System.out.print("NO");
	}
	}
}

