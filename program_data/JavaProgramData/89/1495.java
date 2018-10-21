package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int a;
		  int b;
		  int m = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[][] p = new int[n];
		  for (i = 0;i < n;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p[i] = (int)malloc(2 * (Integer.SIZE / Byte.SIZE));
		  }
		  for (i = 0;i < n;i++)
		  {
		  for (j = 0;j < 2;j++)
		  {
		  p[i][j] = 0;
		  }
		  }
		  for (k = 0;;k++)
		  {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead(" ");
				 if (tempVar3 != null)
				 {
					 b = Integer.parseInt(tempVar3);
				 }
				 if (a == 0 && b == 0)
				 {
				 break;
				 }
				 p[a][0]++;
				 p[b][1]++;
		  }
		  for (i = 0;i < n;i++)
		  {
		  if (p[i][0] == 0 && p[i][1] == n - 1)
		  {
				   System.out.printf("%d",i);
				   m++;
		  }
		  }
		  if (m == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
		  for (i = 0;i < n;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p[i]);
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p);
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

