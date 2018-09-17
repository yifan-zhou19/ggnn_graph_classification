package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int x;
	 int y;
	 int[] m = new int[11];
	 int[] n = new int[11];
	 int i;
	 int j;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 y = Integer.parseInt(tempVar2);
	 }
	 m[0] = x;
	 n[0] = y;
	 for (i = 1;i < 11;i++)
	 {
		  m[i] = m[i - 1] / 2;
	   n[i] = n[i - 1] / 2;
	 }
	 for (i = 0;i < 11;i++)
	 {
	  for (j = 0;j < 11;j++)
	  {
	   if (m[i] == n[j])
	   {
		   System.out.printf("%d",n[j]);
		j = 11;
		i = 11;
	   }
	  }
	 }
	}

}

