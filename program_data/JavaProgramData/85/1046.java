package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String zfc = new String(new char[100]);
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			for (i = 0;i < zfc.length();i++)
			{
				s = 1;
			if ((i == 0 && (zfc.charAt(0) == '_' || (zfc.charAt(0) >= 'a' && zfc.charAt(0) <= 'z') || (zfc.charAt(0) >= 'A' && zfc.charAt(0) <= 'Z'))) || (i != 0 && ((zfc.charAt(i) == '_' || (zfc.charAt(i) >= '0' && zfc.charAt(i) <= '9') || (zfc.charAt(i) >= 'a' && zfc.charAt(i) <= 'z') || (zfc.charAt(i) >= 'A' && zfc.charAt(i) <= 'Z')))))
			{
				s = 1;
			}
			else
			{
				s = 0;
			break;
			}
			}
			if (s == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}

				return 0;
	}

}

