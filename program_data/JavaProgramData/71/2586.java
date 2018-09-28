package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[12];
		a[1] = 31;
		a[2] = 28;
		a[3] = 31;
		a[4] = 30;
		a[5] = 31;
		a[6] = 30;
		a[7] = 31;
		a[8] = 31;
		a[9] = 30;
		a[10] = 31;
		a[11] = 30;
		a[12] = 31;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[n];
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		int a1;
		int a2;
		int t;
		int sum = 0;
		int p4 = 0;
		for (int i = 1;i <= n;i = i + 1)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p1 = b[i] % 4;
			p2 = b[i] % 100;
			p3 = b[i] % 400;
			if (p3 == 0)
			{
				a[2] = 29;
			}
			else
			{
				if ((p2 != 0) && (p1 == 0))
				{
					a[2] = 29;
				}
			}
			a1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a1 > a2)
			{
				t = a1;
				a1 = a2;
				a2 = t;
			}
			for (int j = a1;j < a2;j++)
			{
				sum = sum + a[j];
			}
			p4 = sum % 7;
			if (p4 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			sum = 0;
			a[2] = 28;
		}
		return 0;
	}

}

