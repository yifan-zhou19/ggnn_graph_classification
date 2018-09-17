package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int count = 1;
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
								if ((a.charAt(i) == a.charAt(i + 1)) || (a.charAt(i) - a.charAt(i + 1) == 'a'-'A') || (a.charAt(i + 1) - a.charAt(i) == 'a'-'A'))
								{
												count++;
								}
								else
								{
									if (a.charAt(i) >= 'a')
									{
												 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
												 System.out.printf("(%c,%d)",a.charAt(i),count);
												 count = 1;
									}
									else
									{
										System.out.printf("(%c,%d)",a.charAt(i),count);
										count = 1;
									}
								}
		}
		System.in.read();
		System.in.read();
	}

}

