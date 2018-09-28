package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[128]);
		String b = new String(new char[128]);
		int[] c = new int[64];
		int[] d = new int[64];
		int i;
		int sum;
		int j;
		for (i = 0;i < 128;i++)
		{
			c[i] = 0;
			d[i] = 0;
		}
		char ch = 'A';
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
		if ((int)a.length() == (int)b.length())
		{
			j = 0;
			sum = 0;
			for (j = 0;j < 128;j++)
			{
				for (i = 0;i <= 62;i++)
				{
					ch = 'A' + i;
					if (a.charAt(j) == ch)
					{
						c[i] = c[i] + 1;
					}
					if (b.charAt(j) == ch)
					{
						d[i] = d[i] + 1;
					}
				}
			}
			for (i = 0;i <= 62;i++)
			{
				if (c[i] != d[i])
				{
					sum = sum + 1;
				}
			}
			if (sum == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}

}

