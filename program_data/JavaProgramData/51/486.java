package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String a = new String(new char[600]);
		int[] ans = new int[600];
		int mm = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		int i;
		i = 0;
		int l = a.length();
		while (i + n <= l)
		{
			int j;
			ans[i] = 1;
			for (j = i + 1;j + n <= l;j++)
			{
				int ff = 1;
				int k;
				for (k = 0;k < n;k++)
				{
					if (a.charAt(i + k) != a.charAt(j + k))
					{
						ff = 0;
						break;
					}
				}
				if (ff != 0)
				{
					ans[i]++;
				}
			}
			if (ans[i] > mm)
			{
				mm = ans[i];
			}
			i++;
		}
		if (mm > 1)
		{
		System.out.printf("%d\n",mm);
		for (i = 0;i + n <= l;i++)
		{
			if (ans[i] == mm)
			{
				int k;
				for (k = i;k < i + n;k++)
				{
					System.out.printf("%c",a.charAt(k));
				}
				System.out.print("\n");
			}
		}
		}
		else
		{
			System.out.print("NO");
		}

		return 0;
	}
}

