package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		int al;
		int bl;
	String a = new String(new char[101]);
	String b = new String(new char[101]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	l = n;
	while (l > 0)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b = tempVar3.charAt(0);
	 }
	 al = a.length();
	 bl = b.length();
	 for (i = 100;i >= 101 - al;i--)
	 {
		 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - 101 + al) - 48);
	 }
	 for (i = 100;i >= 101 - bl;i--)
	 {
		 b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - 101 + bl) - 48);
	 }
	 for (i = 0;i <= 100 - al;i++)
	 {
		 a = a.substring(0, i);
	 }
	 for (i = 0;i <= 100 - bl;i++)
	 {
		 b = b.substring(0, i);
	 }
	 for (i = 100;i >= 101 - al;i--)
	 {
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - b.charAt(i));
			if (a.charAt(i) < 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 10);
			 a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 1);
			}
	 }
	 if (a.charAt(101 - al) != 0)
	 {
		 System.out.printf("%d",a.charAt(101 - al));
	 }
	 for (i = 102 - al;i <= 100;i++)
	 {
	 System.out.printf("%d",a.charAt(i));
	 }
	 System.out.print("\n");
	 l--;
	}
	}
}

