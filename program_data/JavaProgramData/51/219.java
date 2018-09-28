package <missing>;

public class GlobalMembers
{
	public static int cmp(String s, int x, int y, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			if (!s[x + i].equals(s[y + i]))
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		String s = new String(new char[600]);
		int n;
		int l;
		int[] a = new int[600];
		int[] b = new int[600];
		int i;
		int j;
		int k = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l + 1 - n;i++)
		{
			t = 1;
			for (j = 0;j < k;j++)
			{
				if (cmp(s, i, b[j], n) != 0)
				{
					a[j]++;
					t = 0;
				}
			}
			if (t != 0)
			{
				b[k++] = i;
			}
		}
		t = 0;
		for (i = 0;i < k;i++)
		{
			if (a[i] > t)
			{
				t = a[i];
			}
		}
		if (t != 0)
		{
		System.out.printf("%d\n",t + 1);
		for (i = 0;i < k;i++)
		{
			if (a[i] == t)
			{
				for (j = b[i];j < b[i] + n;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				System.out.print("\n");
			}
		}
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

