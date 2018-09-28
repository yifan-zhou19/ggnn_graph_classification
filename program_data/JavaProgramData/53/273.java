package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] s = new int[300];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i] = Integer.parseInt(tempVar2);
		}
	}
	System.out.printf("%d",s[0]);
	for (i = 1;i < n;i++)
	{
		for (j = 0,k = 0;j < i;j++)
		{
			if (s[j] == s[i])
			{
				k++;
			}
		}
	if (k == 0)
	{
		System.out.printf(",%d",s[i]);
	}
	}
	}

}

