package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String str = new String(new char[40]);
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i);i++)
		{
			if (str.charAt(i) > 47 && str.charAt(i) < 58)
			{
				System.out.printf("%c",str.charAt(i));
				if (str.charAt(i + 1) && !(str.charAt(i + 1) > 47 && str.charAt(i + 1) < 58))
				{
					System.out.print("\n");
				}
			}
		}
	}
}
