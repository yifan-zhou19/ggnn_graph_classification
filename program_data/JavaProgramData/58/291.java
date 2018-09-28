package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int counter;
		String c = new String(new char[2]);
		c = new Scanner(System.in).nextLine();
		int n = Integer.parseInt(c);
		String a = new String(new char[100]);
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			if (!((a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || a.charAt(0) == '_'))
			{
				System.out.print("0\n");
			}
			else
			{
				for (j = 1,counter = 0;j < l;j++)
				{
					if (!((a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || a.charAt(j) == '_'))
					{
						System.out.print("0\n");
						counter++;
						break;
					}
				}
				if (counter == 0)
				{
					System.out.print("1\n");
				}
			}
		}
		return 0;
	}
}
