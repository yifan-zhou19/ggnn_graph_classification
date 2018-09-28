package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int j;
		int l;
		String a = new String(new char[65535]);
		String str = new String(new char[65535]);
		str = new Scanner(System.in).nextLine();
		n = Integer.parseInt(str);
		for (i = 0;i < n;i++)
		{
				a = new Scanner(System.in).nextLine();
				l = a.length();
				if ((a.charAt(0) == '_') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z'))
				{
						for (j = 1;j < l;)
						{

								if ((a.charAt(j) <= '9' && a.charAt(j) >= '0') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) == '_'))
								{
										j++;
								}
								else
								{

										System.out.print("0\n");
										break;
								}
						}
						if (j == l)
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
	}

}
