package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final String a = "";
		String b = new String(new char[40]);
		String p = *a;
		String q = b.charAt(0);
		int i;
		int j;
		int N;
		int[] num = new int[1000];
		int[] x = num;
		int count = 0;
		for (i = 0;i < n;i++)
		{
			p = *(a.Substring(i));
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			N = b.length();
			x[i] = N;
			for (j = 0;j < N;j++)
			{
				*(p.Substring(j)) = *(q.Substring(j));
			}
		}
		p = *a;
		for (i = 0;i < n;i++)
		{
			p = *(a.Substring(i));
			if (count + x[i] <= 80 && i != n - 1 && count + x[i] + x[i + 1] + 1 <= 80)
			{
				for (j = 0;j < x[i];j++)
				{
					System.out.print((p.Substring(j)));
				}
				count = count + x[i] + 1;
				System.out.print(" ");
				continue;
			}
			if (count + x[i] <= 80 && i != n - 1 && count + x[i] + x[i + 1] + 1>80)
			{
				for (j = 0;j < x[i];j++)
				{
					System.out.print((p.Substring(j)));
				}
				count = count + x[i] + 1;
							   continue;
			}
			if (count + x[i] <= 80 && i == n - 1)
			{
				for (j = 0;j < x[i];j++)
				{
					System.out.print((p.Substring(j)));
				}
				count = count + x[i] + 1;
							   continue;
			}
			if (count + x[i] > 80 && i != n - 1)
			{
				System.out.print("\n");
				for (j = 0;j < x[i];j++)
				{
					System.out.print((p.Substring(j)));
				}
				count = x[i] + 1;
				System.out.print(" ");
							   continue;
			}
			if (count + x[i] > 80 && i == n - 1)
			{
				System.out.print("\n");
				for (j = 0;j < x[i];j++)
				{
					System.out.print((p.Substring(j)));
				}
				count = x[i] + 1;
							   continue;
			}
		}
		return 0;
	}
}

