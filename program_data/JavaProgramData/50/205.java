package <missing>;

public class GlobalMembers
{
	public static void search(int w)
	{
		int[] a = {12, 43, 71, 102, 132, 163, 193, 224, 255, 285, 316, 346};
		int[] b = new int[12];
		int num = 0;
		int i;
		int j;
		int k;
		for (i = 0;i < 12;i++)
		{
			k = (w + a[i]) % 7;
			if (k == 5)
			{
				j = i + 1;
				b[num] = j;
				num++;

			}
		}

		for (i = 0;i < num;i++)
		{
			if (i == num - 1)
			{
				System.out.printf("%d",b[i]);
			}
			else
			{
				System.out.printf("%d\n",b[i]);
			}
		}
	}






	public static void Main()
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		search(w);
	}
}

