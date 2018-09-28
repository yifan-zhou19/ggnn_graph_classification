package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[2000];
		String b = new String(new char[21]);
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
				b = tempVar2.charAt(0);
			}
			m = b.length();
			for (j = 0;j < m;j++)
			{
				if (j == 0 && ((b.charAt(j) >= 65 && b.charAt(j) <= 90) || (b.charAt(j) >= 97 && b.charAt(j) <= 122) || b.charAt(j) == '_'))
				{
					a[i] = 1;
				}
				else if (j != 0 && ((b.charAt(j) >= 65 && b.charAt(j) <= 90) || (b.charAt(j) >= 97 && b.charAt(j) <= 122) || (b.charAt(j) >= 48 && b.charAt(j) <= 57) || b.charAt(j) == '_'))
				{
					a[i] = 1;
				}
				else
				{
					a[i] = 0;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
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

