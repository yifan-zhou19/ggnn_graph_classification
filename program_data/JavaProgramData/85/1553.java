package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int count = 0;
		int len;
		String fig = new String(new char[N + 1]);
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
				fig = tempVar2.charAt(0);
			}
			len = fig.length();
			if (fig.charAt(0) < 'A' || (fig.charAt(0)>'Z' && fig.charAt(0) < '_') || (fig.charAt(0)>'_' && fig.charAt(0) < 'a') || (fig.charAt(0)>'z'))
			{
				count++;
			}
			for (j = 1;j < len;j++)
			{
					if ((fig.charAt(j) < '0') || (fig.charAt(j)>'9' && fig.charAt(j) < 'A' || (fig.charAt(j)>'Z' && fig.charAt(j) < '_') || (fig.charAt(j)>'_' && fig.charAt(j) < 'a') || (fig.charAt(j)>'z')))
					{
						count++;
					}
			}
			if (count == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			count = 0;
		}
		return 0;
	}
}

