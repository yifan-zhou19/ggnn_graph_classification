package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int len;
		int flag = 0;
		String str = new String(new char[501]);
		char[][] word = new char[500][6];
		for (i = 0;i < 500;i++)
		{
			for (j = 0;j < 6;j++)
			{
				word[i][j] = '\0';
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		len = str.length();
		j = 0;
		k = 0;
		for (i = 0;i < len;i++)
		{
		   word[k][j] = str.charAt(i);
		   j++;
		   if (j == n)
		   {
			   k++;
			   i = i - n + 1;
			   j = 0;
		   }
		}
		int[] count = new int[501];
		for (i = 0;i < k;i++)
		{
		 if (word[i][0] != 0)
		 {
			 for (j = i + 1;j < k;j++)
			 {
				 if (strcmp(word[i],word[j]) == 0)
				 {
				 count[i]++;
				 word[j][0] = 0;
				 }
			 }
		 }
		}
		for (i = 0;i < k;i++)
		{
			if (count[i] != 0)
			{
				break;
			}
		}
		if (i == k)
		{
			System.out.print("NO");
		}
		else
		{
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (count[i] < count[j])
				{
					break;
				}
			}
				if (j == k)
				{
					System.out.printf("%d\n",count[i] + 1);
					System.out.printf("%s\n",word[i]);
					flag = 1;
				}
			if (flag == 1)
			{
				break;
			}
		}
		for (i = i + 1;i < k;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (count[i] < count[j])
				{
					break;
				}
			}
				if (j == k)
				{
					System.out.printf("%s\n",word[i]);
				}
		}
		}
	}
}

