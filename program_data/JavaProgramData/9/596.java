package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j = 0;
		int k;
		int max;
		int[] age = new int[100];
		int[] age2 = new int[100];
		char[][] string = new char[100][11];
		int[] line = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (i = 0;i <= n - 1;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			string[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			age[i] = Integer.parseInt(tempVar3);
		}
	}
		for (i = 0;i <= n - 1;i++)
		{
				if (age[i] >= 60)
				{
				  age2[j] = age[i];
				  age[i] = 0;
				  line[j] = i;
				  j = j + 1;
				  k = j;
				}
		}
			for (i = 1;i <= k;i++)
			{
							  max = 0;
							  t = 0;
							for (j = 0;j <= k - 1;j++)
							{
									 if (max < age2[j])
									 {
										  max = age2[j];
										  t = j;
									 }
							}
							System.out.printf("%s\n",string[line[t]]);
							age2[t] = 0;
			}
		for (i = 0;i < n;i++)
		{
			if (age[i] != 0)
			{
			System.out.printf("%s\n",string[i]);
			}
		}
		System.in.read();
		System.in.read();
	}

}

