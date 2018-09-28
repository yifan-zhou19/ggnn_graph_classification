package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int m;
		int i;
		int j;
		String s = new String(new char[100000]);
		int[] a = new int[100000];
		int[] num = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 1;m <= n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			for (i = 0;i <= l - 1;i++)
			{
				num[i] = 0;
			}
			for (i = 0;i <= l - 2;i++)
			{
				for (j = i + 1;j <= l - 1;j++)
				{
					if (s.charAt(i) == s.charAt(j))
					{
						num[i]++;
						num[j]++;
					}
				}
			}
			for (i = 0;i <= l - 1;i++)
			{
				if (num[i] == 0)
				{
					System.out.printf("%c\n",s.charAt(i));
					break;
				}
			}
			if (i == l)
			{
			System.out.print("no\n");
			}
		}
		return 0;
	}
}

