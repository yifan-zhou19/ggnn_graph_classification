package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int n;
		int j;
		int i;
		int[] sz = new int[100];
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
				str = tempVar2.charAt(0);
			}
			if ((str.charAt(0) <= 'Z' && str.charAt(0) >= 'A') || str.charAt(0) == '_' || (str.charAt(0) <= 'z' && str.charAt(0) >= 'a'))
			{
			for (j = 1;str.charAt(j) != '\0';j++)
			{
				if ((str.charAt(j) <= 'Z' && str.charAt(j) >= 'A') || str.charAt(j) == '_' || (str.charAt(j) <= 'z' && str.charAt(j) >= 'a') || (str.charAt(j) >= '0' && str.charAt(j) <= '9'))
				{
					sz[i] = 1;
				}
				else
				{
					sz[i] = 0;
					break;
				}
			}
			}
			else
			{
				sz[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}

}

