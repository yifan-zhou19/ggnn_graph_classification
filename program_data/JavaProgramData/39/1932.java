package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int e;
		int n;
		int i;
		int max = 0;
		int total = 0;
		int[] sum = new int[200];
		char[][] s = new char[200][200];
		String maxstudent = new String(new char[200]);
		char c;
		char d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			sum[i] = 0;
			s[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			d = ConsoleInput.readToWhiteSpace(true).charAt(0);
			e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((a > 80) && (e > 0))
			{
				sum[i] += 8000;
			}
			if ((a > 85) && (b > 80))
			{
				sum[i] += 4000;
			}
			if ((a > 90))
			{
				sum[i] += 2000;
			}
			if ((a > 85) && (d == 'Y'))
			{
				sum[i] += 1000;
			}
			if ((b > 80) && (c == 'Y'))
			{
				sum[i] += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			total += sum[i];
			if (sum[i] > max)
			{
				max = sum[i];
				maxstudent = s[i];
			}

		}
		System.out.print(maxstudent);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		System.out.print(total);
		System.out.print("\n");
				return 0;
	}
}

