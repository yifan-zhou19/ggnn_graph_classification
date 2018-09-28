package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static int la;
	public static int lb;

	public static int compare(int k)
	{
		for (int i = 0;i < la;i++)
		{
			if (a.charAt(i) != b.charAt(i + k))
			{
			return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		for (int i = 0;i <= 99;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
			if (a.charAt(i) == 32)
			{
				la = i;
				break;
			}
		}
		for (int i = 0;i <= 99;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, System.in.read());
			if (b.charAt(i) == 10)
			{
				lb = i;
				break;
			}
		}
		for (int i = 0;i <= lb - la;i++)
		{
			if (compare(i) == 1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}

}

