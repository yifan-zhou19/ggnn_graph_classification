package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[301]);
		char p1;
		char p2;
		int i;
		int j = 0;
		int k = 0;
		int tag = 0;
		int[] d = new int[26];
		int[] x = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		for (p1 = 'A';p1 <= 'Z';p1++,j++)
		{
			for (i = 0;zfc.charAt(i) != '\0';i++)
			{
				if (zfc.charAt(i) == p1)
				{
					d[j]++;
					tag = 1;
				}
			}
		}
		for (p2 = 'a';p2 <= 'z';p2++,k++)
		{
			for (i = 0;zfc.charAt(i) != '\0';i++)
			{
				if (zfc.charAt(i) == p2)
				{
					x[k]++;
					tag = 1;
				}
			}
		}
		if (tag == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (p1 = 'A',j = 0;p1 <= 'Z',j < 26;p1++,j++)
			{
				if (d[j] != 0)
				{
					System.out.printf("%c=%d\n",p1,d[j]);
				}
			}
			for (p2 = 'a',k = 0;p2 <= 'z',k < 26;p2++,k++)
			{
				if (x[k] != 0)
				{
					System.out.printf("%c=%d\n",p2,x[k]);
				}
			}
		}
		return 0;
	}



}

