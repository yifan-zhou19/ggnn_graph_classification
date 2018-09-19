package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1020]);
		char temp;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int la = a.length();
		int i;
		int num = 0;
		for (i = 0; i <= la - 1; i++)
		{
			if ((a.charAt(i) >= 97) && (a.charAt(i) <= 122))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		temp = a.charAt(0);
		System.out.print("(");
		System.out.print(temp);
		System.out.print(",");
		for (i = 0; i <= la - 1; i++)
		{
			if (a.charAt(i) == temp)
			{
				num++;
			}
			if (a.charAt(i) != temp)
			{
				temp = a.charAt(i);
				System.out.print(num);
				System.out.print(")(");
				System.out.print(temp);
				System.out.print(",");
				num = 1;
			}
		}
		System.out.print(num);
		System.out.print(")");
		System.out.print("\n");
		return 0;
	}
}

