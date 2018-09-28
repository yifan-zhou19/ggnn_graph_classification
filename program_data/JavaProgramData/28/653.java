package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = " ";
		final String s = "  ";
		int[] begin = new int[301];
		int[] end = new int[301];
		int i;
		int p = 0;
		int q = 0;
		int j;
		str = new Scanner(System.in).nextLine();
		str += s;
		s += str;
		j = s.length();
		for (i = 1;i < j - 1;i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ')
			{
				begin[p] = i;
				p++;
			}
			if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ')
			{
				end[q] = i;
				q++;
			}
		}
		for (i = 0;i < p - 1;i++)
		{
			System.out.printf("%d,",end[i] - begin[i] + 1);
		}
		System.out.printf("%d",end[p - 1] - begin[p - 1] + 1);
	}
}
