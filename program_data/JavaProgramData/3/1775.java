package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int c;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] za = new int[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(za[i]) = Integer.parseInt(tempVar3);
			}
		}
			for (int m = 0;m < n - 1;m++)
			{
				for (c = m + 1;c < n;c++)
				{
					if (za[m] + za[c] == k)
					{
					h++;
					}
				}
			}
			if (h > 0)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(za);
		return 0;
	}
}

