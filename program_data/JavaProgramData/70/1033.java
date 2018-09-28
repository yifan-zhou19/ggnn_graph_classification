package <missing>;

public class GlobalMembers
{
	public static double dis(float a,float b,float c,float d)
	{
		   return (double)Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  float[] a = new float[1000];
		  float[] b = new float[1000];
		  float max = 0.0F;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Float.parseFloat(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Float.parseFloat(tempVar3);
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
		  for (j = 0;j < n;j++)
		  {
			max = dis(a[i], b[i], a[j], b[j]) > max != 0?dis(a[i], b[i], a[j], b[j]):max;
		  }
		  }
		  System.out.printf("%.4f\n",max);
		  System.in.read();
		  System.in.read();
	}

}

