package <missing>;

public class GlobalMembers
{
	public static void substr(String s, int start, int end)
	{
		int a = start;
		int b = end;
		int i;
		while ((end > start) && (s[start].equals(s[end])))
		{
			start++;
			end--;
		}
		while (start > end)
		{
			for (i = a;i <= b;i++)
			{
				System.out.print(s[i]);
			}
			start = start - 1;
			System.out.print('\n');
		}
	}
	public static void sub(String s, int start, int end)
	{
		int a = start;
		int b = end;
		int i;
		while ((end > start) && (s[start].equals(s[end])))
		{
			start++;
			end--;
		}
		while (start >= end)
		{
			for (i = a;i <= b;i++)
			{
				System.out.print(s[i]);
			}
			start = start - 1;
			System.out.print('\n');
		}
	}
	public static void Main()
	{
		String s = new String(new char[500]);
		int m;
		int n;
		int width;
		int start;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (width = 1; width < n; width++)
		{
			for (m = 0; m <= n - width;m++)
			{
				if (n % 2 == 0)
				{
					substr(s, m, m + width);
				}
				else
				{
					sub(s, m, m + width);
				}
			}
		}
	}
}
