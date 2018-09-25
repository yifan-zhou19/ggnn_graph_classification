package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int best = 0;
		int max = 0;
		int[] a = new int[26];
		int[] num = new int[100];
		int l;
		int j;
		int k;
		char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char[][] writer = new char[100][26];

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
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				writer[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(writer[i]).length();
			for (j = 0;j < l;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (writer[i][j] == letter[k])
					{
						a[k]++;
						break;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max < a[i])
			{
				best = i;
				max = a[i];
			}
		}
		System.out.printf("%c\n",letter[best]);
		System.out.printf("%d\n",max);
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(writer[i]).length();
			for (j = 0;j < l;j++)
			{
					if (writer[i][j] == letter[best])
					{
						System.out.printf("%d\n",num[i]);
						;
						break;
					}
			}
		}

	}
}

