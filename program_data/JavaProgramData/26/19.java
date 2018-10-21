package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int n;
		cin.get(a,100); //?????
		n = a.length();
		for (i = 0;i < n;i++)
		{
		if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ') //???????
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0'); //????????????0
		}
		}
								 //?????????????????0
			 for (i = 0;i < n;i++)
			 {
			if (a.charAt(i) != '0') //???0???
			{
				System.out.print(a.charAt(i));
			}
			 }
		return 0;
	}
}

