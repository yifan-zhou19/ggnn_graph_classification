package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String zfc = new String(new char[22]);
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			for (q = 0;zfc.charAt(q);q++)
			{
				if (!((zfc.charAt(q) == '_') || (zfc.charAt(q) >= 'a' && zfc.charAt(q) <= 'z') || (zfc.charAt(q) >= 'A' && zfc.charAt(q) <= 'Z') || (zfc.charAt(q) >= '0' && zfc.charAt(q) <= '9' && q>0)))
				{
					a[i] = a[i] + 1;
				}
				else
				{
					a[i] = a[i];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0)
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

