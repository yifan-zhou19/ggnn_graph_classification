package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int N;
	 int m;
	 int[] a = new int[500];
	 int i;
	 int j;
	 int k;
	 int g;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 N = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < N;i++)
	 { //????????for?????
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 for (k = 1;k <= N;k++)
	 { //???????????
	  for (j = 0;j < N - k;j++)
	  {
	   if (a[j + 1] < a[j])
	   {
		m = a[j + 1];
		a[j + 1] = a[j];
		a[j] = m;
	   }
	  }
	 }
	 int num = 0;
	 for (g = 0;g < N;g++)
	 {
	  if (a[g] % 2 != 0)
	  {
		  num++;
	  }
	 }
	i = 0;
	  for (g = 0;g < N;g++)
	  {
		 if (a[g] % 2 != 0)
		 {
			 i++;
			 if (i < num)
			 {
				 System.out.printf("%d,",a[g]);
			 }
			 if (i == num)
			 {
				 System.out.printf("%d",a[g]);
			 }
		 }
	  }
	  return 0;
	}

}

