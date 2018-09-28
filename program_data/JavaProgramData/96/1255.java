package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String n = new String(new char[100]);
	int a;
	int[] b = new int[100];
	int[] c = new int[99];
	int i;
	int j;
	int p;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = tempVar.charAt(0);
	}
	a = n.length();
	for (i = 0;i < a;i++)
	{
	b[i] = n.charAt(i) - '0';
	}
	if (a == 1)
	{
	System.out.print("0\n");
	System.out.printf("%d",b[0]);
	}
	else if (a == 2 && 10 * b[0] + b[1] < 13)
	{
	System.out.print("0\n");
	System.out.printf("%d",10 * b[0] + b[1]);
	}
	else
	{
	p = 10 * b[0] + b[1];
	for (i = 0;i < a - 2;i++)
	{
	c[i] = (p - p % 13) / 13;
	p = (p % 13) * 10 + b[i + 2];
	}
	c[a - 2] = (p - p % 13) / 13;
	q = p % 13;
	for (i = 0;i < a - 1;i++)
	{
	if (i == 0 && c[i] == 0)
	{
	continue;
	}
	else if (i == a - 2)
	{
	System.out.printf("%d\n",c[i]);
	}
	else
	{
	System.out.printf("%d",c[i]);
	}
	}
	System.out.printf("%d",q);
	}
	}
}

