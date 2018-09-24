package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int i;
	int k;
	int m;
	int n;
	String sz = new String(new char[300]);
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
		sz = tempVar2.charAt(0);
	}
	for (k = 0;k < sz.length();k++)
	{
	switch (sz.charAt(k))
	{
	case 'A':
	System.out.print("T");
	break;
	case 'T':
	System.out.print("A");
	break;
	case 'C':
	System.out.print("G");
	break;
	case 'G':
	System.out.print("C");
	break;
	}
	}
	System.out.print("\n");
	}
	return 0;
	}
}

