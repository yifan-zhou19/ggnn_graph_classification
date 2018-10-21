package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int n = 0;
		int i;
		int j;
		int l;
		String c = new String(new char[1000]);
		String d = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = c.length();
		for (i = 0;i < l;i++)
		{
			if (c.charAt(i) >= 65 && c.charAt(i) <= 90)
			{
			 c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 55);
			}
			 else if (c.charAt(i) >= 97 && c.charAt(i) <= 122)
			 {
				 c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 87);
			 }
			 else
			 {
				 c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 48);
			 }
		}
		for (i = 0;i < l;i++)
		{
			n = n * a + c.charAt(i);
		}
		for (i = 0,j = 0;;i++,j++)
		{
			d = tangible.StringFunctions.changeCharacter(d, i, n % b);
			n = n / b;
			if (n != 0)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (d.charAt(i) >= 10)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 55);
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 48);
			}
		}
		 for (i = j;i >= 0;i--)
		 {
			 System.out.printf("%c",d.charAt(i));
		 }
	}

}

