package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		int[] b = new int[50];
		int c;
		int l;
		int n;
		int i;
		int j;

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
			l = a.length();
			c = a.charAt(0);
			if (c >= 65 && c <= 90 || c == 95 || c >= 97 && c <= 122)
			{
				for (j = 1;j < l;j++)
				{
					c = a.charAt(j);
					if (c >= 65 && c <= 90 || c == 95 || c >= 48 && c <= 57 || c >= 97 && c <= 122)
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
			else if (b[i] == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}





}

