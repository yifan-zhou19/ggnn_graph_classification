package <missing>;

public class GlobalMembers
{
	public static int judge(String s, int start, int wid)
	{
		int end = start + wid - 1;
		while ((s[start].equals(s[end])) && (start < end))
		{
			start++;
			end--;
		}
		if (start >= end)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int Main()
	{
		final String s = "";
		int l;
		int w;
		int i;
		int j;
		int c;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (w = 2;w <= l;w++)
		{
			for (i = 0;i <= l - w;i++)
			{
				c = judge(s, i, w);
				if (c == 1)
				{
					for (j = i;j <= i + w - 1;j++)
					{
						System.out.print(s.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
	}
}
