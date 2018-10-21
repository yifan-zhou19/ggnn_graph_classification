package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int l1;
		int l2;
		int[] ia = new int[128];
		int[] ib = new int[128];
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
		l1 = a.length();
		l2 = b.length();
		if (l1 != l2)
		{
			System.out.print("NO");
		}
		else
		{
			for (j = 0;j < l1;j++)
			{
				for (i = 1;i <= 127;i++)
				{
					if (a.charAt(j) == i)
					{
						ia[i]++;
						break;
					}
				}
			}
			for (j = 0;j < l1;j++)
			{
				for (i = 1;i <= 127;i++)
				{
					if (b.charAt(j) == i)
					{
						ib[i]++;
						break;
					}
				}
			}
			for (i = 1;i < 128;i++)
			{
				if (ia[i] != ib[i])
				{
					break;
				}
			}
			if (i == 128)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		return 0;
	}
}

