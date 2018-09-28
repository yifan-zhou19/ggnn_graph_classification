package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[301]);
		String p = s;
		s = new Scanner(System.in).nextLine();
		System.out.print(p);
		for (int i = 1;i < s.length();i++)
		{
			if (p.charAt(i) == ' ' && p.charAt(i - 1) == ' ')
			{
			continue;
			}
			else
			{
			System.out.print(p.charAt(i));
			}
		}
		//while(1);
		return 0;
	}



}
