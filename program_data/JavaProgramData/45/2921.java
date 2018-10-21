package <missing>;

public class GlobalMembers
{
	public static void get_next(String t, int l, int[] next)
	{
		int j = 0;
		int k = -1;
		next[0] = -1;
		while (j < l)
		{
			if (k == -1 || t[j].equals(t[k]))
			{
				j++;
				k++;
				if (t[j].equals(t[k]))
				{
					next[j] = next[k];
				}
				else
				{
					next[j] = k;
				}
			}
			else
			{
				k = next[k];
			}
		}
	}
	public static int kmp_index(String s, String t, int ls, int lt, int[] next)
	{
		int i = 0;
		int j = 0;
		while (i < ls)
		{
			if (j == -1 || s[i].equals(t[j]))
			{
				i++;
				j++;
			}
			else
			{
				j = next[j];
			}
			if (j == lt)
			{
				return i - lt;
			}
		}
		return -1;
	}
	public static int Main()
	{
		String s = new String(new char[51]);
		String t = new String(new char[51]);
		int[] next = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int lt = 0;
		int ls;
		int i;
		t = new Scanner(System.in).nextLine();
		while (t.charAt(lt) != ' ')
		{
			lt++;
		}
		ls = t.length() - 1 - lt;
		for (i = 0;i < ls;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, t.charAt(lt + 1 + i));
		}
		t = tangible.StringFunctions.changeCharacter(t, lt, '\0');
		s = tangible.StringFunctions.changeCharacter(s, ls, '\0');
		get_next(t, lt, next);
		System.out.printf("%d\n",kmp_index(s, t, ls, lt, next));
	}
}

