package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] len = new int[250];
		char[][] word = new char[250][40];
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
			len[i] = String.valueOf(word[i]).length();
		}
		for (j = 0,i = 0;i < n;i++)
		{
			j += len[i] + 1;
			if (i != n - 1)
			{
			if (j - 1 > 80)
			{
				System.out.print("\n");
				i--;
				j = 0;
			}
			else
			{
				if (j == 80 && j - 1 == 80)
				{
					System.out.printf("%s",word[i]);
					System.out.print("\n");
				}
				else
				{
					if (j + len[i + 1] > 80)
					{
					System.out.printf("%s",word[i]);
					}
					else
					{
					System.out.printf("%s",word[i]);
					System.out.print(" ");
					}
				}
			}
			}
			else
			{
				System.out.printf("%s",word[n - 1]);
			}
		}
		return 0;
	}



}

