package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char[][] word = new char[200][20];
		int[] count = new int[200];
		int max = 0;
		int min = 20;
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
				word[i] = tempVar2.charAt(0);
			}

		}

		for (i = 0;i < n;i++)
		{
			count[i] = String.valueOf(word[i]).length();
		}

		for (i = 0;i < n;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
			}
		}

		for (i = 0;i < n;i++)

		{
			if (count[i] < min)

			{
				min = count[i];
			}
		}

	for (i = 0;i < n;i++)
	{
		if (String.valueOf(word[i]).length() == max)
		{
		System.out.printf("%s\n",word[i]);
		break;
		}
	}

		for (i = 0;i < n;i++)
		{
		if (String.valueOf(word[i]).length() == min)
		{
		System.out.printf("%s\n",word[i]);
		break;
		}
		}



		return 0;
	}

}

