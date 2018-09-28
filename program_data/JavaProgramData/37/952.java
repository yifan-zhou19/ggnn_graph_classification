package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int num;
		String zf = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l = 1;l <= n;l++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf = tempVar2.charAt(0);
			}
			for (j = 0;zf.charAt(j) != '\0';j++)
			{
				num = 0;
				for (i = 0;zf.charAt(i) != '\0';i++)
				{
					if (zf.charAt(i) == zf.charAt(j))
					{
						num++;
					}
				}
				if (num == 1)
				{
					System.out.printf("%c\n",zf.charAt(j));
					break;
				}
			}
			if (zf.charAt(j) == '\0')
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

