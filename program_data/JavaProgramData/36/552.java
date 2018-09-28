package <missing>;

public class GlobalMembers
{
	public static int compare(String b, int n, char a)
	{
		int i;
		int j;
		for (i = 0;i < n;++i)
		{
			if (b[i].equals(a))
			{
				for (j = i;j < n - 1 - i;++j)
				{
					b[j] = b[j + 1];
				}
				return (0);
			}
			else
			{
				continue;
			}
		}
		return (1);
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int len1;
		int len2;
		int i;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		len1 = a.length();
		len2 = b.length();
		if (len1 == len2)
		{
			for (i = 0;i < len1;++i)
			{
				if (compare(b, len2, a.charAt(i)) != 0)
				{
					System.out.print("NO\n");
					t = 1;
					break;
				}
			}
			if (t == 0)
			{
				System.out.print("YES\n");
			}
		}
		else
		{
			System.out.print("NO\n");
		}
	}


}

