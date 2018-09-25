package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag = 1;
		int n;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] c = new int[10000];
		int[] d = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = a;
		int[] q = b;
		for (int i = 0; ; i++)
		{
			p[i] = ConsoleInput.readToWhiteSpace(true);
			q[i] = ConsoleInput.readToWhiteSpace(true);
			if (p[i] == q[i] && p[i] == 0)
			{
				break;
			}
			c[q[i]]++;
			d[p[i]]++;
			if (c[q[i]] == n - 1 && d[q[i]] == 0)
			{
				System.out.print((q + i));
				flag = 0;
			}
		}
		if (flag == 1)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}

