package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int max1 = 0;
	 int max2 = 0;
	 int max3 = 0;
	 int t1 = 0;
	 int t2 = 0;
	 int t3 = 0;
	 int[] ID = new int[100000];
	 int[] y = new int[100000];
	 int[] m = new int[100000];
	 int[] s = new int[100000];
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
		  ID[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  y[i] = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  m[i] = Integer.parseInt(tempVar4);
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  s[i] = y[i] + m[i];
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (max1 < s[i])
	  {
	   max1 = s[i];
	   t1 = i;
	  }
	 }
	 s[t1] = 0;
	 for (i = 0;i < n;i++)
	 {
	  if (max2 < s[i])
	  {
	   max2 = s[i];
	   t2 = i;
	  }
	 }
	 s[t2] = 0;
	 for (i = 0;i < n;i++)
	 {
	  if (max3 < s[i])
	  {
	   max3 = s[i];
	   t3 = i;
	  }
	 }
	 System.out.printf("%d %d\n",ID[t1],max1);
	 System.out.printf("%d %d\n",ID[t2],max2);
	 System.out.printf("%d %d\n",ID[t3],max3);
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

