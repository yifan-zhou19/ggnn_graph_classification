package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] b = new int[10000];
		int len;
		String a = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			if (a.charAt(0) >= 'a' && a.charAt(0) <= 'z' || a.charAt(0) == '_' || a.charAt(0) <= 'Z' && a.charAt(0) >= 'A')
			{
				for (j = 1;j < len;j++)
				{
					if (a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) == '_' || a.charAt(j) <= 'Z' && a.charAt(j) >= 'A' || a.charAt(j) >= '0' && a.charAt(j) <= '9')
					{
						b[i] = 1;
					}
					else
					{
						b[i] = 0;
						break;
					}
				}
			}
			else
			{
				b[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
}

