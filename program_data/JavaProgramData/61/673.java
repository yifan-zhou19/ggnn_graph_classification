package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void compute(int shuzu);
	public static int Main()
	{
		int n;
		int i;
		int k;
		int sum = 0;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] shuzu = new int[n];
		for (i = 0;i < n;i++)
		{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   shuzu[i] = Integer.parseInt(tempVar2);
			   }
		}
		for (i = 0;i < n;i++)
		{
			if (shuzu[i] <= 2)
			{
			   System.out.print("1\n");
			}
			else
			{
				   a = 1;
				   b = 1;
				   for (k = 3;k <= shuzu[i];k++)
				   {
					   sum = a + b;
					   a = b;
					   b = sum;
				   }
				   System.out.printf("%d\n",sum);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(shuzu);
		return 0;
	}
}

