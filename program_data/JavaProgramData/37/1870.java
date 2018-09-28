package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		int n;
		int x;
		int i;
		int j;
		String s = new String(new char[100002]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (e = 0;e < n;e++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			x = s.length();
			int[] b = new int[x];
			for (i = 0;i < x;i++)
			{
				b[i] = 0;
				for (j = 0;j < x;j++)
				{
					if (s.charAt(j) == s.charAt(i))
					{
						b[i]++;
					}
				}
			}
			for (i = 0;i < x;i++)
			{
				if (b[i] == 1)
				{
					System.out.printf("%c\n",s.charAt(i));
					break;
				}
				if (b[i] != 1 && i == (x - 1))
				{
					System.out.print("no\n");
				}
			}
		}
	}
}

