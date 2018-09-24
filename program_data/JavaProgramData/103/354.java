package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sum;
		int l;
		String s = new String(new char[1000]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				s.charAt(i) -= 32;
			}
		}
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) == '\0')
			{
				break;
			}
			sum = 1;
			while (s.charAt(i) == s.charAt(i + 1))
			{
				i++;
				sum++;
			}
			 System.out.print("(");
			 System.out.print(s.charAt(i));
			 System.out.print(",");
			 System.out.print(sum);
			 System.out.print(")");
		}
		return 0;
	}

}

