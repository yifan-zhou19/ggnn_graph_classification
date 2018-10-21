package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[31]);
		int i;
		int j;
		int k;
		zf = new Scanner(System.in).nextLine();
		for (i = 0;zf.charAt(i) != '\0';i++)
		{
			if (zf.charAt(i) == '0' || zf.charAt(i) == '1' || zf.charAt(i) == '2' || zf.charAt(i) == '3' || zf.charAt(i) == '4' || zf.charAt(i) == '5' || zf.charAt(i) == '6' || zf.charAt(i) == '7' || zf.charAt(i) == '8' || zf.charAt(i) == '9')
			{
				System.out.printf("%c",zf.charAt(i));
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}
