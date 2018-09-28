package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int len;
		int time = 0;
		String str = new String(new char[100000]);
		String p = str;

		int[] cs = new int[100000];

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
				str = tempVar2.charAt(0);
			}

			len = str.length();

			for (j = 0;j < len;j++)
			{
				for (k = 0;k < len;k++)
				{
					if (*(p.Substring(k)) == *(p.Substring(j)))
					{
						cs[j]++;
					}
				}
			}

			for (j = 0;j < len;j++)
			{
				if (cs[j] == 1)
				{
					System.out.printf("%c\n",*(p.Substring(j)));
					break;
				}
			}

			time = 0;

			for (j = 0;j < len;j++)
			{
				if (cs[j] > 1)
				{
					time++;
				}
			}

			if (time == len)
			{
				System.out.print("no\n");
			}

			for (j = 0;j < len;j++)
			{
				cs[j] = 0;
			}

		}

		return 0;
	}

}

