package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[31]);
		int i;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) < 58 && s.charAt(i)>47)
			{
				System.out.printf("%c",s.charAt(i));
			}
			if (s.charAt(i) < 58 && s.charAt(i)>47 && (s.charAt(i + 1) >= 58 || s.charAt(i + 1) <= 47))
			{
				System.out.print("\n");
			}
		}
	}

}
