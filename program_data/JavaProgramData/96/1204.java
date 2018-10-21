package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int t;
		int q;
		String s = new String(new char[102]);
		int[] a = new int[102];
		int[] b = new int[102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		x = s.length();
		for (i = 0;i < x;i++)
		{
			a[i] = s.charAt(i) - '0';
		}
		if (x == 1)
		{
			System.out.print("0\n");
			System.out.printf("%d",a[0]);
		}
		else
		{
			t = a[0] * 10 + a[1];
			for (i = 1;i < x;i++)
			{
				b[i - 1] = t / 13;
				if (i != x - 1)
				{
					t = t % 13 * 10 + a[i + 1];
				}
				else if (i == x - 1)
				{
				q = t % 13;
				}
			}
			if (b[0] == 0 && b[1] != 0)
			{
				for (i = 1;i < x - 1;i++)
				{
					System.out.printf("%d",b[i]);
				}
				System.out.print("\n");
				System.out.printf("%d",q);
			}
			else if (b[0] != 0)
			{
				for (i = 0;i < x - 1;i++)
				{
					System.out.printf("%d",b[i]);
				}
				System.out.print("\n");
				System.out.printf("%d",q);
			}
			else if (b[0] == 0 && b[1] == 0)
			{
				System.out.print("0\n");
				System.out.printf("%d",t);
			}
		}
	}
}

