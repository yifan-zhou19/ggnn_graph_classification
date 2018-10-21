public class Student
{
	public String sex = new String(new char[10]);
 public double h;
}

package <missing>;

public class GlobalMembers
{
	public static int Compare1(Object e1, Object e2)
	{
		return ((int)e1 - (int)e2);
	}


	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int l;
		  int q;
		  double a;
		  Student[] num = tangible.Arrays.initializeWithDefaultStudentInstances(50);
		  double[] m = new double[50];
		  double[] f = new double[50];
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
				  num[i].sex = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  num[i].h = Double.parseDouble(tempVar3);
			  }
		  }
		  j = 0;
		  k = 0;
		  for (i = 0;i < n;i++)
		  {

			  if (num[i].sex.charAt(0) == 'm')
			  {
				  m[j] = num[i].h;
				  j++;

			  }
			  else
			  {
				  f[k] = num[i].h;
				  k++;

			  }
		  }
		 for (l = 0;l < j - 1;l++)
		 {
			 for (q = 0;q < j - 1 - l;q++)
			 {
				 if (m[q] - m[q + 1] > 0)
				 {
					 a = m[q];
				 m[q] = m[q + 1];
				 m[q + 1] = a;
				 }
			 }
		 }
		  for (l = 0;l < k - 1;l++)
		  {
			 for (q = 0;q < k - 1 - l;q++)
			 {
				 if (f[q] * 100 - f[q + 1] * 100 < 0)
				 {
					 a = f[q];
				 f[q] = f[q + 1];
				 f[q + 1] = a;
				 }
			 }
		  }


		 for (j = 0;m[j] != 0;j++)
		 {
			 System.out.printf("%.2lf ",m[j]);
		 }
		 for (k = 0;f[k + 1] != 0;k++)
		 {
			 System.out.printf("%.2lf ",f[k]);
		 }
		  System.out.printf("%.2lf",f[k]);

	}

}

