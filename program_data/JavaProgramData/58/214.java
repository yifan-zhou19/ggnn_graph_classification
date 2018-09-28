package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
						a = new Scanner(System.in).nextLine();
						if ((a.charAt(0) == '_') || ((a.charAt(0) >= 'A') && (a.charAt(0) <= 'Z')) || ((a.charAt(0) >= 'a') && (a.charAt(0) <= 'z')))
						{
								 for (j = 1;j < a.length();j++)
								 {
														 if ((a.charAt(j) < 48) || ((a.charAt(j) >= 58) && (a.charAt(j) <= 64)) || ((a.charAt(j) >= 91) && (a.charAt(j) <= 94)) || (a.charAt(j) == 96) || (a.charAt(j) >= 123))
														 {
															 System.out.print("0\n");
														 break;
														 }
								 }
								 if (j == a.length())
								 {
								 System.out.print("1\n");
								 }
						}
						else
						{
							System.out.print("0\n");
						}
		}
		System.in.read();
		System.in.read();
	}
}

