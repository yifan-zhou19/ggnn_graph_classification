package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String ward = new String(new char[20]);
		char a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ward = tempVar2.charAt(0);
			}
			a = ward.length() - 1;
			if ((ward.charAt(a) == 'r') || (ward.charAt(a) == 'y'))
			{
				ward = tangible.StringFunctions.changeCharacter(ward, a - 1, '\0');
			}
			else
			{
				ward = tangible.StringFunctions.changeCharacter(ward, a - 2, '\0');
			}
			System.out.printf("%s\n", ward);
		}
	}
}

