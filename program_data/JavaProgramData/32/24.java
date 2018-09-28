package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int[] x = new int[102];
	int[] y = new int[102];
	int[] z = new int[102];
	int n;
	String s = new String(new char[103]);
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n-- != 0)
	{
	for (i = 0;i < 102;i++)
	{
		x[i] = 0;
		y[i] = 0;
		z[i] = 0;
	}
	s = ConsoleInput.readToWhiteSpace(true).charAt(0);
	for (i = 0;i < s.length();i++)
	{
		x[101 - s.length() + i + 1] = (int)(s.charAt(i) - 48);
	}
	s = ConsoleInput.readToWhiteSpace(true).charAt(0);
	for (i = 0;i < s.length();i++)
	{
		y[101 - s.length() + i + 1] = (int)(s.charAt(i) - 48);
	}
	for (i = 101;i > 0;i--)
	{
		if (x[i] < y[i])
		{
			z[i] = x[i] + 10 - y[i];
			x[i - 1]--;
		}
		else
		{
			z[i] = x[i] - y[i];
		}
	}
	for (i = 0;i < 102;i++)
	{
		if (z[i] != 0)
		{
			break;
		}
	}
	if (i == 102)
	{
		System.out.print(z[i - 1]);
		return 0;
	}
	for (;i < 102;i++)
	{
		System.out.print(z[i]);
	}
	System.out.print('\n');
	}
	}
}

