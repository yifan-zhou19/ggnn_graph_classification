package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[500];
		int t = 1;
		int s;
		int i;
		int j;
		int k;
		int l;
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(a[0]);
		for (i = 1;i < n;i++)
		{
			s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < t;j++)
			{
				if (s == a[j])
				{
					break;
				}
			}
			if (j == t)
			{
				System.out.print(",");
				System.out.print(s);
				a[t] = s;
				t++;
			}
		}
		System.out.print("\n");
		return 0;
	}
}

