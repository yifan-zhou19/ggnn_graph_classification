package <missing>;

public class GlobalMembers
{
	public static char f1(String ch, int left, int right)
	{
		if (left >= right)
		{
			return 1;
		}
		else if (!ch[left].equals(ch[right]))
		{
			return 0;
		}
		else
		{
			return f1(ch, left + 1, right - 1);
		}
	}
	public static char f2(String ch, int start, int end)
	{
		while (start <= end)
		{
			System.out.print(ch[start++]);
		}
		System.out.print('\n');
		return '0';
	}
	public static int Main()
	{
		String ch = new String(new char[500]);
		int i;
		int l;
		int w;
		ch = new Scanner(System.in).nextLine();
		l = ch.length();
		for (w = 1;w <= l;w++)
		{
			for (i = 0;i < l - w;i++)
			{
				if (f1(ch, i, i + w) != null)
				{
					f2(ch, i, i + w);
				}
			}
		}
		return 0;
	}
}
