package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[81]); //_ is 95 ,A is 65, a is 97
		int i;
		int j;
		int l;
		int g;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
			g = 0;
			str = new Scanner(System.in).nextLine();
			l = str.length();
			for (j = 0; j < l; j++)
			{

				if (str.charAt(0) == '_' || (str.charAt(0) <= 'z' && str.charAt(0) >= 'a') || (str.charAt(0) <= 'Z' && str.charAt(0) >= 'A'))
				{
					;
				}
				else
				{
					g = 1;
					break;
				}
				if (str.charAt(j) == '_' || (str.charAt(j) <= 'z' && str.charAt(j) >= 'a') || (str.charAt(j) <= 'Z' && str.charAt(j) >= 'A') || (str.charAt(j) >= '0' && str.charAt(j) <= '9'))
				{
					continue;
				}
				else
				{
					g = 1;
					break;
				}
			}
			if (g != 0)
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				System.out.print(1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

