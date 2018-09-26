package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k;
		int x = 0;
		String s = new String(new char[100001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}

			for (j = 0;j < s.length();j++,x = 0)
			{
				for (k = 0;k < s.length();k++)
				{
					if (s.charAt(k) == s.charAt(j) && k != j)
					{
						//printf("s[k]=%c,%d\n",s[k],k);
						x++;
						//printf("x=%d\n",x);

					}


				}

				if (x == 0)
				{
					System.out.printf("%c\n",s.charAt(j));
					break;
				}

			}

			if (j == s.length())
			{
				System.out.print("no\n");
			}



		}

		return 0;
	}
}

