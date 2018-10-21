package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int c;
		int d;
		int e;
		int f;
		int g;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		for (d = 0;d < c;d++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			e = a.length();
			k = e;
			f = b.length();
			if (e >= f)
			{
				while (f >= 0)
				{
						if (a.charAt(e) < b.charAt(f))
						{
							a = tangible.StringFunctions.changeCharacter(a, e, a.charAt(e) + 10 - b.charAt(f) + 48);
							a = tangible.StringFunctions.changeCharacter(a, e-1, a.charAt(e-1) - 1);
						}
						else
						{
							a = tangible.StringFunctions.changeCharacter(a, e, a.charAt(e) - b.charAt(f) + 48);
						}
						f--;
						e--;
				}
			}
			for (g = 0;g < k;g++)
			{
				System.out.printf("%c",a.charAt(g));
			}
			System.out.print("\n");
		}
	}

}

