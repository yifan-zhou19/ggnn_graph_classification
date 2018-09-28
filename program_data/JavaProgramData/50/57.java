package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < 12;i++)
		{
			if ((a[i] - 1 + n) % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}


	}


}

