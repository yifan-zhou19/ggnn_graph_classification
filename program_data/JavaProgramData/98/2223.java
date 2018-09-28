package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i;
		int n;
		int sum = 0;
		String[] word = {""};
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
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			sum = sum + a[i] + 1;

		if (sum + a[i + 1] < 81)
		{
			System.out.printf("%s ",word[i]);
		}
		else
		{
			System.out.printf("%s\n",word[i]), sum = 0;
		}
		}
		System.out.printf("%s",word[n - 1]);
		return 0;
	}

}

