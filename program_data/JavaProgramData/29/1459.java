package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int j;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		float[] up = new float[100]; //up?????down????
		float[] down = new float[100];
		float sum = 0F;
		for (j = 0;j < m;j++)
		{
			if (a[j] == 1)
			{ //???????????n?1???
			   sum = 2F;
			   System.out.printf("%.3f\n",sum);
			}
			else if (a[j] >= 2)
			{
					up[0] = 2F,up[1] = 3F; //?n????2?????up down???????
					down[0] = 1F,down[1] = 2F;
					for (i = 2;i < a[j];i++)
					{ //???up down????
						up[i] = up[i - 1] + up[i - 2];
						down[i] = down[i - 1] + down[i - 2];
					}

				   for (i = 0;i < a[j];i++)
				   {
				   sum += up[i] / down[i]; //??

				   }
				   System.out.printf("%.3f\n",sum);
			}
		   sum = 0F;
		}
		return 0;
	}


}

