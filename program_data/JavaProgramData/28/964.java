package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zifuchuan = new String(new char[N]);
		int i;
		int a = 0;
		zifuchuan = new Scanner(System.in).nextLine();
		int n = zifuchuan.length();
		for (i = 0;i < n;i++)
		{
			if (zifuchuan.charAt(i) != ' ')
			{
				a++;
			}
			else
			{
				if (a == 0)
				{
					continue;
				}
				System.out.printf("%d,",a);
				a = 0;
			}
		}
		System.out.printf("%d",a);
		return 0;
	}

}
