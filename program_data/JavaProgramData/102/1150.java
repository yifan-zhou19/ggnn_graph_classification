package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int x = 0;
	 int y = 0;
	 int i;
	 int j;
	 int n;
	 double t;
	 double e;
	 double[] h = new double[45];
	 double[] girl = new double[45];
	 double[] boy = new double[45];
	 String sex = new String(new char[10]);
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
		   sex = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   (h[i]) = Double.parseDouble(tempVar3);
	   }
	   //printf("%c",sex[0]);
	   if (sex.charAt(0) == 'f')
	   {
		   girl[x] = h[i];
		   x++;
	   }
	   else
	   {
		   boy[y] = h[i];
		   y++;
	   }
	 }
	 for (i = x;i > 0;i--)
	 {
		 for (j = 0;j < i - 1;j++)
		 {
			 if (girl[j] < girl[j + 1])
			 {
			   t = girl[j];
			   girl[j] = girl[j + 1];
			   girl[j + 1] = t;
			 }
		 }
	 }
	 for (i = y;i > 0;i--)
	 {
		 for (j = 0;j < i - 1;j++)
		 {
			 if (boy[j] > boy[j + 1])
			 {
			   t = boy[j];
			   boy[j] = boy[j + 1];
			   boy[j + 1] = t;
			 }
		 }
	 }
	 for (i = 0;i < y;i++)
	 {
		 System.out.printf("%.2lf ",boy[i]);
	 }
	 for (j = 0;j < x - 1;j++)
	 {
		 System.out.printf("%.2lf ",girl[j]);
	 }
	 System.out.printf("%.2lf",girl[x - 1]);
	 return 0;
	}
}

