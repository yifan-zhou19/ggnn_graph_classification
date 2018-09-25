package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		int k;
		String str = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n;i++)
		{
			k = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			len = str.length();
			if (((str.charAt(0) > 64) && (str.charAt(0) < 91)) || ((str.charAt(0)>96) && (str.charAt(0) < 123)) || (str.charAt(0) == '_'))
			{
				for (j = 1;j < len;j++)
				{
					if (!(((str.charAt(j) > 47) && (str.charAt(j) < 58)) || ((str.charAt(j)>64) && (str.charAt(j) < 91)) || ((str.charAt(j)>96) && (str.charAt(j) < 123)) || (str.charAt(j) == '_')))
					{
						k++;
					}
				}
				if (k == 0)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}


}

