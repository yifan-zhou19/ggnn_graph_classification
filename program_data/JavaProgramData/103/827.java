package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[1001]);
		String = new Scanner(System.in).nextLine();
		int n;
		n = String.length();
		int i;
		int m = 1;
		for (i = 0;i < n;i++)
		{
						if (String[i] >= 97)
						{
						String[i] = string.charAt(i) - 32;
						}
		}
		for (i = 0;i < n;i++)
		{
						if (String[i] == string.charAt(i + 1))
						{
							m++;
						}
						else
						{

							 System.out.printf("(%c,%d)", string.charAt(i), m);
							 m = 1;
						}
		}

		return 0;
	}

}
