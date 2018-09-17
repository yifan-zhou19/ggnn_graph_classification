package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i; //????
		int j;
		int x; //?????
		int y; //?????
		int t = 0; //????????
		int[] a = new int[15]; //??x???????
		int[] b = new int[15]; //??y???????
		int[] c = new int[15]; //????xy?????????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		b[0] = y;
		for (i = 0;i < 14;i++)
		{
			a[i + 1] = a[i] / 2;
			b[i + 1] = b[i] / 2;
		}
			for (i = 0;a[i] != 0;i++)
			{
				for (j = 0;b[j] != 0;j++)
				{
					if (a[i] == b[j])
					{
					   c[i] = a[i];
					}
				}
			}
					for (i = 0;i < 15;i++)
					{
						if (t < c[i])
						{
							t = c[i];
						}
					}
						System.out.printf("%d\n",t);
	}

}

