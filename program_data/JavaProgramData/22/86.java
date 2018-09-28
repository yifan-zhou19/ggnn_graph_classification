package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[300];
	 int i;
	 int j;
	 int k;
	 int l;
	 int num = 0;
	 int c;
	 int d;
	 int m;
	 for (m = 0;m < 300;m++)
	 {
	  a[m] = 0;
	 }
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[0] = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i < 300;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead(",");
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 for (j = 0;j < 300;j++)
	 {
	  if (a[j] != 0 || a[j + 1] != 0)
	  {
	   num++;
	  }
	 }
	 if (num == 1)
	 {
	  System.out.printf("%s","No");
	 }
	 for (k = 0;k < num - 1;k++)
	 {
	   for (l = 0;l < num - 1 - k;l++)
	   {
		 if (a[l] > a[l + 1])
		 {
			c = a[l];
			a[l] = a[l + 1];
			a[l + 1] = c;
		 }
	   }
	 }
	 if (a[0] == a[num - 1] && num != 1)
	 {
	  System.out.printf("%s","No");
	 }
	 else
	 {
	   for (d = num - 2;d >= 0;d--)
	   {
		 if (a[d] < a[num - 1])
		 {
		   System.out.printf("%d",a[d]);
		   break;
		 }
	   }
	 }
	}

}

