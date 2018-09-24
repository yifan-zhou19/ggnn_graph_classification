package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[10000]);
		int s;
		int e;
		int num;
		int len;
		int k = 0;
		zfc = new Scanner(System.in).nextLine();
		len = zfc.length();
		for (s = 0;s < len;s++)
		{
			if ((s == 0) || ((zfc.charAt(s - 1) == ' ') && (zfc.charAt(s) != ' ')))
			{
				for (e = s;e < len;e++)
				{
					if (zfc.charAt(e+1) == ' ' || e == len - 1)
					{
						break;
					}
				}
				num = e - s + 1;
				if (k == 0)
				{
					System.out.printf("%d",num);
					k++;
				}
				else
				{
					System.out.printf(",%d",num);
					k++;
				}
			}
		}
		return 0;
	}

}
