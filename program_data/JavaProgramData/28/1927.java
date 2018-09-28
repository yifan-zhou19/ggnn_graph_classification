package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int s;
		int t = 0;
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				s = 0;
				while (true)
				{
					s++;
					i++;
					if (a.charAt(i) == ' ' || i >= n)
					{
						break;
					}
				}
				if (t == 0)
				{
					t++;
					System.out.printf("%d",s);
				}
				else
				{
					System.out.printf(",%d",s);
				}
			}
		}
		return 0;
	}
}
