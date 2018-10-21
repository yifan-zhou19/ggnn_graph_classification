package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 float[] a = new float[(n + 1)];
		 float[] b = new float[(n + 1)];
		 a[0] = b[0] = 0F;
		 float length = 0F;
		 for (int i = 1;i <= n;i++)
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
		 for (int i = 1;i <= n;i++)
		 {
		 for (int j = i + 1;j <= n;j++)
		 {
			 float temp = 0F;
		  float temp1 = a[i] - a[j];
		  float temp2 = b[i] - b[j];
		  temp = Math.sqrt(temp1 * temp1 + temp2 * temp2);
		  if (temp > length)
		  {
		  length = temp;
		  }
		 }
		 }
		 System.out.printf("%.4f",length);




	}
}

