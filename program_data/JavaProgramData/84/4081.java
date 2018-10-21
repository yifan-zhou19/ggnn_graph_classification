package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 1;
		int k = 1;
		int m = 1;
		int n;
		int[] str = new int[100];
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
				str[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 1;j < n;j++)
		{
			if (str[j - 1] > str[j])
			{
				i = str[j];
				str[j] = str[j - 1];
				str[j - 1] = i;
			}
		}
		j = 1;

		 for (j = 1;j < n;j++)
		 {
			if (str[j - 1] > str[j])
			{
				i = str[j];
				str[j] = str[j - 1];
				str[j - 1] = i;
			}
		 }



		System.out.printf("%d\n",str[n - 1]);
		System.out.printf("%d\n",str[n - 2]);

	}

}

