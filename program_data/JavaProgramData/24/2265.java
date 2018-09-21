package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[4000]);
		s = new Scanner(System.in).nextLine();

		String[] start = new String[200];
		start[0] = s;
		int l = 0;
		int n = 1;
		while (s.charAt(l) != 0)
		{
			if (s.charAt(l) == ',' || s.charAt(l) == ' ')
			{
				s = s.substring(0, l);
				if (s.charAt(l + 1) != ',' && s.charAt(l + 1) != ' ')
				{
					start[n++] = s.Substring(l) + 1;
				}
			}

			l++;
		}

		int[] len = new int[200];
		int i;
		int max = 0;
		int min = 0;
		for (i = 0;i <= n - 1;i++)
		{
			len[i] = String.valueOf(start[i]).length();

			if (len[max] < len[i])
			{
				max = i;
			}
			else if (len[min] > len[i])
			{
				min = i;
			}
		}

		System.out.println(start[max]);
		System.out.println(start[min]);
	}
}
