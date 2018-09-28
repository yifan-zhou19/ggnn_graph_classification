package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String a = new String(new char[N]);
		String b = new String(new char[4]);
		int i;
		int j;

		b = new Scanner(System.in).nextLine();

		n = Integer.parseInt(b);

		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			if ((a.charAt(0) < 'a' || a.charAt(0)>'z') && (a.charAt(0) < 'A' || a.charAt(0)>'Z') && a.charAt(0) != '_')
			{
				System.out.print("no\n");
			}
			else
			{
				for (j = 0;a.charAt(j) != '\0';j++)
				{
					if ((a.charAt(j) < '0' || a.charAt(j)>'9') && (a.charAt(j) < 'a' || a.charAt(j)>'z') && (a.charAt(j) < 'A' || a.charAt(j)>'Z') && a.charAt(j) != '_')
					{
						System.out.print("no\n");
						break;
					}
				}
				if (a.charAt(j) == '\0')
				{
					System.out.print("yes\n");
				}
			}
		}

		return 0;
	}
}
