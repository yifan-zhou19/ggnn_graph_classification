package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1005]);
		int i;
		int cnt;
		int n;
		char c = 0;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (c != Character.toUpperCase(str.charAt(i)))
			{
				if (c != null)
				{
					System.out.printf("(%c,%d)",c,cnt);
				}
				cnt = 1;
				c = Character.toUpperCase(str.charAt(i));
				continue;
			}
			cnt++;
		}
		System.out.printf("(%c,%d)\n",c,cnt);
		return 0;
	}
}
