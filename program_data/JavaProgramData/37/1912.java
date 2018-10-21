package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100005]);
		int t;
		int count;
		int len;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			c = 0;
			len = s.length();
			int[] a = new int[100005];
			for (int j = 0;j < len;j++)
			{
				count = 0;
				for (int k = 0;k < len;k++)
				{
					if (s.charAt(j) == s.charAt(k))
					{
						count++;
					}
				}
				if (count == 1)
				{
					System.out.printf("%c\n",s.charAt(j));
					c++;
					break;
				}
			}
			if (c == 0)
			{
				System.out.print("no");
			}
		}

	}
}

