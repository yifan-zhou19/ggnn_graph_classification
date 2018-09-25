package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] sz = new int[100];
		int len;
		int tag = 0;
		String zfc = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		len = zfc.length();
		for (i = 0;i < ('z'-'A' + 1);i++)
		{
				sz[i] = 0;
		}
		for (i = 0;i < len;i++)
		{
				if ((zfc.charAt(i) >= 'A' && zfc.charAt(i) <= 'Z') || (zfc.charAt(i) >= 'a' && zfc.charAt(i) <= 'z'))
				{
						sz[zfc.charAt(i) - 'A']++;
				}
		}

		for (int j = 'A';j <= 'z';j++)
		{
				if (sz[j - 'A'] != 0)
				{
					  System.out.printf("%c=%d",j,sz[j - 'A']);
					  System.out.print("\n");
					  tag = 1;
				}
		}
		if (tag == 0)
		{
				   System.out.print("No");
		}
				return 0;
	}


}

