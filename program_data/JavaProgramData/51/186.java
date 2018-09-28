package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		final String a = "";
		String[] b = {""};
		int[] count = new int[500];
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		int s;
		s = a.length();
		for (i = 0;i < s - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[k][j] = a.charAt(i + j);
			}
			k++;
		}
		for (i = 0;i < k;i++)
		{
		  for (j = i;j < k;j++)
		  {
			  if (strcmp(b[i],b[j]) == 0)
			  {
				  count[i]++;
			  }
		  }
		}
		int max = 0;
		for (i = 0;i < k;i++)
		{
			if (count[i] >= max)
			{
				max = count[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max);
		for (i = 0;i < k;i++)
		{
			if (count[i] == max)
			{
		System.out.println(b[i]);
			}
		}
		}
		return 0;
	}
}

