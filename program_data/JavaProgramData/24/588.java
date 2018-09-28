package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[50];
		int k = 1;
		int m;
		int p;
		int h;
		String b = new String(new char[300]);
		b = new Scanner(System.in).nextLine();
		m = b.length();
		for (i = 0;i < m;i++)
		{
			if (b.charAt(i) == ' ')
			{
				a[k] = i + 1;
				k++;
			}
		}
			a[0] = 0;
			a[k] = m + 1;
		for (i = 0,j = 0,h = 1;h < k;h++)
		{
			if (a[h + 1] - a[h] > a[i + 1] - a[i])
			{
				i = h;
			}
		else if (a[h + 1] - a[h] < a[j + 1] - a[j])
		{
			j = h;
		}
		}
		for (p = a[i];p < a[i + 1] - 1;p++)
		{
			System.out.printf("%c",b.charAt(p));
		}
					   System.out.print("\n");
		for (p = a[j];p < a[j + 1] - 1;p++)
		{
			System.out.printf("%c",b.charAt(p));
		}

		return 0;
	}
}
