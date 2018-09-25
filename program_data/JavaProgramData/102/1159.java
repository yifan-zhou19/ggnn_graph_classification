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
	 double[] shengao = new double[40];
	 char[][] xingbie = new char[40][10];
	 double[] nansheng = new double[40];
	 double[] nvsheng = new double[40];
	 int m = 0;
	 int f = 0;
	 int i;
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  xingbie[i] = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  shengao[i] = Double.parseDouble(tempVar3);
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (strcmp(xingbie[i],"male") == 0)
	  {
	   nansheng[m] = shengao[i];
	   m++;
	  }
	  else if (strcmp(xingbie[i],"female") == 0)
	  {
	   nvsheng[f] = shengao[i];
	   f++;
	  }
	 }
	 int j;
	 double t;
	 for (j = 1;j < m;j++)
	 {
	  for (i = 0;i < m - j;i++)
	  {
	   if (nansheng[i] > nansheng[i + 1])
	   {
		t = nansheng[i];
		nansheng[i] = nansheng[i + 1];
		nansheng[i + 1] = t;
	   }
	  }
	 }
	 double r;
	 for (j = 1;j < f;j++)
	 {
	  for (i = 0;i < f - j;i++)
	  {
	   if (nvsheng[i] < nvsheng[i + 1])
	   {
		r = nvsheng[i];
		nvsheng[i] = nvsheng[i + 1];
		nvsheng[i + 1] = r;
	   }
	  }
	 }
	 for (i = 0;i < m;i++)
	 {
	  System.out.printf("%.2lf ",nansheng[i]);
	 }
	 for (i = 0;i < f;i++)
	 {
	  if (i < f - 1)
	  {
	System.out.printf("%.2lf ",nvsheng[i]);
	  }
	else if (i == f - 1)
	{
	System.out.printf("%.2lf",nvsheng[i]);
	}
	 }
	 return 0;
	}
}

