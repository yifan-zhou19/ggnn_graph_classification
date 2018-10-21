package <missing>;

public class GlobalMembers
{
	/*??????*/
	public static int Main()
	{
		String num = new String(new char[6]);
		int a;
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a = num.length(); //???????
		int i;
		int j;
		char t;
		for (i = 0,j = a - 1;i <= (a - 1) / 2;i++,j--) //????????
		{
			t = num.charAt(i);
			num = tangible.StringFunctions.changeCharacter(num, i, num.charAt(j));
			num = tangible.StringFunctions.changeCharacter(num, j, t);
		}
		for (i = 0;i < a;i++)
		{
			System.out.print(num.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

