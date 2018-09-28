package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[100]);
	int[] b = new int[99];
	int[] d = new int[99];
	int m;
	int i;
	int n = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	m = a.length();
	if (m == 1)
	{
		System.out.printf("0\n%d",(a.charAt(0) - '0'));
	}
	else
	{
	if (m == 2)
	{
		System.out.printf("%d\n%d",(10 * (a.charAt(0) - '0') + (a.charAt(1) - '0') - (10 * (a.charAt(0) - '0') + (a.charAt(1) - '0')) % 13) / 13,(10 * (a.charAt(0) - '0') + (a.charAt(1) - '0')) % 13);
	}
	else
	{
		d[0] = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) % 13;
	b[0] = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0') - d[0]) / 13;
	for (i = 1;i <= m - 2;i++)
	{
		d[i] = (d[i - 1] * 10 + (a.charAt(i + 1) - '0')) % 13;
	b[i] = (d[i - 1] * 10 + (a.charAt(i + 1) - '0') - d[i]) / 13;
	}
	if (b[0] != 0)
	{
	System.out.printf("%d",b[0]);
	}
	for (i = 1;i <= m - 3;i++)
	{
	System.out.printf("%d",b[i]);
	}
	System.out.printf("%d\n",b[m - 2]);
	System.out.printf("%d",d[m - 2]);
	}
	}
	}
}

