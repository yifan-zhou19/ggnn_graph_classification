package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int c;
		String x = new String(new char[10]);
		String zfc = new String(new char[20]);
		x = new Scanner(System.in).nextLine();
		n = Integer.parseInt(x);
		for (i = 0;i < n;i++)
		{
			zfc = new Scanner(System.in).nextLine();
			c = 0;
			for (k = 0;zfc.charAt(k) != '\0';k++)
			{
				if (k == 0)
				{
					if ((zfc.charAt(k) >= '0') && (zfc.charAt(k) <= '9'))
					{
						c++;
					}
					else if ((zfc.charAt(k) >= '\0' && zfc.charAt(k) < '0') || (zfc.charAt(k)>'9' && zfc.charAt(k) < 'A') || (zfc.charAt(k)>'Z' && zfc.charAt(k) < '_') || (zfc.charAt(k)>'_' && zfc.charAt(k) < 'a') || (zfc.charAt(k)>'z'))
					{
						c++;
					}
				}
				else
				{
					if ((zfc.charAt(k) >= '\0' && zfc.charAt(k) < '0') || (zfc.charAt(k)>'9' && zfc.charAt(k) < 'A') || (zfc.charAt(k)>'Z' && zfc.charAt(k) < '_') || (zfc.charAt(k)>'_' && zfc.charAt(k) < 'a') || (zfc.charAt(k)>'z'))
					{
						c++;
					}
				}
			}
			if (c > 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}
