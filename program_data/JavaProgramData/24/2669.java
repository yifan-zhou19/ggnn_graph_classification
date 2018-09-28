package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int l;
	int s;
	int ln = 0;
	int sn = 30;
	int i = 0;
	char[][] a = new char[200][30];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (n-- != 0)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = tempVar2.charAt(0);
	}
	if (ln < String.valueOf(a[i]).length())
	{
	ln = String.valueOf(a[i]).length();
	l = i;
	}
	if (sn > String.valueOf(a[i]).length())
	{
	sn = String.valueOf(a[i]).length();
	s = i;
	}
	i++;
	}
	System.out.printf("%s\n%s",a[l],a[s]);
	}

}

