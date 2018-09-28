package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
	int i;
	int s;
	int t;
	i = 2;
	if (n == 3)
	{
	t = 1;
	}
	else
	{
	while (i <= Math.sqrt(n))
	{
		s = n % i;
		if (s != 0)
		{
			if (i == 2)
			{
				i = i + 1;
			}
			else
			{
				i = i + 2;
			}
		}
		else
		{
			break;
		}
	}
	if (i > Math.sqrt(n))
	{
		t = 1;
	}
	else
	{
		t = 0;
	}
	}
	return (t);
	}

	public static void Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		f = Integer.parseInt(tempVar);
	}
	for (a = 6;a <= f;a = a + 2)
	{


	for (j = 3;j <= a / 2;j = j + 2)
	{
		b = sushu(j);
		c = sushu(a - j);
		if (b == 1 && c == 1)
		{
			d = j;
			e = a - j;
			break;
		}
	}
	System.out.printf("%d=%d+%d\n",a,d,e);

	}
	}
}

