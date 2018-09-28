package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			int[] anlen1 = new int[100];
			int[] anlen2 = new int[100];
			str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len1 = str1.length();
			int len2 = str2.length();
			j = 0;
			for (i = len1 - 1;i >= 0;i--)
			{
				anlen1[j++] = str1.charAt(i) - '0';
			}
			j = 0;
			for (i = len2 - 1;i >= 0;i--)
			{
				anlen2[j++] = str2.charAt(i) - '0';
			}
			for (i = 0;i < len1;i++)
			{
				if (anlen1[i] >= anlen2[i])
				{
					anlen1[i] -= anlen2[i];
				}
				else
				{
					anlen1[i] = anlen1[i] - anlen2[i] + 10;
					anlen1[i + 1]--;
				}
			}
			i = len1 - 1;
			while (anlen1[i] == 0)
			{
				i--;
			}
			for (;i >= 0;i--)
			{
				System.out.print(anlen1[i]);
			}
			System.out.print("\n");
			n--;
		}
	return 0;
	}

}

