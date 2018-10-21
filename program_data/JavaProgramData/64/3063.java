package <missing>;

public class GlobalMembers
{
	public static float dis(int[] a, int[] b)
	{
	float d = 0F;
	for (int i = 0;i < 3;i++)
	{
	   d += (a[i] - b[i]) * (a[i] - b[i]);
	}
	d = Math.pow(d,0.5);
	return d;
	}

	public static int Main()
	{
	int n;
	int x = 0;
	int y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[][] a = new int[n][3];
	y = n * (n - 1) / 2;
	float[][] b = new float[y][3];
	float[] m = new float[3];
	for (int i = 0;i < n;i++)
	{
	   for (int j = 0;j < 3;j++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar2);
		  }
	   }
	}
	for (int i = 0;i < n - 1;i++)
	{
	   for (int j = i + 1;j < n;j++)
	   {
		  b[x][0] = i;
		  b[x][1] = j;
		  b[x][2] = dis(a[i], a[j]);
		  x++;
	   }
	}
	for (int j = y - 2;j >= 0;j--)
	{
	   for (int i = 0;i <= j;i++)
	   {
		  if (b[i][2] < b[i + 1][2])
		  {
		  for (int k = 0;k < 3;k++)
		  {
			 m[k] = b[i][k];
			 b[i][k] = b[i + 1][k];
			 b[i + 1][k] = m[k];
		  }
		  }
	   }
	}
	for (int i = 0;i < y;i++)
	{
	   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[(int)b[i][0]][0],a[(int)b[i][0]][1],a[(int)b[i][0]][2],a[(int)b[i][1]][0],a[(int)b[i][1]][1],a[(int)b[i][1]][2],b[i][2]);
	}
	}

}

