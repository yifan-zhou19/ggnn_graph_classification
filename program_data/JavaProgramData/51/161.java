package <missing>;

public class GlobalMembers
{
	public static void ngram(String str, int n)
	{
		final String ng = "";
		int i;
		int Len = str.length();
		for (i = 0;i < Len - n + 1;i++)
		{
			ng = tangible.StringFunctions.changeCharacter(ng, i, str.substring(i, i + n));
		}
		int j;
		int max = 1;
		int count;
		for (i = 0;i < Len - n + 1;i++)
		{
			count = 1;
			for (j = i + 1;j < Len - n + 1;j++)
			{
				if (strcmp(ng.charAt(i),ng.charAt(j)) == 0)
				{
					count++;
				}
			}
			if (count >= max)
			{
				max = count;
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < Len - n + 1;i++)
			{
				count = 1;
				for (j = i + 1;j < Len - n + 1;j++)
				{
					if (strcmp(ng.charAt(i),ng.charAt(j)) == 0)
					{
						count++;
					}
				}
				if (count == max)
				{
					System.out.printf("%s\n",ng.charAt(i));
				}
			}
		}
	}
	public static void Main()
	{
		int n;
		String str = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		ngram(str, n);
	}
}

