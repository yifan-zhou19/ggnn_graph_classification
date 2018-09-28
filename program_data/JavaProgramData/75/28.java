package <missing>;

public class GlobalMembers
{
	public static int input(String s, int[] a)
	{
		int len = s.length();
		int i;
		int j = 0;
		a[j] = s[0] - '0';
		for (i = 1;i < len;i++)
		{
			if (s[i].compareTo('0') >= 0 && s[i].compareTo('9') <= 0)
			{
				if (s[i - 1].compareTo('0') >= 0 && s[i - 1].compareTo('9') <= 0)
				{
					a[j] = a[j] * 10 + s[i] - '0';
				}
				else
				{
					j++;
					a[j] = s[i] - '0';
				}
			}
		}
		return (j + 1);
	}
	public static void Main()
	{
		String a = new String(new char[5050]);
		String b = new String(new char[5050]);
		int[] x = new int[1010];
		int[] y = new int[1010];
		int n;
		int i;
		int[] count = new int[1010];
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = input(a, x);
		n = input(b, y);
		int p;
		for (p = 0;p < 1000;p++)
		{
			for (i = 0;i < n;i++)
			{
				if (p >= x[i] != 0 && p < y[i])
				{
					count[p]++;
				}
			}
		}
		int max = 0;
		for (p = 0;p < 1000;p++)
		{
			if (count[p] > max)
			{
				max = count[p];
			}
		}
		System.out.printf("%d %d",n,max);
	}

}
