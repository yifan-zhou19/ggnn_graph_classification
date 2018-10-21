package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String num = new String(new char[5]);
		String chu = new String(new char[5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		int a = 0;
		int i;
		int j;
		int e = 0;
		for (i = 0;num.charAt(i) != '0' && num.charAt(i) != '\0';i++)
		{
			a++;
		}

		for (j = a - 1;j >= 0;j--)
		{
			chu = tangible.StringFunctions.changeCharacter(chu, e, num.charAt(j));
			e++;
		}
		System.out.printf("%s",chu);

	}


}

