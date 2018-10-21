package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[6]);
	public static int i;
	public static int j;
	public static void replace(int i,int j)
	{
		int temp;
		if (i < j)
		{
			temp = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
			a = tangible.StringFunctions.changeCharacter(a, j, temp);
			replace(i + 1, j - 1);
		}
		else
		{
			return;
		}
	}
	public static void Main()
	{
		a = new Scanner(System.in).nextLine();
		replace(0, a.length() - 1);
		System.out.println(a);
	}
}

