package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] s = new int[21];
		String zf = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf = tempVar2.charAt(0);
			}
		for (j = 0;zf.charAt(j);j++)
		{
			if (!((zf.charAt(j) == '_') || (zf.charAt(j) >= 'a' && zf.charAt(j) <= 'z') || (zf.charAt(j) >= 'A' && zf.charAt(j) <= 'Z') || (zf.charAt(j) >= '0' && zf.charAt(j) <= '9' && j>0)))
			{
				break;
			}
		}
		System.out.print(zf.charAt(j) ? "no\n":"yes\n");
		}
	 return 0;
	}
}

