package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[1000]);
		int i;
		int j = 1;
		int n;
		int k;
		int m = 0;
		int e;
		int max;
		int min;
		int[] s = new int[1000];
		int[] l = new int[1000];
		z = new Scanner(System.in).nextLine();
		n = z.length();
		for (i = 0;i < n;i++)
		{
			if (z.charAt(i) == ' ' || z.charAt(i) == ',')
			{
				s[j] = i;
				j++;
			}
		}
		s[j] = n;
		s[0] = -1;
		for (k = 0;k < j;k++)
		{
			if (s[k + 1] - s[k] - 1 != 0)
			{
			l[m] = s[k + 1] - s[k] - 1;
			m++;
			}
		}
		m--;
		for (i = 0;i < m;i++)
		{
			if (l[i] > l[i + 1])
			{
				e = l[i + 1];
				l[i + 1] = l[i];
				l[i] = e;
			}
		}
		max = l[m];
	for (i = 0;i < m;i++)
	{
			if (l[i] < l[i + 1])
			{
				e = l[i + 1];
				l[i + 1] = l[i];
				l[i] = e;
			}
	}
		min = l[m];
		for (k = 0;k < j;k++)
		{
			if (s[k + 1] - s[k] - 1 == max)
			{
				for (i = s[k] + 1;i < s[k + 1];i++)
				{
					System.out.printf("%c",z.charAt(i));
				}
			System.out.print("\n");
			break;
			}
		}
		for (k = 0;k < j;k++)
		{
			if (s[k + 1] - s[k] - 1 == min)
			{
				for (i = s[k] + 1;i < s[k + 1];i++)
				{
					System.out.printf("%c",z.charAt(i));
				}
			System.out.print("\n");
			break;
			}
		}
		return 0;
	}











}
