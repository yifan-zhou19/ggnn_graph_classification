public class node
{
 public int a;
 public int b;
 public int c;
 public int[] arr = new int[11];
}

package <missing>;

public class GlobalMembers
{
	public static double[][] num = new double[46][8];
	 public static node[] arr = tangible.Arrays.initializeWithDefaultnodeInstances(11);
	public static int Main()
	{
		int i;
		int n;
		int j;
		int m;
		node[] arr = tangible.Arrays.initializeWithDefaultnodeInstances(11);
	 while (scanf("%d", n) != EOF)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(num,0,(Double.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	  memset(arr,0,sizeof(arr));
	  for (i = 0;i < n;i++)
	  {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   arr[i].a = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   arr[i].b = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   arr[i].c = Integer.parseInt(tempVar3);
	   }
	  }
	  int h = 0;
	  int k = 0;
	  for (i = 0;i < n - 1;i++)
	  {
	   for (j = i + 1;j < n;j++)
	   {
		double aa;
		double bb;
		double cc;
		double dd;
		aa = Math.pow((double)(arr[i].a - arr[j].a),(int) 2);
		bb = Math.pow((double)(arr[i].b - arr[j].b),(int) 2);
		cc = Math.pow((double)(arr[i].c - arr[j].c),(int) 2);
		dd = Math.sqrt((double)(aa + bb + cc));
		num[h][0] = arr[i].a;
		num[h][1] = arr[i].b;
		num[h][2] = arr[i].c;
		num[h][3] = arr[j].a;
		num[h][4] = arr[j].b;
		num[h][5] = arr[j].c;
		num[h][6] = dd;
		num[h][7] = k;
		k++;
		h++;
	   }
	  }
		for (i = 0;i < h - 1;i++)
		{
		for (j = i + 1;j < h;j++)
		{
		 if (num[i][6] <= num[j][6])
		 {
		  double d1 = 0;
		  for (m = 0;m <= 6;m++)
		  {
		   d1 = num[i][m];
		   num[i][m] = num[j][m];
		   num[j][m] = d1;
		  }
		 }
		}
		}
		 for (i = 0;i < h - 1;i++)
		 {
		  for (j = i + 1;j < h;j++)
		  {
		   if (num[i][6] == num[j][6])
		   {
			if (num[i][7] < num[j][7])
			{
			 double d1 = 0;
			 for (m = 0;m <= 7;m++)
			 {

			  d1 = num[i][m];
			  num[i][m] = num[j][m];
			  num[j][m] = d1;
			 }
			}
		   }
		  }
		 }
		   for (i = 0;i < h;i++)
		   {
			System.out.printf("(%.f,%.f,%.f)-(%.f,%.f,%.f)=%.2f\n",num[i][0],num[i][1],num[i][2],num[i][3], num[i][4],num[i][5],num[i][6]);
		   }
	 }
	 return 0;
	}
}

