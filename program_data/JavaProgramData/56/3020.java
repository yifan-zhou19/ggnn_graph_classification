package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[6]);
		char temp;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0,j = n - 1;i < j;i++,j--)
		{
			temp = a.charAt(i);
				 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
			a = tangible.StringFunctions.changeCharacter(a, j, temp);
		}
		System.out.println(a);
	}

}

