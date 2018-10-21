package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]);
		int i;
		int j;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != 0;i++)
		{
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
			{
				for (j = i;str.charAt(j) >= 48 && str.charAt(j) <= 57;j++)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print("\n");
				i = j;
			}
		}

		return 0;
	}

}
