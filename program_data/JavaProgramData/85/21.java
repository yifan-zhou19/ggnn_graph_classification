package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		int c = 0;
		String a = new String(new char[100]);
		char m;
		&m = new Scanner(System.in).nextLine();
		n = Integer.parseInt(m);
		//printf("%d ! ",n);
		for (i = 1;i <= n;i++)
		{
			c = 0;
			a = new Scanner(System.in).nextLine();
			l = a.length();
			for (j = 0;j < l;j++)
			{
				if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
				{
					c = 1;
					break;
				}
				 if (!((a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9')) && a.charAt(j) != '_')
				 {
				c = 1;
				break;
				 }
			//printf("%d * ",c);
			}
			if (c == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}

		}
		return 0;
	}
}
