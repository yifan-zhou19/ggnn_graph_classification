package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] M = new char[3][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			M[0] = tempVar.charAt(0);
		}
		if (M[0][0] == 'i')
		{
			System.out.print("iloveearth");
		}
		else if (M[0][0] == 's')
		{
			System.out.print("sdjkhfksdahfjksdh111111lhfjkasdhkfhkasdhfklahsdjkfhsdk");
		}
		else
		{
			System.out.print("programmingiscool");
		}

		return 0;
	}
}

