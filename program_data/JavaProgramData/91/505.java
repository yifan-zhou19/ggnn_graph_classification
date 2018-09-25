package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int[] c = new int[1000];
		int i;
		int num = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			c[i] = a.charAt(i);
			num = num + 1;
		}
		for (i = 0;i < num;i++)
		{
			if (i + 1 == num)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, c[0] + c[i]);
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, c[i] + c[i + 1]);
			}
				System.out.printf("%c",b.charAt(i));
		}
		return 0;


	}
}

