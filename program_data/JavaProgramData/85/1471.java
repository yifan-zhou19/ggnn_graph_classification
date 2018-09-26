package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[21]);
		int n;
		int judge = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf = tempVar2.charAt(0);
			}
			for (int i = 0;zf.charAt(i);i++)
			{
				if (!((zf.charAt(i) >= '0' && zf.charAt(i) <= '9' && i>0) || (zf.charAt(i) >= 'a' && zf.charAt(i) <= 'z') || (zf.charAt(i) >= 'A' && zf.charAt(i) <= 'Z') || (zf.charAt(i) == '_')))
				{
				judge = 1;
				break;
				}
			}
			if (judge == 0)
			{
				System.out.print("yes\n");
			}
			if (judge == 1)
			{
				System.out.print("no\n");
			}
			judge = 0;
		}
		return 0;
	}
}

