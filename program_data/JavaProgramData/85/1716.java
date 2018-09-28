package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[21]);
		int[] sz = new int[21];
		int l;
		int n;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			l = str.length();
			for (m = 0;m < l;m++)
			{
				if ((str.charAt(m) <= 'z' && str.charAt(m) >= 'a') || str.charAt(m) == '_' || (str.charAt(m) <= 'Z' && str.charAt(m) >= 'A') || (str.charAt(m) <= '9' && str.charAt(m) >= '0'))
				{
					sz[i] = 1;
				}
				else
				{
				sz[i] = 0;
				break;
				}
			}
				if (str.charAt(0) == '9' || str.charAt(0) == '8' || str.charAt(0) == '7' || str.charAt(0) == '6' || str.charAt(0) == '5' || str.charAt(0) == '4' || str.charAt(0) == '3' || str.charAt(0) == '2' || str.charAt(0) == '1' || str.charAt(0) == '0')
				{
					sz[i] = 0;
				}
		}

		for (i = 1;i <= n;i++)
		{
			if (sz[i] == 1)
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

