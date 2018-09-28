package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int i;
		int j;
		int[] c = new int[200];
		int k;
		for (i = 0;i < 200;i++)
		{
			c[i] = 1;
		}
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
		if (a.length() != b.length())
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < a.length();i++)
			{
				for (j = 0;j < b.length();j++)
				{
					if (a.charAt(i) == b.charAt(j) && c[j] != 0)
					{
						c[j] = 0;
						break;
					}
				}
			}
			k = 0;
			for (i = 0;i < a.length();i++)
			{
				if (c[i] == 1)
				{
					k = 1;
				}
			}
			if (k == 1)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.print("YES");
			}
		}
		return 0;
	}
}

