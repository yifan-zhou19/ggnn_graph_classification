package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] p = new int[100];
		  int i;
		  int j;
		  int k;
		  int m;
		  int n;
		  int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		  p = (int [100])calloc(100,100 * (Integer.SIZE / Byte.SIZE));
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  for (i = 0;i < m;i++)
		  {
		   for (j = 0;j < n;j++)
		   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   p[i] + j = tempVar3;
		   }
		   }
		  }
		  for (i = 0;i < n;i++)
		  {
			for (k = i;k >= 0;k--)
			{
			if (i - k <= m - 1)
			{
				System.out.printf("%d\n",*(p[i - k] + k));
			}
			flag = i;
			}
		  }
		  if (flag == n - 1)
		  {
		   for (j = 1;j < m;j++)
		   {
			 for (k = j;k < m;k++)
			 {
			   if ((n + j - k - 1) <= (n - 1) && (n + j - k - 1) >= 0)
			   {
				   System.out.printf("%d\n",*(p[k] + n + j - k - 1));
			   }
			 }
		   }
		  }

	}

}

