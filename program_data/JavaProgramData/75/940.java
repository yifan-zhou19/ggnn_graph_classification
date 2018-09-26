package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a1 = new String(new char[10000]);
		String a2 = new String(new char[10000]);
		int[] b = new int[1000];
		int[] c = new int[1000];
		int i;
		int j = 0;
		int k = 0;
		int l;
		int r1;
		int r2;
		int m;
		int n;
		int p;
		a1 = new Scanner(System.in).nextLine();
		a2 = new Scanner(System.in).nextLine();
		r1 = a1.length();
		r2 = a2.length();
		for (i = 0;i < r1;i++)
		{
			if (a1.charAt(i) != ',')
			{
				if (k == 0)
				{
					b[j] = a1.charAt(i) - 48;
					k++;
				}
				else
				{
					b[j] = b[j] * 10 + a1.charAt(i) - 48;
				}
			}
			else
			{
				k = 0;
				j++;
			}
		}
		j = 0;
		for (i = 0;i < r2;i++)
		{
			if (a2.charAt(i) != ',')
			{
				if (k == 0)
				{
					c[j] = a2.charAt(i) - 48;
					k++;
				}
				else
				{
					c[j] = c[j] * 10 + a2.charAt(i) - 48;
				}
			}
			else
			{
				k = 0;
				if (j == 0)
				{
					l = c[j];
				}
				else if (c[j] > l)
				{
					l = c[j];
				}
				j++;
			}
		}
		System.out.printf("%d ",j + 1);
		for (i = 1;i < l;i++)
		{
			n = 0;
			for (m = 0;m <= j;m++)
			{
				if (b[m] <= i != 0 && c[m]> i)
				{
					n++;
				}
			}
			if (i == 1)
			{
				p = n;
			}
			else if (n > p)
			{
				p = n;
			}
		}
		System.out.printf("%d",p);
	}
}
