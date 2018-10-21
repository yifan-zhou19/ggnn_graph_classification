package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char last;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,'%',1000);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i = 0;
		int count = 1;
		while (a.charAt(i) != '%')
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a.charAt(i) += 'A' - 'a';
			}
			i++;
		}
		last = a.charAt(0);
		i = 1;
		while (a.charAt(i) != '%')
		{
			if (a.charAt(i) == last)
			{
				count++;
			}
			else
			{
				System.out.print("(");
				System.out.print(last);
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				last = a.charAt(i);
				count = 1;
			}
			i++;
		}
		return 0;
	}
}

