package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int m;
	int bd;
	int j;
	int k;
	String s = new String(new char[51]);
	String w = new String(new char[51]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		w = tempVar2.charAt(0);
	}
	n = w.length();
	m = s.length();
	for (i = 0;i < n;i++)
	{
	bd = 1;
	for (j = 0,k = i;j < m;j++,k++)
	{
	if (w.charAt(k) != s.charAt(j))
	{
	bd = 0;
	}
	}
	if (bd == 1)
	{
	System.out.printf("%d",i);
	break;
	}
	}
	return 0;
	}
}

