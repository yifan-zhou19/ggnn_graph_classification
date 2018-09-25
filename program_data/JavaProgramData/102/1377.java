package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] sex = new char[50][7];
		float[] height = new float[50];
		float[] heightofboy = new float[50];
		float[] heightofgirl = new float[50];
		float temp;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				height[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0,j = 0,k = 0;i <= n - 1;i++)
		{
			if (strcmp(sex[i],"male") == 0)
			{
				heightofboy[j] = height[i];
				j++;
			}
			else
			{
				heightofgirl[k] = height[i];
				k++;
			}
		}
		//???????+??
		for (i = 0;i < j;i++)
		{
			for (p = 0;p < j - i - 1;p++)
			{
				if (heightofboy[p] > heightofboy[p + 1])
				{
					temp = heightofboy[p];
					heightofboy[p] = heightofboy[p + 1];
					heightofboy[p + 1] = temp;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2f ",heightofboy[i]);
		}
	   //???????+??
	   for (i = 0;i < k;i++)
	   {
		   for (q = 0;q < k - i - 1;q++)
		   {
			   if (heightofgirl[q] < heightofgirl[q + 1])
			   {
				   temp = heightofgirl[q];
				   heightofgirl[q] = heightofgirl[q + 1];
				   heightofgirl[q + 1] = temp;
			   }
		   }
	   }
	   for (i = 0;i < k - 1;i++)
	   {
			System.out.printf("%.2f ",heightofgirl[i]);
	   }
		System.out.printf("%.2f",heightofgirl[k - 1]);
	}

}

