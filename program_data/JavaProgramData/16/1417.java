package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] an = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int j = 0;
		for (i = n;i > 0;i = i / 10)
		{
		  an[j] = i % 10;
		  j++;
		}
		for (i = 0;i < j;i++)
		{
		 System.out.printf("%d",an[i]);
		}
		return 0;
	}

}

