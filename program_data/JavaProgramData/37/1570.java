package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int l;
		int x = 0;
		int y = 0;
		String s = new String(new char[100010]);
		int[] op = new int[100010];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
		{
			x = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			for (i = 0;i < l;i++)
			{
				op[i] = 0; //????
			}
			for (i = 0;i < l;i++)
			{
				if (op[i] == 0)
				{
					op[i] = 1;
					y = 0; //?????
					for (j = i + 1;j < l;j++)
					{
						if (s.charAt(i) == s.charAt(j))
						{
							y = 1;
							op[j] = 1;
						}
					}
					if (y == 0) //????
					{
						x = 1;
						System.out.printf("%c\n",s.charAt(i));
						break;
					}
				}
			}
			if (x == 0)
			{
				System.out.print("no\n"); //????
			}
		}
		return 0;
	}
}

