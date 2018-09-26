package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int m = a.length() + 1;
		String b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc((Character.SIZE / Byte.SIZE) * m);
		int i;
		int k = 0;
		for (i = 0;i < m - 2;i++)
		{
			 if (a.charAt(i) != 32)
			 {
				  b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
				  k++;
			 }
			 else if (a.charAt(i) == 32 && a.charAt(i + 1) == 32)
			 {
				  continue;
			 }
			 else if (a.charAt(i) == 32 && a.charAt(i + 1) != 32)
			 {
				  b = tangible.StringFunctions.changeCharacter(b, k, 32);
				  k++;
			 }
		}
		b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(m - 2));
		b = tangible.StringFunctions.changeCharacter(b, k + 1, '\0');
		String c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		c = (String)malloc((Character.SIZE / Byte.SIZE) * (k + 2));
		for (i = 0;i < k + 1;i++)
		{
		   c = tangible.StringFunctions.changeCharacter(c, i, b.charAt(i));
		}
		System.out.println(c);
		return 0;
	}

}

