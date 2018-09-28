package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 float s = 0F;
	 int i = 0;
	 int[] a = new int[n];
	 while (i < n)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  s = s + a[i];
	  i++;
	 }
	 s = s / n;
	 i = 0;
	 float min = s;
	 float max = s;
	 while (i < n)
	 {
	  if (a[i] < min)
	  {
	   min = a[i];
	  }
	  if (a[i] > max)
	  {
	   max = a[i];
	  }
	  i++;
	 }
	 if (max - s > s - min)
	 {
	  System.out.printf("%.0f",max);
	 }
	 else
	 {
	  if (max - s < s - min)
	  {
	   System.out.printf("%.0f",min);
	  }
	  else
	  {
	   System.out.printf("%.0f,%.0f",min,max);
	  }
	 }
	}

}

