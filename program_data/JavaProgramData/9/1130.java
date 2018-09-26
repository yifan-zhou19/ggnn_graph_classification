package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int e;
		char[][] s = new char[100][100];
		String str = new String(new char[100]);
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (a[i] >= 60 && a[i + 1] >= 60)
				{
					if (a[i] >= a[i + 1])
					{
						continue;
					}
					if (a[i] < a[i + 1])
					{
						str = s[i + 1];
						s[i + 1] = s[i];
	s[i] = str;
						e = a[i + 1];
						a[i + 1] = a[i];
						a[i] = e;
					}
				}
				if (a[i] >= 60 && a[i + 1] < 60)
				{
					continue;
				}
				if (a[i] < 60 && a[i + 1] >= 60)
				{
					str = s[i + 1];
					s[i + 1] = s[i];
					s[i] = str;
					e = a[i + 1];
					a[i + 1] = a[i];
					a[i] = e;
				}
				if (a[i] < 60 && a[i + 1] < 60)
				{
					continue;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}
		return 0;
	}

}

