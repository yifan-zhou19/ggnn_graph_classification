package <missing>;

public class GlobalMembers
{
	public static void hw(String a, int n)
	{
		int i;
		int j;
		int k;
		int h = 0;
		for (i = 2;i <= n;i++)
		{
			for (j = 0;j <= n - i;j++)
			{
				for (k = 0;k < i;k++)
				{
					if (a[j + k].equals(a[j + i - k - 1]))
					{
						h = 1;
					}
					else
					{
						h = 0;
						break;
					}
				}
				if (h == 1)
				{
					for (h = j;h < j + i;h++)
					{
					System.out.printf("%c",a[h]);
					}
					System.out.print("\n");
					h = 0;
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		String a = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		hw(a, n);
		return 0;
	}
}

