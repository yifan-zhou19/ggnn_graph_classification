package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int l;
		int m;
		int n;
		int p = 0;
		int q;
		int[] a = new int[1000];
		String b = new String(new char[10000]);
		b = new Scanner(System.in).nextLine();
		while (b.charAt(i) != '\0')
		{
			if (b.charAt(i) <= '9' && b.charAt(i) >= '0')
			{
				if (k == 0)
				{
					a[j] = b.charAt(i) - 48;
					k++;
				}
				else
				{
					a[j] = a[j] * 10 + b.charAt(i) - 48;
				}
			}
			else
			{
				j++;
			}
			i++;
		}
		q = j;
		for (i = 0;i <= q;i++)
		{
			m = 0;
			for (j = 0;j <= q;j++)
			{
				if (a[j] > a[i] && m == 0)
				{
					n = a[j];
					m++;
				}
				else if (a[j] > a[i] && a[j] != n)
				{
					m++;
				}
			}
			if (m == 1)
			{
				System.out.printf("%d",a[i]);
				p = a[i];
				break;
			}
		}
		if (p == 0)
		{
			System.out.print("No");
		}
	}
}
