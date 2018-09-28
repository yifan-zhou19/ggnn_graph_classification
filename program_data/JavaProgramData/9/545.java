package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		String t = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] y = new int[n];
		char[][] id = new char[n][10];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			if (y[i] >= 60)
			{
				for (j = i;j > 0;j--)
				{
				 if (y[j - 1] < y[j])
				 {
								  temp = y[j];
								  y[j] = y[j - 1];
								  y[j - 1] = temp;
								  t = id[j];
								  id[j] = id[j - 1];
								  id[j - 1] = t;
				 }
				}
			}
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%s\n",id[i]);
		}
	}

}

