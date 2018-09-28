package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int count = 0;
		String word = new String(new char[40]);
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
			if (count == 0)
			{
				System.out.printf("%s",word);
			}
			int j = 0;
			while (word.charAt(j) != '\0')
			{
				j++;
			}
			count = count + j;
			if (count > j)
			{
			if (count < 79)
			{
				count++;
				System.out.printf(" %s",word);
			}
			else if (count == 79)
			{
				System.out.printf(" %s\n",word);
				count = 0;
			}
			if (count > 79)
			{
				System.out.printf("\n%s",word);
				count = j;
			}
			}
		}
		return 0;
	}
}

