package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[5000]);
		s = new Scanner(System.in).nextLine();
		int[] a = new int[201];
		int m = 1;
		int i;
		int s1 = 0;
		int s2 = 0;
		int j;
		int max;
		int min;
		for (i = 0;i < 201;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == ',')
			{
				m++;
			}
		} //m shi dan ci shu
		i = 0;
		for (j = 0;j < s.length();j++)
		{
			if (s.charAt(j) != ' ' && s.charAt(j) != ',')
			{
				a[i]++;
			}
			else
			{
				i++;
			}
		}
		max = 0;
		min = 0;
		for (i = 0;i < m;i++)
		{
			if (a[i] > a[max])
			{
				max = i;
			}
			if (a[i] < a[min] && a[i] != 0)
			{
				min = i;
			}
		}
		for (i = 0;i < max;i++)
		{
			s1 = s1 + a[i];
		}
		s1 = s1 + max;
		for (i = s1;i < s1 + a[max];i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		for (i = 0;i < min;i++)
		{
			s2 = s2 + a[i];
		}
		s2 = s2 + min;
		for (i = s2;i < s2 + a[min];i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		return 0;
	}
}
