package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[301]);
		zfc = new Scanner(System.in).nextLine();
		int i;
		int j;
		int count;
		int len = zfc.length();
		char zf;
		int first = 1;
		for (i = 65;i <= 90;i++)
		{
			zf = i;
			count = 0;
			for (j = 0;j < len;j++)
			{
				if (zfc.charAt(j) == i)
				{
					count++;
				}
			}
			if (count != 0 && first == 1)
			{
				System.out.printf("%c=%d",zf,count);
				first = 0;
			}
			else if (count != 0 && first == 0)
			{
				System.out.printf("\n%c=%d",zf,count);
			}
		}
		for (i = 97;i <= 122;i++)
		{
			zf = i;
			count = 0;
			for (j = 0;j < len;j++)
			{
				if (zfc.charAt(j) == i)
				{
					count++;
				}
			}
			if (count != 0 && first == 1)
			{
				System.out.printf("%c=%d",zf,count);
				first = 0;
			}
			else if (count != 0 && first == 0)
			{
				System.out.printf("\n%c=%d",zf,count);
			}
		}
		if (first == 1)
		{
			System.out.print("No");
		}
		return 0;
	}
}
