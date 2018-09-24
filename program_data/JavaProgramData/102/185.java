package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		 int a;
		 int i;
		 int j = 0;
		 int k = 0;
		 int l;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 char[][] b = new char[40][6];
		 float[] c = new float[40];
		 float[] m = new float[40];
		 float[] f = new float[40];
		 float temp;
		 for (i = 0;i < 40;i++)
		 {
		   f[i] = 0F;
		   m[i] = 0F;
		 }
		 for (i = 0;i < a;i++)
		 {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   b[i] = tempVar2.charAt(0);
			   }
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Float.parseFloat(tempVar3);
			}
		 }

		 for (i = 0;i < a;i++)
		 {
		   if (b[i][0] == 'm')
		   {
			   m[j] = c[i];
		   j++;
		   }
		   else
		   {
		   if (b[i][0] = 'f')
		   {
			   f[k] = c[i];
		   k++;
		   }
		   }
		 }
		 for (j = 0;j < a;j++)
		 {
		 if (m[j] == 0F)
		 {
		 break;
		 }
		 }
		 for (i = 0;i < j - 1;i++)
		 {
			 for (l = i + 1;l < j;l++)
			 {


		 if (m[l] < m[i])
		 {
			 temp = m[i];
		 m[i] = m[l];
		 m[l] = temp;
		 }
			 }
		 }

		 for (k = 0;k < a;k++)
		 {
		 if (f[k] == 0F)
		 {
		 break;
		 }
		 }
		 for (i = 0;i < k - 1;i++)
		 {


		 for (l = i + 1;l < k;l++)
		 {


		 if (f[l] > f[i])
		 {
			 temp = f[i];
		 f[i] = f[l];
		 f[l] = temp;
		 }
		 }
		 }


		 for (i = 0;i < j;i++)
		 {

		 System.out.printf("%.2f ",m[i]);
		 }
		 for (i = 0;i < k - 1;i++)
		 {
		 System.out.printf("%.2f ",f[i]);
		 }
		 System.out.printf("%.2f\n",f[i]);
		return 0;
	}

}

