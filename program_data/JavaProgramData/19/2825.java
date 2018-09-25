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
		int[] p = new int[20];
		int q;
		int[] h = new int[10];
		String str = new String(new char[200]);
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		m = str1.length();
		q = str2.length();
		n = str.length();
		k = 0;
		l = 0;
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) == str1.charAt(l))
			{
				l++;
				if ((i + 1) < (n - 1))
				{
				if (l == m && str.charAt(i + 1) == ' ')
				{
				h[k] = i - m + 1;
				   k++;
				l = 0;
				}
				}
				else
				{
				if (l == m)
				{
				h[k] = i - m + 1;
				   k++;
				l = 0;
				}
				}
			}
			else
			{
				l = 0;
			}

		}
		j = 0;
		i = 0;
		do
		{
		if (h[j] > 0)
		{
			if (i == h[j] && k > 0 && str.charAt(h[j] - 1) == ' ')
			{
				System.out.printf("%s",str2);
				i = i + m;
				j++;
			}
			else
			{
				if (h[j - 1] < n - 1 - m)
				{
					System.out.printf("%c",str.charAt(i));
					i++;
				}
			}
		}
		if (h[j] == 0)
		{
			if (i == h[j] && k > 0)
			{
				System.out.printf("%s",str2);
				i = i + m;
				j++;
			}
			else
			{
				if (h[j - 1] < n - 1 - m)
				{
					System.out.printf("%c",str.charAt(i));
					i++;
				}
			}
		}
		}while (i < n);
		return 0;
	}

}
