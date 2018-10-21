package <missing>;

public class GlobalMembers
{
	//??????????C????
	//???2013.12.21
	//****************************

	public static int Main()
	{
		int n = 0;
		int j = 0;
		int i = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n != 0)
		{
			String a = new String(new char[100]);
			j = 0;
			a = new Scanner(System.in).nextLine();
			for (i = 0;i < a.length();i++)
			{
				if (i == 0)
				{
					if (a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
					{
						j++;
					}
					else
					{
					   break;
					}
				}
				else
				{
					if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || a.charAt(i) == '_' || (a.charAt(i) >= '0' && a.charAt(i) <= '9'))
					{
						j++;
					}
					else
					{
						break;
					}
				}
			}
			if (j == a.length())
			{
				System.out.print("yes");
				System.out.print("\n");
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
		  n--;
		}
		return 0;
	}
}

