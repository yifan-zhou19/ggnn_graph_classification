package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[510]);
		char[][] word = new char[300][5];
		int n;
		int i;
		int j;
		int k;
		int len;
		int count;
		int max = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0,j = 0;i <= len - n;i++)
		{
			for (k = 0;k < n;k++)
			{
				word[j][k] = str.charAt(i + k);
			}
			word[j][n] = '\0';
			j++;
		}
		for (i = 0;i < j;i++)
		{
			count = 0;
			for (k = i;k < j;k++)
			{
				if (strcmp(word[i],word[k]) == 0)
				{
					count++;
				}
			}
			max = (count > max)? count:max;
		}
		if (max == 1)
		{
			System.out.print("NO\n");
			return 0;
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < j;i++)
			{
				count = 0;
				for (k = i;k < j;k++)
				{
					if (strcmp(word[i],word[k]) == 0)
					{
						count++;
					}
				}
				if (count == max)
				{
					System.out.printf("%s\n",word[i]);
				}
			}
			return 0;
		}
	}
}

