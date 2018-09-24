package <missing>;

public class GlobalMembers
{
	public static char turn(char c)
	{
		if (c >= 97)
		{
			return c - 32;
		}
		else
		{
			return c;
		}
	}
	public static int Main()
	{
		String ch = new String(new char[1200]);
		char temp;
		int length;
		int i;
		int j;
		int k;
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		length = ch.length();
		k = 1;
		temp = turn(ch.charAt(0));
		for (i = 1;i < length;i++)
		{
			if (turn(ch.charAt(i)) == temp)
			{
				k++;
			}
			else
			{
				System.out.print("(");
				System.out.print(temp);
				System.out.print(",");
				System.out.print(k);
				System.out.print(")");
				temp = turn(ch.charAt(i));
				k = 1;
			}
		}
		System.out.print("(");
		System.out.print(temp);
		System.out.print(",");
		System.out.print(k);
		System.out.print(")");
		return 0;
	}

}

