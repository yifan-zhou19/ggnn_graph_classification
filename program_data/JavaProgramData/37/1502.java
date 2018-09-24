package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int t;
		int i;
		int n = 0;
		int j = 0;
		int k;
		String s = new String(new char[110000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				for (k = 0;s.charAt(k) != '\0';k++)
				{
					if (s.charAt(k) == s.charAt(j))
					{
						n++;
					}
				}
				if (n == 1)
				{

					System.out.printf("%c\n",s.charAt(j));
					n = 0;
					break;
				}
				else
				{
					n = 0;
				}


			}
			if (s.charAt(j) == '\0')
			{
					System.out.print("no\n");
					n = 0;
			}
		}

		return 0;
	}
}

