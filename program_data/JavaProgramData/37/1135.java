package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k <= n;k++)
		{
			String zifuchuan = new String(new char[10000]);
			zifuchuan = new Scanner(System.in).nextLine();
			int len;
			len = zifuchuan.length();
			int i;
			int j;
			int m = 0;
			int p = 0;
			int a;
			int b;
			for (i = 0;i < len;i++)
			{
				for (j = 0;j < len;j++)
				{
					a = (int)zifuchuan.charAt(i);
					b = (int)zifuchuan.charAt(j);
					if (a == b)
					{
						m++;
					}
				}
				if (m == 1)
				{
					System.out.printf("%c\n",zifuchuan.charAt(i));
					break;
				}
				else if (m != 1)
				{
					p++;
				}
				m = 0;
			}
			if (p == len && p != 0)
			{
				System.out.print("no\n");
			}
		}

		return 0;

	}
}

