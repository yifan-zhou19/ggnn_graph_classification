package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
	 int[] b = new int[300];
	 int c;
	 int d;
	 int e;
	a = new Scanner(System.in).nextLine();
	d = 0;
	e = 0;
	for (c = 0;(a.charAt(c) != '\0');c++)
	{
		if (a.charAt(c) != ' ')
		{
			d = d + 1;
		}
	else if (d != 0)
	{
		b[e] = d;
		e = e+1;
		d = 0;
	}
	}
	b[e] = d;
	for (c = 0;c <= e-1;c++)
	{
		System.out.printf("%d,",b[c]);
	}
	System.out.printf("%d",b[e]);
	}

}
