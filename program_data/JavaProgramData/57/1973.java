package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int tmp;
		int j;
		String word = new String(new char[100]);
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
				word = tempVar2.charAt(0);
			}
			tmp = word.length();
			if (word.charAt(tmp - 2) == 'e' || word.charAt(tmp - 2) == 'l')
			{
			for (j = 0;j < tmp - 3;j++)
			{
				System.out.printf("%c",word.charAt(j));
			}
			System.out.printf("%c\n",word.charAt(tmp - 3));
			}
			else
			{
				for (j = 0;j < tmp - 4;j++)
				{
				System.out.printf("%c",word.charAt(j));
				}
			System.out.printf("%c\n",word.charAt(tmp - 4));
			}
		}
		return 0;
	}


}

