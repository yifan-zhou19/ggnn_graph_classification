package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1500]);
		int i;
		int j1;
		int j = 1;
		int[] a = new int[300];
		char c;
		int x = -1;
		int y;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
				if (s.charAt(i) != ',')
				{
					a[j] = 10 * a[j] + s.charAt(i) - 48;
				}
				else
				{
					j++;
				}
		}
		j1 = j;
		if (j1 == 1)
		{
			System.out.print("No\n");
		}
		else
		{
				if (a[1] == a[2])
				{
					y = a[1];
				}
				if (a[1] < a[2])
				{
					x = a[1];
					y = a[2];
				}
				if (a[1] > a[2])
				{
					x = a[2];
					y = a[1];
				}
				for (j = 3;j <= j1;j++)
				{
					if (a[j] > y)
					{
						x = y;
						y = a[j];
					}
					if (a[j] < y && a[j]> x)
					{
						x = a[j];
					}
				}
			if (x == -1)
			{
				System.out.print("No\n");
			}
			else
			{
				System.out.printf("%d\n",x);
			}
		}
		return 0;
	}
}
