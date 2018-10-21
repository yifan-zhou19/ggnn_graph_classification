package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int j;
		int s;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *b[100],x=0,y=0;
		double[] b = new double[100];
		double x = 0;
		double y = 0;
		double ans;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			b[i] = (double)malloc((Double.SIZE / Byte.SIZE) * 100);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		  for (j = 0;j < a[i];j++)
		  {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(b[i] + j) = Double.parseDouble(tempVar3);
				}
		  }
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < a[i];j++)
			{
				x = x + (*(b[i] + j));
			}
			x = x / a[i];
			for (j = 0;j < a[i];j++)
			{
				y = y + (*(b[i] + j) - x) * (*(b[i] + j) - x);
			}
			y = y / a[i];
			ans = Math.sqrt(y);
			System.out.printf("%.5f\n",ans); //???ans?float?????case??0.00001???????wrongans???????
			x = 0;
			y = 0;
		}
	}

	//??????????????????????????????????passed???????????????????????
}

