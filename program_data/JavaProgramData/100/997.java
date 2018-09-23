package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int s;
		int i;
		int shuliang;
		int n;
		char weizhi;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		int zuihou = 0;
		for (s = 97;s <= 122;s++)
		{
			 shuliang = 0;
			 weizhi = s;
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == s)
				{
					shuliang++;
				}
			}
			if (shuliang != 0)
			{
			System.out.printf("%c=%d\n",weizhi,shuliang);
			zuihou++;
			}
		}

		if (zuihou == 0)
		{
			System.out.print("No");
		}
		return 0;


	}

}
