package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String A = new String(new char[80]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		A = new Scanner(System.in).nextLine();
		for (int i = 0;i < n;i++)
		{
			A = new Scanner(System.in).nextLine();
			m = A.length();
			int g = 0;
			for (int j = 0;j < m;j++)
			{
				if (!(A.charAt(j) >= 'a' && A.charAt(j) <= 'z' || A.charAt(j) >= 'A' && A.charAt(j) <= 'Z' || A.charAt(j) == '_' || A.charAt(j) >= '0' && A.charAt(j) <= '9') || A.charAt(0) >= '0' && A.charAt(0) <= '9')
				{
					g = 1;
				}
			}
			if (g == 1)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print("yes");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

