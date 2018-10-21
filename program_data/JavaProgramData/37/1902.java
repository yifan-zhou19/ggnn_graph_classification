package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String s = new String(new char[100010]);
			int[][] t = new int[26][2];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int i;
			int j;
			int k = 100010;
			for (i = 0;i < s.length();i++)
			{
				t[s.charAt(i) - 'a'][0]++;
				if (t[s.charAt(i) - 'a'][0] == 1)
				{
					t[s.charAt(i) - 'a'][1] = i;
				}
			}
			for (i = 0;i < 26;i++)
			{
				if (t[i][0] == 1)
				{
					if (k > t[i][1])
					{
						k = t[i][1];
					}
				}
			}
			if (k == 100010)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",s.charAt(k));
			}
		}
	}
}

