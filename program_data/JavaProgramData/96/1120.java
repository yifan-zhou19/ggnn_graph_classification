package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String n = new String(new char[100]);
	int[] a = new int[100];
	int[] b = new int[100];
	int yu;
	int i;
	int j;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = tempVar.charAt(0);
	}
		x = n.length();
	for (i = 0;i < x;i++)
	{
	a[i] = n.charAt(i) - '0';
	}
	if (x == 1)
	{
		System.out.printf("0\n%d",a[0]);
	}
	else
	{
	if (x == 2 && (a[0] * 10 + a[1] < 13))
	{
		System.out.printf("0\n%d",a[0] * 10 + a[1]);
	}
		else
		{
	b[0] = (10 * a[0] + a[1]) / 13;
	yu = (10 * a[0] + a[1]) % 13;
	if (b[0] != 0)
	{
	System.out.printf("%d",b[0]);
	for (i = 2;i < x;i++)
	{
	b[i - 1] = (yu * 10 + a[i]) / 13;
	yu = (yu * 10 + a[i]) % 13;
	}
	for (i = 1;i < x - 1;i++)
	{
		System.out.printf("%d",b[i]);
	}
	System.out.printf("\n%d",yu);
	}
	if (b[0] == 0)
	{
	b[0] = (100 * a[0] + 10 * a[1] + a[2]) / 13;
	yu = (100 * a[0] + 10 * a[1] + a[2]) % 13;
	System.out.printf("%d",b[0]);
	for (i = 3;i < x;i++)
	{
	b[i - 2] = (yu * 10 + a[i]) / 13;
	yu = (yu * 10 + a[i]) % 13;
	}
	for (i = 1;i < x - 2;i++)
	{
		System.out.printf("%d",b[i]);
	}
	System.out.printf("\n%d",yu);
	}
		}
	}
	return 0;
	}
}

