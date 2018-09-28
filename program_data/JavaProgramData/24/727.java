package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		String p;
		int len;
		int i;
		int[] a = new int[100];
		int m = 0;
		int t = 0;
		int n = 0;
		int max;
		int min;
		int pmax;
		int pmin;
		int summax = 0;
		int summin = 0;
		str = new Scanner(System.in).nextLine();
		p = str;
		len = str.length();
		for (i = 0;i < len + 1;i++)
		{
			if (((*(p.Substring(i)) >= 'a') && (*(p.Substring(i)) <= 'z')) || ((*(p.Substring(i)) >= 'A') && (*(p.Substring(i)) <= 'Z')))
			{
				m = m + 1;
			}
			else
			{
				a[t] = m;
				t++;
				m = 0;
			}
		}
		t = 0;
		while (a[t] != 0)
		{
			t++;
		}
		max = a[0];
		min = a[0];
		for (i = 0;i < t;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < t;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		for (i = 0;i < t;i++)
		{
			if (a[i] == max)
			{
				pmax = i;
				break;
			}
		}
		for (i = 0;i < t;i++)
		{
			if (a[i] == min)
			{
				pmin = i;
				break;
			}
		}
		for (i = 0;i < pmax;i++)
		{
			summax = summax + a[i] + 1;

		}
		for (i = 0;i < pmin;i++)
		{
			summin = summin + a[i] + 1;
		}
		for (i = 0;i < a[pmax];i++)
		{
			System.out.printf("%c",str.charAt(summax + i));
		}
		System.out.print("\n");
		for (i = 0;i < a[pmin];i++)
		{
			System.out.printf("%c",str.charAt(summin + i));
		}
		return;
	}
}
