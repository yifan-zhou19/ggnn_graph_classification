package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k = 0;
		int i;
		int t;
		String num = new String(new char[6]);
		String rum = new String(new char[6]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		for (i = 0;num.charAt(i) != '\0';i++)
		{
		  k = k + 1;
		}
		for (i = 0;num.charAt(i) != '\0';i++)
		{
			t = k - i - 1;
			rum = tangible.StringFunctions.changeCharacter(rum, t, num.charAt(i));
		}
		rum = tangible.StringFunctions.changeCharacter(rum, k, '\0');



			System.out.printf("%s\n",rum);

	}
}

