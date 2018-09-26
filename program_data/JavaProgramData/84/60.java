package <missing>;

public class GlobalMembers
{
	public static void swep(tangible.RefObject<Integer> m, tangible.RefObject<Integer> n)
	{
		int t;
		t = m.argValue;
		m.argValue = n.argValue;
		n.argValue = t;
	}

	public static int Main()
	{
		int n;
	int i;
	int[] a;
	int b;
	int c;

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a = new int[n];

	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

	b = a[0];
	c = a[1];
	if (c > b)
	{
tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
tangible.RefObject<Integer> tempRef_c = new tangible.RefObject<Integer>(c);
	swep(tempRef_b, tempRef_c);
	c = tempRef_c.argValue;
	b = tempRef_b.argValue;
	}

	for (i = 2;i < n;i++)
	{
		if (a[i] > b)
		{
			c = b;
			b = a[i];
		}
		else if (a[i] > c)
		{
			c = a[i];
		}
	}
	System.out.print(b);
	System.out.print("\n");
	System.out.print(c);
	return 0;
	}

}

