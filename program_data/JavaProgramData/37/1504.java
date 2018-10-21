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
		int i;
		for (i = 0;i < n;i++)
		{
			String s = new String(new char[10002]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int len;
			len = s.length();
			int k;
			int j;

			for (k = 0;k < len;k++)
			{
				int number = 0;
				for (j = 0;j < len;j++)
				{
					if (s.charAt(k) == s.charAt(j))
					{
						number++;
					}
				}
				if (number == 1)
				{
					System.out.printf("%c\n",s.charAt(k));
					break;
				}
				if (k == len - 1 && number != 1)
				{
					System.out.print("no\n");
				}

			}
		}
		return 0;

	}
}

