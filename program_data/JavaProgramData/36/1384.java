package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String word1 = "";
		final String word2 = "";
		int[] num1 = new int[128];
		int[] num2 = new int[128];
		int i;
		int j;
		int k1;
		int k2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			word2 = tempVar2.charAt(0);
		}
		k1 = word1.length();
		k2 = word2.length();
		if (k1 != k2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i <= k1 - 1;i++)
			{
				num1[word1.charAt(i)] = num1[word1.charAt(i)] + 1;
			}
			for (i = 0;i <= k2 - 1;i++)
			{
				num2[word2.charAt(i)] = num2[word2.charAt(i)] + 1;
			}
			j = 0;
			for (i = 0;i <= 127;i++)
			{
				if (num1[i] == num2[i])
				{
					j = j + 1;
				}
			}
			if (j == 128)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		return 0;
	}
}

