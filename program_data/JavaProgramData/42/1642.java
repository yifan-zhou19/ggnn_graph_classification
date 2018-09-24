package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int d;
	 int k;
	 int[] p;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 p = new int[k];
	 for (i = 0;i < k;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   p[i] = Integer.parseInt(tempVar2);
	   }
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 d = Integer.parseInt(tempVar3);
	 }
	 for (i = 0;i < k;i++)
	 {
		if (p[i] == d)
		{
		  for (j = i;j < k - 1;j++)
		  {
			 p[j] = p[j + 1];
		  }
		  k--;
		  i--;
		}
	 }
	 int y = 0;
	 for (i = 0;i < k;i++)
	 {
	   if (y != 0)
	   {
		 System.out.print(" ");
	   }
	   System.out.printf("%d",p[i]);
	   y = 1;
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	 free(p);
	}
}

