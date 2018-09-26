package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int[] b = new int[100];
		String a = new String(new char[20]);
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
				a = tempVar2.charAt(0);
			}
			if ((a.charAt(0) == '_') || ('A' <= a.charAt(0) && a.charAt(0) <= 'Z') || ('a' <= a.charAt(0) && a.charAt(0) <= 'z'))
			{
				b[i] = 0;
				l = a.length();
				for (j = 1;j < l;j++)
				{
					if ((a.charAt(j) == '_') || ('A' <= a.charAt(j) && a.charAt(j) <= 'Z') || ('0' <= a.charAt(j) && a.charAt(j) <= '9') || ('a' <= a.charAt(j) && a.charAt(j) <= 'z'))
					{
					b[i] = 0;
					}
					else
					{
						b[i] = 1;
						break;
					}

				}
			}
			else
			{
				b[i] = 1;
			}
		}
			for (i = 0;i < n;i++)
			{
				if (b[i] == 1)
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

