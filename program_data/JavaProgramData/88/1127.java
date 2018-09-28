package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		String x = new String(new char[100]);
		String p;
		x = new Scanner(System.in).nextLine();
		l = x.length();
		p = x;
		for (i = 0;i < l;i++)
		{
			if ((x.charAt(i) >= '0' && x.charAt(i) <= '9') == 0)
			{
				x = x.substring(0, i);
			}
		}
		System.out.print(p);
		System.out.print("\n");

			for (i = 0;i < l;i++)
			{
				if (x.charAt(i) == 0 && x.charAt(i + 1) != 0)
				{
					System.out.print((p.Substring(i) + 1));
					System.out.print("\n");
				}
			}



			return 0;
	}





}
