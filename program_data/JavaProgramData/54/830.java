package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int k;
	int M;
	int i;
	int brk = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (M = n + k;;M += n)
	{
		m = M;
	for (i = 0;i < n;i++)
	{
		if (m % n != k)
		{
		brk = 1;
		break;
		}
	m = m - k - m / n;
	}
	if (brk == 0 && m > 0)
	{
	break;
	}
	brk = 0;
	}
	System.out.print(M);
	return 0;
	}
}

