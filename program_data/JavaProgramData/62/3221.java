package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[LEN + 1]);
		char[] b = {0};
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		for (i = 1,j = 1;i < l;i++)
		{
			b[0] = a.charAt(0);
			if (a.charAt(i) == ' ' && a.charAt(i - 1) != ' ')
			{
				b[j] = a.charAt(i);
				j++;
			}
			else if (a.charAt(i) != ' ')
			{
				b[j] = a.charAt(i);
				j++;
			}
		}
		System.out.println(b);
		return 0;
	}


}
