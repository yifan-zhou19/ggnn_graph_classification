package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] c = new int[300];
	 for (i = 0;i < n;i++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 c[i] = Integer.parseInt(tempVar2);
	 }
	 }
	 int m = 0;
	 for (i = 0;i < n;i++)
	 {
		 for (j = 0;j <= i;j++)
		 {
	   if (c[j] == c[i])
	   {
		 break;
	   }
		 }
	  if (j == i)
	  {
		   if (m != 0)
		   {
		System.out.printf(",%d",c[i]);
		   }
		else
		{
			System.out.printf("%d",c[i]);
			  m++;
		}
	  }
	 }
	}
}

