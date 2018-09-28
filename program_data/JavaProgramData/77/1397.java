package <missing>;

public class GlobalMembers
{
	public static String kid = new String(new char[100]);
	public static int paidui(int n, char b, char g)
	{
		for (int i = n; kid.charAt(i) != '\0'; i++)
		{
			while (kid.charAt(n) == '^') //??????
			{
				n++;
			}
			if (kid.charAt(n) == b) //?????
			{
				kid = tangible.StringFunctions.changeCharacter(kid, n, '^'); //?????
				int k = paidui(n + 1, b, g); //???????????
				System.out.print(n);
				System.out.print(" ");
				System.out.print(k);
				System.out.print("\n");
			}
			else //??????
			{
				kid = tangible.StringFunctions.changeCharacter(kid, n, '^'); //????
				return n; //??????????
			}
		}
	}
	public static int Main()
	{
		char girl;
		char boy;
		int n;
		kid = ConsoleInput.readToWhiteSpace(true).charAt(0);
		boy = kid.charAt(0); //???????????
		n = kid.length();
		girl = kid.charAt(n - 1); //????????????
		paidui(0, boy, girl);
		return 0;
	}
}

