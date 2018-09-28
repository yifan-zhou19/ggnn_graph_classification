package <missing>;

public class GlobalMembers
{
	/*???????
	 *?????
	 */
	public static int huiwen(String a) //????????
	{
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	 int i;
	 int l;
	 l = a.length();
	 for (i = 0;i < l;i++)
	 {
		 b[l - 1 - i] = a[i];
	 }
	 if (strcmp(b,a) == 0)
	 {
	 return 1;
	 }
	 return 0;
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		String s = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l;
		int la = a.length();
		int k = 0;
		int p = 0;
		for (l = 2;l <= la;l++)
		{ //??????
		for (int i = 0;i <= la - l;i++)
		{ //???????????
		for (int j = i;j < l + i;j++)
		{
			s = tangible.StringFunctions.changeCharacter(s, p, a.charAt(j));
			p++;
		}
		s = tangible.StringFunctions.changeCharacter(s, p, '\0'); //????'\0'??
		if (huiwen(s) != 0)
		{
			System.out.print(s);
			System.out.print("\n");
		}
		p = 0;
		}
		} //????????
		return 0;
	}

}

