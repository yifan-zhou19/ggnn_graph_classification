package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[2000]);
		zfc = new Scanner(System.in).nextLine();
		int c;
		c = zfc.length();

		int i;
		int k = 1;
		int[] kong = new int[200];
		kong[0] = 0;
		for (i = 0;i < c;i++)
		{
			if (zfc.charAt(i) == ' ')
			{
				kong[k] = i;
				k++;
			}
		}

		if (k == 1)
		{
		System.out.printf("%d",c);
		}
		else
		{
		int[] len = new int[200];

		len[0] = kong[1];

		for (i = 1;i < k - 1;i++)
		{
			len[i] = kong[i + 1] - kong[i] - 1;
		}
		len[k - 1] = c - kong[k - 1] - 1;


		int[] xlen = new int[200];
		int x = 0;
		for (i = 0;i < k;i++)
		{
			if (len[i] != 0)
			{
				xlen[x] = len[i];
				x++;
			}
		}

		System.out.printf("%d",xlen[0]);
	   for (i = 1;i < x;i++)
	   {
	   System.out.printf(",%d",xlen[i]);
	   }
		}
	   return 0;
	}
}
