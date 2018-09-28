package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b;
		int i;
		int c;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}

		n = a.length();
		if (n == 1)
		{
			System.out.printf("%d\n%s",0,a);
		}
		else if (n == 2 && (a.charAt(0) - '0') * 10 + a.charAt(1) - '0' < 13)
		{
			System.out.printf("%d\n%s",0,a);
		}
		else if ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0' >= 13)
		{
			c = a.charAt(0) - '0';
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			b = (String)malloc((n - 1) * (Character.SIZE / Byte.SIZE));
		for (i = 0;i < n - 1;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, (c * 10 + (a.charAt(i + 1) - '0')) / 13 + '0');
			c = (c * 10 + (a.charAt(i + 1) - '0')) % 13;
		}
		System.out.printf("%s\n%d",b,c);
		}
		else
		{

			c = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			b = (String)malloc((n - 2) * (Character.SIZE / Byte.SIZE));
		for (i = 0;i < n - 2;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, (c * 10 + (a.charAt(i + 2) - '0')) / 13 + '0');
			c = (c * 10 + (a.charAt(i + 2) - '0')) % 13;
		}
		System.out.printf("%s\n%d",b,c);
		}
	}

}

