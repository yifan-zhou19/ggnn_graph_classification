package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		int i;
		int j = 1;
		int n = 0;
		int l;
		int d = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != ' ')
			{
				if (n != 0)
				{
					d++;
					n = 0;
				}
				else
				{
					d++;
				}
			}
			else
			{
				if (n == 0)
				{
					System.out.printf("%d,",d);
					n++;
					d = 0;
				}
			}
		}
		System.out.printf("%d",d);
	}
}
