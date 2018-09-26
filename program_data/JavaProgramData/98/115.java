package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] t = new int[1000];
		int k = 0;
		String[] word = {""};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
			t[i] = String.valueOf(word[i]).length();
		}

		for (i = 0; i < n - 1; i++)
		{
			k = k + t[i] + 1;
			if (k - 1 <= 80 && k + t[i + 1] <= 80)
			{
				System.out.printf("%s ", word[i]);
			}
			else if (k - 1 <= 80)
			{
				System.out.printf("%s\n", word[i]);
			}
			else
			{
				k = t[i] + 1;
				System.out.printf("%s ", word[i]);
			}
		}
		System.out.printf("%s", word[n - 1]);
	}
}

