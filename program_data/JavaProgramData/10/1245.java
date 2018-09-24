package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int i;
		  int j;
		  int max;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  int[] height = new int[k];
		  int[] num = new int[k];
		  for (i = 0;i < k;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  height[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  num[k - 1] = 1;
		  max = 1;
			 for (i = k - 2;i >= 0;i--)
			 {
							   num[i] = 0;
								for (j = k - 1;j > i;j--)
								{
									 if (height[i] >= height[j] != 0 && num[i] < num[j])
									 {
									 num[i] = num[j];
									 }
								}
								num[i] = num[i] + 1;
								if (num[i] > max)
								{
								max = num[i];
								}
			 }
			 System.out.printf("%d\n",max);
			 System.in.read();
			 System.in.read();

	}

}

