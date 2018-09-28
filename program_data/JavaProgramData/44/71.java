package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
	int[] c = new int[6];
	int i;
	int j;
	int k;
	int w = 0;
	for (i = 1;i <= 6;i++)
	{
	c[i] = 0;
	c[i] = num % 10;
	num = num - c[i];
	if (num == 0)
	{
	break;
	}
	num = num / 10;
	}
	for (j = 1;j <= i;j++)
	{
	for (k = 1;k <= (i - j);k++)
	{
	c[k] = c[k] * 10;
	}
	}
	for (k = 1;k <= i;k++)
	{
	w = w + c[k];
	}
	return (w);
	}
	public static int Main()
	{
	int[] a = new int[6];
	int i;
	int d;
	for (i = 0;i <= 5;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = Integer.parseInt(tempVar);
	}
	}
	for (i = 0;i <= 5;i++)
	{
	if (a[i] > 0)
	{
	d = reverse(a[i]);
		System.out.printf("%d\n",d);
	}
	else if (a[i] == 0)
	{
	System.out.print("0\n");
	}
	else
	{
	d = -reverse(-a[i]);
	System.out.printf("%d\n",d);
	}
	}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

