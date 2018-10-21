package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int t1 = 0;
	  int t2 = 0;
	  int j;
	  float[] m = new float[40];
	  float[] f = new float[40];
	  float l;
	  int[] s = new int[40];
	  final String h = "";
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
			 h = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 l = Float.parseFloat(tempVar3);
		 }
		 if (h.charAt(0) == 'f')
		 {
			 f[t1] = l;
			 t1++;
		 }
		 else
		 {
			 m[t2] = l;
			 t2++;
		 }
	  }
	  for (i = 0;i < t2 - 1;i++)
	  {
		for (j = i;j >= 0;j--)
		{
		   if (m[j] > m[j + 1])
		   {
			   float t = m[j];
			   m[j] = m[j + 1];
			   m[j + 1] = t;
		   }
		}
	  }
	  for (i = 0;i < t1 - 1;i++)
	  {
		for (j = i;j >= 0;j--)
		{
		   if (f[j] < f[j + 1])
		   {
			   float t = f[j];
			   f[j] = f[j + 1];
			   f[j + 1] = t;
		   }
		}
	  }
	  for (i = 0;i < t2;i++)
	  {
		  System.out.printf("%.2f ",m[i]);
	  }
	  for (i = 0;i < t1;i++)
	  {
		  if (i != t1 - 1)
		  {
			  System.out.printf("%.2f ",f[i]);
		  }
		  else
		  {
			  System.out.printf("%.2f",f[i]);
		  }
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	}

}

