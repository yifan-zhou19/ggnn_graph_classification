package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int len;
		String ch = new String(new char[21]);
		String m = new String(new char[10]);
		m = new Scanner(System.in).nextLine();
		n = Integer.parseInt(m);
		for (i = 0;i < n;i++)
		{
			ch = new Scanner(System.in).nextLine();
			len = ch.length();
			for (j = 0;j < len;j++)
			{
				if (j == 0)
				{
				if ((ch.charAt(j) < 'A' || ch.charAt(j)>'Z') && (ch.charAt(j) < 'a' || ch.charAt(j)>'z') && ch.charAt(j) != '_')
				{
					break;
				}
				}
				else
				{
				if ((ch.charAt(j) < 'A' || ch.charAt(j)>'Z') && (ch.charAt(j) < 'a' || ch.charAt(j)>'z') && ch.charAt(j) != '_' && (ch.charAt(j) < '0' || ch.charAt(j)>'9'))
				{
					break;
				}
				}
			}
			if (j == len)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}

}
