package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		char temp;
		int i;
		int count = 1;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (str.charAt(0) >= 97 && str.charAt(0) <= 122)
		{
			temp = str.charAt(0) - 32;
		}
		else
		{
			temp = str.charAt(0);
		}
		for (i = 1 ; i < str.length() ; i++)
		{
			if (str.charAt(i) == temp || str.charAt(i) - 32 == temp)
			{
				count++;
			}
			else if (str.charAt(i) >= 65 && str.charAt(i) < 90)
			{
				System.out.print("(");
				System.out.print(temp);
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				temp = str.charAt(i);
				count = 1;
			}
			else if (str.charAt(i) >= 97 && str.charAt(i) < 122)
			{
				System.out.print("(");
				System.out.print(temp);
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				temp = str.charAt(i) - 32;
				count = 1;
			}
		}
		System.out.print("(");
		System.out.print(temp);
		System.out.print(",");
		System.out.print(count);
		System.out.print(")");
		return 0;
	}
}

