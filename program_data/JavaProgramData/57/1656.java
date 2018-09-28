package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String w = new String(new char[50]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w = tempVar2.charAt(0);
			}
			k = w.length();
			if (w.charAt(k - 1) == 'g')
			{
				for (j = 0;j < k - 4;j++)
				{
					System.out.printf("%c",w.charAt(j));
				}
				System.out.printf("%c\n",w.charAt(k - 4));
			}
			else
			{
				for (j = 0;j < k - 3;j++)
				{
					System.out.printf("%c",w.charAt(j));
				}
				System.out.printf("%c\n",w.charAt(k - 3));
			}
		}
		return 0;

	}

}

