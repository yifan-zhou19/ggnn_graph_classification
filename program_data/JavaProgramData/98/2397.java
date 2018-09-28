package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int count = 0;
		int[] len = new int[10000];
		final String sz = "";
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
				sz = tangible.StringFunctions.changeCharacter(sz, i, tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			len[i] = String.valueOf(sz.charAt(i)).length();
		}
		for (i = 0;i < n - 1;i++)
		{
			count = count + len[i] + 1;
			if (count > 81)
			{
				System.out.print("\n");
				count = 0;
				continue;
			}
			else if ((count - 1 <= 80) && (count + len[i + 1]>80))
			{
				System.out.printf("%s\n",sz.charAt(i));
				count = 0;
				continue;
			}
			else if ((count <= 80) && (count + len[i + 1] <= 80))
			{
				System.out.printf("%s ",sz.charAt(i));
				continue;
			}
		}
		System.out.printf("%s",sz.charAt(n - 1));
		return 0;
	}


}

