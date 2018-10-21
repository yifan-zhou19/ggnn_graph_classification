package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[200]);
		String = new Scanner(System.in).nextLine();
		int n;
		int i;
		int j;
		n = String.length();
		for (i = 0;i < n;i++)
		{
						while (String[i] == ' ' && string.charAt(i + 1) == ' ')
						{
										for (j = i + 1;j < n;j++)
										{
											  String[j] = string.charAt(j + 1);
										}
						}

		}


		for (i = 0;i < n;i++)
		{

						if (String[i] == '\0')
						{
						break;
						}
						 System.out.printf("%c", string.charAt(i));
		}
		return 0;
	}

}
