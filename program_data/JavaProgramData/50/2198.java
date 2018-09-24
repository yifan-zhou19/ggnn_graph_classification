package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int w;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  w = Integer.parseInt(tempVar);
	  }
	  int[] num = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  int[] tian = {13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13};
	  for (i = 0;i < 12;i++)
	  {
		   for (j = 0;j < i;j++)
		   {
			   tian[i] = tian[i] + num[j];
		   }
	  }
	 int[] xingqi = new int[12];
	 for (i = 0;i < 12;i++)
	 {
		 xingqi[i] = (tian[i] % 7 + w - 1) % 7;
	 }
	 for (i = 0;i < 12;i++)
	 {
		 if (xingqi[i] == 5)
		 {
		 System.out.printf("%d\n",i + 1);
		 }
	 }

	  return 0;
	}
}

