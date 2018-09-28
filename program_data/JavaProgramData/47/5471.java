package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] num;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = n / 2;
		num = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < t;i++)
		{
			j = num[i];
			num[i] = num[n - 1 - i];
			num[n - 1 - i] = j;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",num[i]);
			if (i < n - 1)
			{
				System.out.print(" ");
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(num);
	}
}

