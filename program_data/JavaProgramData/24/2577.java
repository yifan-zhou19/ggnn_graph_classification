package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] p = new int[200];
		int i = 0;
		int j = 0;
		int b = 0;
		int c = 10;
		String q = new String(new char[10]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	q = new Scanner(System.in).nextLine();
	char[][] a = new char[200][200];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = tempVar2.charAt(0);
	}
	}
	for (i = 0;i < n;i++)
	{
	p[i] = String.valueOf(a[i]).length();
	}
	for (i = 0;i < n;i++)
	{
	if (b < p[i])
	{
	b = p[i];
	}
	}
	for (i = 0;i < n;i++)
	{
	if (c > p[i])
	{
	c = p[i];
	}
	}
	for (i = 0;i < n;i++)
	{
	if (p[i] == b)
	{

			System.out.printf("%s\n",a[i]);
		break;
	}
	}
	for (i = 0;i < n;i++)
	{
	if (p[i] == c)
	{

			System.out.printf("%s",a[i]);
		break;
	}
	}
	return 0;
	}
}

