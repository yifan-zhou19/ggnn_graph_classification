package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int h;
	int m;
	int p;
	h = 0;
	p = 0;
	String a = new String(new char[100000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	for (k = 0;a.charAt(k) != '\0';k++)
	{
	for (m = 0;a.charAt(m) != '\0';m++)
	{
	if (a.charAt(k) == a.charAt(m))
	{
	h = h + 1;
	}
	}
	if (h == 1)
	{
	System.out.printf("%c\n",a.charAt(k));
	p = 1;
	break;
	}
	h = 0;
	}
	if (p == 0)
	{
	System.out.print("no\n");
	}
	p = 0;
	h = 0;
	}
	return 0;
	}


}

