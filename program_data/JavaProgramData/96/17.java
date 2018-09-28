package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q,d,n,i,r;
	int q;
	int d;
	int n;
	int i;
	int r;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	q = (int)malloc(101 * (Integer.SIZE / Byte.SIZE));
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p = tempVar.charAt(0);
	}
	n = p.length();
	if (n == 1)
	{
	System.out.print("0\n");
	System.out.printf("%d",(p.charAt(0) - '0'));
	}
	else if (n == 2 && (((p.charAt(0) - '0') * 10 + p.charAt(1) - '0') < 13))
	{
		System.out.print("0\n");
		System.out.printf("%d",((p.charAt(0) - '0') * 10 + p.charAt(1) - '0'));
	}
	else
	{
	for (i = 0,d = ((p.charAt(0) - '0') * 10 + p.charAt(1) - '0');i < n - 2;i++)
	{
	if (d < 13)
	{
	q[i] = 0;
	d = (d * 10 + p.charAt(i + 2) - '0');
	}
	else
	{
	q[i] = d / 13;
	d = ((d - q[i] * 13) * 10 + p.charAt(i + 2) - '0');
	}
	}
	if (d < 13)
	{
	q[n - 2] = 0;
	r = d;
	}
	else
	{
	q[n - 2] = d / 13;
	r = (d - q[n - 2] * 13);
	}
	if (q[0] == 0)
	{
	for (i = 1;i <= (n - 2);i++)
	{
	System.out.printf("%d",q[i]);
	}
	}
	else
	{
	for (i = 0;i <= (n - 2);i++)
	{
	System.out.printf("%d",q[i]);
	}
	}
	System.out.print("\n");
	System.out.printf("%d",r);
	}
	return (0);
	}
}

