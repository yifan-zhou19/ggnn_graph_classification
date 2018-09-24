package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num;
		int b1;
		int b2;
		int pd;
		int[] b0 = new int[100];
		String a = new String(new char[100]);
		char e;
		char b3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			b1 = 0;
			pd = 0;
			while ((b3 = System.in.read()) != '\n')
			{
				a = tangible.StringFunctions.changeCharacter(a, b1, b3);
				b1++;
			}
			a = tangible.StringFunctions.changeCharacter(a, b1 + 1, '\0');
			if (a.charAt(0) == '\0' || a.charAt(0) == '\n')
			{
				pd = 0;
			}
			if (a.charAt(0) == 95 || (a.charAt(0) >= 65 && a.charAt(0) <= 90) || (a.charAt(0) >= 97 && a.charAt(0) <= 122))
			{
				pd = 1;
			}
			else
			{
				pd = 0;
			}
			for (b2 = 1;b2 < b1;b2++)
			{
				if (a.charAt(b2) < 48 || a.charAt(b2)>122)
				{
					pd = 0;
					break;
				}
				if (a.charAt(b2) > 57 && a.charAt(b2) < 65)
				{
					pd = 0;
					break;
				}
				if (a.charAt(b2) > 90 && a.charAt(b2) < 95)
				{
					pd = 0;
					break;
				}
				if (a.charAt(b2) > 95 && a.charAt(b2) < 97)
				{
					pd = 0;
					break;
				}
				if (a.charAt(b2) > 122)
				{
					pd = 0;
					break;
				}
			}

			b0[i] = pd;
			for (b2 = 0;b2 < b1;b2++)
			{
				a = tangible.StringFunctions.changeCharacter(a, b2, '\0');
			}
		}
		for (i = 0;i < num;i++)
		{
			e = b0[i];
			System.out.printf("%d\n",e);
		}

		return 0;
	}
}

