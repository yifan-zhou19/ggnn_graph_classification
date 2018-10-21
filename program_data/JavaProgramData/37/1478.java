package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int k;
		String s = new String(new char[M]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 0;k < t;k++)
		{
			int[] count = new int[M];
			int flag = 0;
			int n;
			int i;
			int j;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			n = s.length();
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (s.charAt(j) == s.charAt(i))
					{
						count[i]++;
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				if (count[i] == 1)
				{
					System.out.printf("%c\n",s.charAt(i));
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
		}

		return 0;
	}
}

