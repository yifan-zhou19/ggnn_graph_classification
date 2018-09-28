package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		final String s = "";
		int i;
		int j = 0;
		int k;
		int n;
		int[] l = new int[500];
		int[] len = new int[500];
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
				str = tangible.StringFunctions.changeCharacter(str, i, tempVar2);
			}
			l[i] = String.valueOf(str.charAt(i)).length();
		}
		for (i = 0;i < l[0];i++)
		{
			s.charAt(0)[i] = str.charAt(0)[i];
		}
		len[0] = l[0];
		for (i = 1;i < n;i++)
		{
			if (len[j] + l[i] <= 79)
			{
				s.charAt(j)[len[j]] = ' ';
				for (k = len[j] + 1;k <= len[j] + l[i];k++)
				{
					s.charAt(j)[k] = str.charAt(i)[k - len[j] - 1];
				}
				len[j] += l[i] + 1;
			}
			else
			{
				j++;
				for (k = 0;k < l[i];k++)
				{
					s.charAt(j)[k] = str.charAt(i)[k];
				}
				len[j] = l[i];
			}
		}
		for (i = 0;i < j + 1;i++)
		{
			System.out.printf("%s\n",s.charAt(i));
		}
		return 0;
	}
}

