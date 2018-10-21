package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int k;
		  int i = 0;
		  int j = 0;
		  int countm = 0;
		  int countf = 0;
		  int I;
		  int J;
		  final String sex = "";
		  float[] h = new float[50];
		  float[] m = new float[50];
		  float[] f = new float[50];
		  float temp;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (k = 0;k < n;k++)
		  {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sex = tangible.StringFunctions.changeCharacter(sex, k, tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					h[k] = Float.parseFloat(tempVar3);
				}
		  }
		  for (k = 0;k < n;k++)
		  {
				if (sex.charAt(k)[0] == 'm')
				{
						m[i] = h[k];
						i++;
						countm++;
				}
				else
				{
						f[j] = h[k];
						j++;
						countf++;
				}
		  }
		  for (i = countm - 1;i > 0;i--)
		  {
				 for (I = 0;I < i;I++)
				 {
						   if (m[I] > m[I + 1])
						   {
							   temp = m[I + 1];
							   m[I + 1] = m[I];
							   m[I] = temp;
						   }
				 }
		  }
		  for (j = countf - 1;j > 0;j--)
		  {
				 for (J = 0;J < j;J++)
				 {
						  if (f[J] > f[J + 1])
						  {
							   temp = f[J + 1];
							   f[J + 1] = f[J];
							   f[J] = temp;
						  }
				 }
		  }
		  for (i = 0;i < countm;i++)
		  {
		  System.out.printf("%.2f ",m[i]);
		  }
		  for (j = countf - 1;j > 0;j--)
		  {
		  System.out.printf("%.2f ",f[j]);
		  }
		  System.out.printf("%.2f",f[0]);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

