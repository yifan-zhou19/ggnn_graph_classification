package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] q = new int[100];
	int[] w = new int[100];
	int[] r = new int[100];
	int[] t = new int[100];
	int[] y = new int[100];
	int[] u = new int[100];
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int s;
	int i;
	for (i = 1;i <= 100;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		d = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		e = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		f = Integer.parseInt(tempVar6);
	}
	q[i] = a;
	w[i] = b;
	r[i] = c;
	t[i] = d + 12;
	y[i] = e;
	u[i] = f;
	s = u[i] + y[i] * 60 + t[i] * 3600 - r[i] - w[i] * 60 - q[i] * 3600;
	if (s != 43200)
	{
	System.out.printf("%d\n",s);
	}
	else
	{
		break;
	}
	}
	return 0;
	}
}

