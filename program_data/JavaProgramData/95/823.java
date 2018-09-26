package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int k = 0;
	int[] a = new int[80];
	int[] b = new int[80];

	a[0] = System.in.read();
	if ((a[0] >= 65) && (a[0] <= 90))
	{
		a[0] = a[0] + 32;
	}

	for (i = 1;a[i - 1] != '\n';i++)
	{
		a[i] = System.in.read();
		if ((a[i] >= 65) && (a[i] <= 90))
		{
			a[i] = a[i] + 32;
		}
	}

	b[0] = System.in.read();
	if ((b[0] >= 65) && (b[0] <= 90))
	{
		b[0] = b[0] + 32;
	}
	for (i = 1;b[i - 1] != '\n';i++)
	{
		b[i] = System.in.read();
		if ((b[i] >= 65) && (b[i] <= 90))
		{
			b[i] = b[i] + 32;
		}
	}

	for (i = 0;((a[i - 1] != '\n') && (b[i - 1] != '\n'));i++)
	{
		if (a[i] > b[i])
		{
			System.out.print(">");
			continue;
		}
	else if (a[i] < b[i])
	{
		System.out.print("<");
		continue;
	}
	else if (a[i] == b[i])
	{
		k = k + 1;
	}
	}

	if (k == i)
	{
		System.out.print("=");
	}

	}
}
