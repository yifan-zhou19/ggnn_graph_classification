package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //????????????,????
		int i;
		String a = new String(new char[6]); //?????????????
		for (i = 1;i <= 5;i++) //??????
		{
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		i = i - 1; //????
		for (k = i;k >= 1;k--) //?????
		{
			System.out.printf("%c",a.charAt(k));
		}
		return 0;
	}
}

