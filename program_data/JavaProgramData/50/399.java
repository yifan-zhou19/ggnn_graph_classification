package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = {0, 13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		int b; //xing qi ji //
		int d;
		int i;
		int j;
		int[] c = new int[13]; //meiyue shi xing qi ji//
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			d = b + a[i] % 7 - 1;
			if (d < 8)
			{
				c[i] = d;
			}
			else
			{
				c[i] = d - 7;
			}
		}
		for (j = 1;j <= 12;j++)
		{
			if (c[j] == 5)
			{
				System.out.printf("%d\n",j);
			}
		}
	}


}

