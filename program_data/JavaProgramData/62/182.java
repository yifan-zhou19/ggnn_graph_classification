package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int[] b = new int[101];
		int length;
		int i;
		s = new Scanner(System.in).nextLine();

		length = s.length();
		for (i = 0;i < length;i++)
		{
			if (s.charAt(i) == ' ')
			{
				b[i] = 1;
				if (s.charAt(i + 1) != ' ')
				{
					b[i] = 0;
				}
			}
		}
		for (i = 0;i < length;i++)
		{
			if (b[i] == 0)
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		 return 0;
	}

}
