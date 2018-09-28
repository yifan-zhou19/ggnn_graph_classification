package <missing>;

public class GlobalMembers
{
	public static int zichuan(String a, String b, int n)
	{
		for (int i = 0;i < b.length();i++)
		{
			if (!a[n + i].equals(b[i]))
			{
				return 0;
			}
		}
		return 1;
	}

	public static void Main(String[] args)
	{
		String s = new String(new char[60]);
		String w = new String(new char[60]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		w = ConsoleInput.readToWhiteSpace(true).charAt(0);

		int i = 0;
		for (i = 0;;i++)
		{
			if (zichuan(w, s, i) == 1)
			{
				break;
			}
		}
		System.out.print(i);

	}

}

