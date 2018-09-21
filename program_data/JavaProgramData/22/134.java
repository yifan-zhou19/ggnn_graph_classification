package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[1500]);
		int[] a = new int[300];
		int i = 0;
		int j = 0;
		int m = 1;
		int l;
		int k;
		int t;
		c = new Scanner(System.in).nextLine();
		l = c.length();
		for (i = l - 1;i >= 0;i--)
		{
			if (c.charAt(i) > 47 && c.charAt(i) < 58 && c.charAt(i - 1) == 44)
			{
				a[j] = a[j] + (c.charAt(i) - 48) * m;
				j++;
				m = 1;
			}
			else if (c.charAt(i) > 47 && c.charAt(i) < 58)
			{
			a[j] = a[j] + (c.charAt(i) - 48) * m;
			m = m * 10;
			}
		}
		for (i = 0;i <= j;i++)
		{
			for (k = 0;k <= j - i;k++)
			{
				if (a[k] < a[k + 1])
				{
					t = a[k];
					a[k] = a[k + 1];
					a[k + 1] = t;
				}
			}
		}
		if (j == 0 || a[0] == a[j])
		{
			System.out.print("No\n");
		}
			else
			{
				for (i = 1;i <= j;i++)
				{
					if (a[i] != a[0])
					{
					System.out.printf("%d\n",a[i]);
					break;
					}
				}
			}
	}
}
