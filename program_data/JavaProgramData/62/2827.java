package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] s1 = new int[10000];
		String s = new String(new char[10000]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i);i++)
		{
			s1[i] = 0;
			if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
			{
				s1[i] = 0;
			}
			else
			{
				s1[i] = 1;
			}
		}
		for (i = 0;s.charAt(i);i++)
		{
			if (s1[i] == 1)
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		return 0;
	}
}
