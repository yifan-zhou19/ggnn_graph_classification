package <missing>;

public class GlobalMembers
{
	public static int s(int n,int k,int m,int i)
	{
		if (i != n)
		{
			++i;
		 if (m % (n - 1) == 0)
		 {
		return s(n, k, m * n / (n - 1) + k, i);
		 }
		 else
		 {
			 return -1;
		 }
		}
	else
	{
		return m;
	}
	}
	public static int Main()
	{
		int n;
		int k;
		int m;
		int i = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;;++i)
		{
			if (s(n, k, i, 0) == -1)
			{
				continue;
			}
			else
			{
				System.out.print(s(n, k, i, 0));
				break;
			}
		}
		return 0;
	}



}

