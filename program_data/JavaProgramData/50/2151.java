package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int w;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		j = 12;
		if ((w + j) % 7 == 5)
		{
		System.out.print("1\n");
		}
		for (i = 1;i < 12;i++)
		{
			j = j + a[i - 1];
			if ((w + j) % 7 == 5)
			{
			System.out.printf("%d\n",i + 1);
			}


		}



	return 0;

	}

}

