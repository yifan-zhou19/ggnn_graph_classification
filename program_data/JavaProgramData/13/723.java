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
	 int[] p;
	 p = new int[n];
	 int i;
	 int j;
	 for (i = 0;i < n;i++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 p[i] = Integer.parseInt(tempVar2);
	 }
	 }
	 System.out.printf("%d",p[0]);
	 for (i = 1;i < n;i++)
	 {
	  for (j = 0;j < i;j++)
	  {
	   if (p[i] == p[j])
	   {
	   break;
	   }
	  }
	  if (j == i)
	  {
	  System.out.printf(" %d",p[i]);
	  }
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 System.in.read();
	}

}

