package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int[] a = new int[3];
		int[] c = new int[3];
		char[] b = {'A', 'B', 'C'};
		for (i = 0;i < 3;i++)
		{
			a[0] = i;

			for (j = 0;j < 3;j++)
			{
				a[1] = j;
				if (a[0] == a[1])
				{
					continue;
				}
				for (k = 0;k < 3;k++)
				{
					a[2] = k;
					if (a[2] == a[1] || a[2] == a[0])
					{
						continue;
					}
					c[0] = (a[1] > a[0]) + (a[0] == a[2]);
					c[1] = (a[0] > a[1]) + (a[0] > a[2]);
					c[2] = (a[2] > a[1]) + (a[1] > a[0]);
					if (a[0] < a[1] && c[0]> c[1])
					{
						if (a[1] < a[2] && c[1]> c[2])
						{
						System.out.print(b[0]);
						System.out.print(b[1]);
						System.out.print(b[2]);
						System.out.print("\n");
						}
					}
					if (a[0] < a[2] && c[0]> c[2])
					{
						if (a[2] < a[1] && c[2]> c[1])
						{
						System.out.print(b[0]);
						System.out.print(b[2]);
						System.out.print(b[1]);
						System.out.print("\n");
						}
					}
					if (a[1] < a[0] && c[1]> c[0])
					{
						if (a[0] < a[2] && c[0]> c[2])
						{
						System.out.print(b[1]);
						System.out.print(b[0]);
						System.out.print(b[2]);
						System.out.print("\n");
						}
					}
					if (a[1] < a[2] && c[1]> c[2])
					{
						if (a[2] < a[0] && c[2]> c[0])
						{
						System.out.print(b[1]);
						System.out.print(b[2]);
						System.out.print(b[0]);
						System.out.print("\n");
						}
					}
					if (a[2] < a[0] && c[2]> c[0])
					{
						if (a[0] < a[1] && c[0]> c[1])
						{
						System.out.print(b[2]);
						System.out.print(b[0]);
						System.out.print(b[1]);
						System.out.print("\n");
						}
					}
					if (a[2] < a[1] && c[2]> c[1])
					{
						if (a[1] < a[0] && c[1]> c[0])
						{
						System.out.print(b[2]);
						System.out.print(b[1]);
						System.out.print(b[0]);
						System.out.print("\n");
						}
					}

				}
			}
		}
		return (0);
	}

}
