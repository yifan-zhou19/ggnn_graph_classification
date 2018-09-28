package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int count = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String a = new String(new char[100005]);
			int[] b = new int[100005];
			for (j = 0;j < 100005;j++)
			{
				b[j] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;j < a.length();j++)
			{
				for (k = j + 1;k < a.length();k++)
				{
					if (a.charAt(j) == a.charAt(k))
					{
						b[j]++;
						b[k]++;
					}
				}
			}
			for (j = 0;j < a.length();j++)
			{
				if (b[j] == 0)
				{
					System.out.printf("%c\n",a.charAt(j));
					break;
				}
			}
			if (j == a.length())
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

