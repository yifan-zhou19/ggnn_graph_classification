package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[256]);
		int i;
		int j;
		int n;
		int count = 1;
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
			if (zf.charAt(0) > 'z' || (zf.charAt(0) < 'a' && zf.charAt(0)>'Z') || zf.charAt(0) < 'A')
			{
				if (zf.charAt(0) != '_')
				{
				count = 0;
				System.out.print("no\n");
				continue;
				}
			}
			for (j = 1;zf.charAt(j) != '\0';j++)
			{
				if (zf.charAt(j) == '_' || (zf.charAt(j) >= 'A' && zf.charAt(j) <= 'Z') || (zf.charAt(j) >= '0' && zf.charAt(j) <= '9') || (zf.charAt(j) >= 'a' && zf.charAt(j) <= 'z'))
				{
					count = 1;
				}
				else
				{
					count = 0;
					System.out.print("no\n");
					break;
				}

			}
		if (count == 1)
		{
			System.out.print("yes\n");
		}
		}
		return 0;

	}
}

