package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String zfc = new String(new char[1000]);
		 String s = new String(new char[1000]);
		 int length;
		 int i;
		 int num = 0;
		 zfc = new Scanner(System.in).nextLine();
		 length = zfc.length();
		 for (i = 0;i < length;i++)
		 {
			if (i == 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, num, zfc.charAt(i));
				num++;
			}
			else
			{
				if (zfc.charAt(i) != ' ' || (zfc.charAt(i) == ' ' && zfc.charAt(i - 1) != ' '))
				{
					s = tangible.StringFunctions.changeCharacter(s, num, zfc.charAt(i));
					num++;
				}
			}
		 }
		for (i = 0;i < num;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		return 0;
	}
}

