package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int t = 0;
		float s = 0F;
	 int[] m = new int[300];
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
			  m[i] = Integer.parseInt(tempVar2);
		  }
	   s = s + m[i];
	 }
	 float aver;
	 aver = s / n;
	  int k = 0;
	 for (i = 1;i < n;i++)
	 {
	  if (Math.abs(m[k] - aver) < Math.abs(m[i] - aver))
	  {
		 k = i;
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (Math.abs(m[k] - aver) == Math.abs(m[i] - aver))
	  {
			if (t != 0)
			{
		 System.out.print(",");
			}
		 System.out.printf("%d",m[i]);
		 if (t == 0)
		 {
		  t++;
		 }
	  }
	 }
	}
}

