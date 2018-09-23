package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
		char mi;
		int[] sz = new int[256];
		int in;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		for (in = 0;in < 300;in++)
		{
			mi = zfc.charAt(in);
			sz[mi]++;
			if (zfc.charAt(in) == '\0')
			{
				break;
			}
		}
		int Flag = 0;
		for (int kt = 65;kt <= 90;kt++)
		{
			if (sz[kt] != 0)
			{
				System.out.printf("%c=%d\n",kt,sz[kt]);
				Flag = 1;
			}
		}
		for (int akt = 97;akt <= 122;akt++)
		{
			if (sz[akt] != 0)
			{
				System.out.printf("%c=%d\n",akt,sz[akt]);
				Flag = 1;
			}
		}
		if (Flag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

