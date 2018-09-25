package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final String a = "";
		String p = *a;
		int[] num = new int[1000];
		int[] q = num;
		int i;
		for (i = 0;i < n;i++)
		{
				*(a.Substring(i)) = ConsoleInput.readToWhiteSpace(true);
				q[i] = String.valueOf(*(a.Substring(i))).length();
		}
		int count = q[0];
		System.out.print(a);
		for (i = 1;i < n - 1;i++)
		{
			if (count + q[i] + 1 <= 80)
			{
					System.out.print(" ");
					System.out.print((a.Substring(i)));
					count += q[i] + 1;
					continue;
			}
			if (count + q[i] + 1 > 80)
			{
				System.out.print("\n");
				System.out.print((a.Substring(i)));
				count = q[i];
				continue;
			}
		}
		if (count + q[n - 1] + 1 <= 80)
		{
			System.out.print(" ");
			System.out.print((a.Substring(n) - 1));
		}
		else
		{
			System.out.print("\n");
			System.out.print((a.Substring(n) - 1));
		}
		return 0;
	}
}

