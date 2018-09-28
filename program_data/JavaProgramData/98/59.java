package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int sum = 0;
		int[] length = new int[1000];
		char[][] word = new char[1000][50];
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
						length[i] = String.valueOf(word[i]).length();
		}
		for (i = 0;i < n - 1;i++)
		{
						if (sum + length[i] <= 80)
						{
											 if (sum + length[i] + length[i + 1] + 1 <= 80)
											 {
																				System.out.printf("%s ",word[i]);
																				sum += length[i] + 1;
											 }
											 else
											 {
												 System.out.printf("%s\n", word[i]);
												 sum = 0;
											 }

						}

		}
		System.out.printf("%s", word[n - 1]);
		return 0;
	}


}

