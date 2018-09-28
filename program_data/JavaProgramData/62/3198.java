package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int z = 1;
		int n;
		int l;
		String w = new String(new char[300]);
		w = new Scanner(System.in).nextLine();
	for (j = 0;j < w.length();j++)
	{
	if (w.charAt(j) != ' ' || w.charAt(j + 1) != ' ')
	{
	System.out.printf("%c",w.charAt(j));
	}
	}

			return 0;
	}


}
