package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int m;
	  int[] a = new int[100];
	  int i;
	  int j;
	  float[] nume = new float[100];
	  float[] deno = new float[100];
	  float sum;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= m - 1;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  nume[0] = 2F;
		  deno[0] = 1F;
		  for (j = 1;j <= a[i] - 1;j++)
		  {
			  nume[j] = nume[j - 1] + deno[j - 1];
			  deno[j] = nume[j - 1];
		  }
		  sum = 0F;
		  for (j = 0;j <= a[i] - 1;j++)
		  {
			  sum = sum + nume[j] / deno[j];
		  }
		  System.out.printf("%.3f\n",sum);
	  }
	}

}

