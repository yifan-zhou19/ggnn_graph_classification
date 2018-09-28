package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[500][41];
		int n;
		int i;
		int len;
		int[] b = new int[500];
		int[] q = b;
		String p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			*(p.Substring(i)) = ConsoleInput.readToWhiteSpace(true);
			q[i] = String.valueOf(*(p.Substring(i))).length();
		}
		System.out.print(p);
		len = q + 1;
		for (i = 1; i < n; i++)
		{
			if (len + q[i] <= 80)
			{
				System.out.print(' ');
				System.out.print((p.Substring(i)));
				len += 1 + q[i];
			}
			else
			{
				System.out.print("\n");
				System.out.print((p.Substring(i)));
				len = (q + i) + 1;
			}
		}
		return 0;
	}



}

