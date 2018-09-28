package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	int k;
	int d;
	int la;
	int lb;
	int forb;
	int n;
	int i;
	int[] c = new int[100];
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = tempVar3.charAt(0);
	}
	d = 10;
	la = a.length();
	lb = b.length();
	for (k = la - 1;k >= 0;k--)
	{
		if ((lb - la + k) < 0)
		{
	forb = 48;
		}
	else
	{
	forb = b.charAt(lb - la + k);
	}
		d = a.charAt(k) - 1 + d / 10 + 10 - forb;
	c[k] = d % 10;
	}
	for (k = 0;k <= la - 1;k++)
	{
		if (c[k] != 0)
		{
			break;
		}
	}
	for (;k <= la - 1;k++)
	{
	System.out.printf("%d",c[k]);
	}
	System.out.print('\n');
	}
	}
}

