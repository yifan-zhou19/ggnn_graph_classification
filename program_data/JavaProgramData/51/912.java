package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int[] f = new int[10000];
		int count;
		int t;
		String s = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();
		for (i = 0;i <= l;i++)
		{
			f[i] = 1;
			for (j = i + 1;j <= l;j++)
			{
				count = 1;
				for (k = 0;k < n;k++)
				{
					if (s.charAt(i + k) != s.charAt(j + k))
					{
						count = 0;
						break;
					}
				}
				if (count != 0)
				{
					++f[i];
				}
			}
		}
		count = 0;
		t = 0;
		for (i = 0;i <= l - 2 * n;i++)
		{
			if (f[i] > count)
			{
				count = f[i];
			}
		}
		if (count == 1)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.printf("%d\n",count);
		for (i = 0;i < l - 2 * n;i++)
		{
			if (f[i] == count)
			{
				for (k = 0;k < n;k++)
				{
					System.out.printf("%c",s.charAt(i + k));
				}
				System.out.print("\n");
			}
		}




		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

