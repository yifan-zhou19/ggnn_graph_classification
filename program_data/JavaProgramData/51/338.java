package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] count = new int[600];
		int n;
		final String a = "";
		String[] b = {""};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		int s = a.length();
		int i;
		int j;
		for (i = 0;i + n <= s;i++)
		{
			 for (j = 0;j < n;j++)
			 {
				 b[i][j] = a.charAt(i + j);
			 }
		}

		int k = s - n + 1;
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					count[i]++;
				}
			}
		}
		int max = 0;
		int y = 0;
		for (i = 0;i < k;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
			}
		}
			if (max == 0)
			{
				System.out.print("NO");
				return 0;
			}
		 System.out.printf("%d\n",max + 1);
		 for (i = 0;i < k;i++)
		 {
			 if (max == count[i])
			 {
				 System.out.println(b[i]);
			 }
		 }
		return 0;
	}
}

