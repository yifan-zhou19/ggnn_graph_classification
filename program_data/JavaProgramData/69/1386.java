package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
	int al;
	int bl;
	int i;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	al = a.length();
	bl = b.length();
	for (i = 250;i > 250 - al;i--)
	{
	a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - 251 + al) - 48);
	}
	for (i = 250;i > 250 - bl;i--)
	{
	b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - 251 + bl) - 48);
	}
	for (i = 0;i < 251 - al;i++)
	{
	a = a.substring(0, i);
	}
	for (i = 0;i < 251 - bl;i++)
	{
	b = b.substring(0, i);
	}
	k = al > bl != 0?al:bl;
	for (i = 250;i > 250 - k;i--)
	{
	if (a.charAt(i) + b.charAt(i) > 9)
	{
		a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + b.charAt(i) - 10);
		a.charAt(i - 1) += 1;
	}
	else
	{
		a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + b.charAt(i));
	}
	}
	k = 251;
	for (i = 0;i <= 250;i++)
	{
	if (a.charAt(i) != 0)
	{
		k = i;
		break;
	}
	}
	if (k < 251)
	{
		for (i = k;i < 251;i++)
		{
	System.out.printf("%d",a.charAt(i));
		}
	System.out.print("\n");
	}
	else
	{
		System.out.print("0\n");
	}
	}
}

