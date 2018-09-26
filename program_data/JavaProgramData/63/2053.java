package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int q;
		  int n;

		  //input matrix a
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  q = Integer.parseInt(tempVar2);
		  }

		  int[][] a;
		  a = new int[m];
		  for (int i = 0;i < m;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  a[i] = (int)malloc(q * (Integer.SIZE / Byte.SIZE));
		  }

		  for (int i = 0;i < m;i++)
		  {
		  for (int j = 0;j < q;j++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar3);
		  }
		  }
		  }

		  //input matrix b
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  q = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  n = Integer.parseInt(tempVar5);
		  }

		  int[][] b;
		  b = new int[q];
		  for (int i = 0;i < q;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  b[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		  }

		  for (int i = 0;i < q;i++)
		  {
		  for (int j = 0;j < n;j++)
		  {
		  String tempVar6 = ConsoleInput.scanfRead();
		  if (tempVar6 != null)
		  {
			  b[i][j] = Integer.parseInt(tempVar6);
		  }
		  }
		  }

		  //deifne matrix c
		  int[][] c;
		  c = new int[m];
		  for (int i = 0;i < m;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  c[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		  }

		  //start multimatrix
		  /*for (int i=0;i<m;i++)
		  for (int j=0;j<n;j++)
		  {
		      int s=0;
		      for (int w=0;w<q;w++)
		      s=s+a[i][w]*b[w][j];
		      c[i][j]=s;
		  }
		  */
		  for (int i = 0;i < m;i++)
		  {
			 for (int j = 0;j < n;j++)
			 {
				for (int k = 0;k < q;k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			 }
		  }
		  //output
		  /*for (int i=0;i<m;i++)
		  for (int j=0;j<n;j++)
		  {
		      if (j==0)
		      printf("%d",c[i][j]);
		      else if (j==n-1)
		      printf(" %d\n",c[i][j]);
		      else
		      printf(" %d",c[i][j]);
		  }
		  */
		  int i;
		  int j;
		  for (i = 0;i < m;i++)
		  {
			 for (j = 0;j < n - 1;j++)
			 {
				 System.out.printf("%d ",c[i][j]);
			 }
			 System.out.printf("%d\n",c[i][j]);
		  }

	}
}

