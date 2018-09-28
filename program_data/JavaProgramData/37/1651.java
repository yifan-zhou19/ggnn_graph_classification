package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int k;
		int len;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[100005]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			h = 0;
			for (j = 0;j < len;j++)
			{

				sum = 0;
				for (k = 0;k < len;k++)
				{
					if (k != j && s.charAt(j) == s.charAt(k))
					{
						sum++;
						break;
					}
				}
				if (sum == 0)
				{
					System.out.printf("%c\n",s.charAt(j));
					h++;
					break;
				}
			}
			if (h == 0)
			{
				System.out.print("no\n");
			}
		}

		return 0;
	}

}

