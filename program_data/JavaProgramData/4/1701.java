package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int r;
		int c;
		int i;
		int j;
		int k;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int [100])malloc(100 * 100 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i] + j = tempVar3;
			  }
			}
		}


		  for (k = 0;k <= c - 1;k++)
		  {
			 i = 0;
			 j = k;
			 while (j >= 0 && i <= r - 1)
			 {
				 System.out.printf("%d\n",*(a[i] + j));
				 i++;
				 j--;
			 }
		  }
		  for (k = 1;k <= r - 1;k++)
		  {
			  j = c - 1;
			  i = k;
			  while (j >= 0 && i <= r - 1)
			  {
				 System.out.printf("%d\n",*(a[i] + j));
				 i++;
				 j--;
			  }
		  }


	}
}

