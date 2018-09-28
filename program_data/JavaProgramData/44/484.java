package <missing>;

public class GlobalMembers
{
	public static int fan(int a)
	{
		int i;
		int j;
	int k;
	int b = 0;
	int[] c = new int[10];
	if (a < 0)
	{
		k = 1;
	a = -a;
	}
	else if (a == 0)
	{
		return 0;
	}
	else
	{
		k = 0;
	}
	for (i = 0;i < 10;i++)
	{
	c[i] = '\0';
	}
	for (i = 0;i < 10;i++)
	{
		c[i] = a % 10;
	a = a / 10;
	if (a == 0)
	{
	break;
	}
	}
	for (j = 0;j <= i;j++)
	{
		b = b * 10;
	b = b + c[j];
	}
	if (k == 0)
	{
	return b;
	}
	else
	{
	return -b;
	}

	}

	public static int Main()
	{
		int i;
		int j;
	int a;
	int b;
	for (i = 0;i < 6;i++)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b = fan(a);
	System.out.print(b);
	System.out.print("\n");
	}
	return 0;
	}
}

