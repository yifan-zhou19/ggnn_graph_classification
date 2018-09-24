package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int num;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 num = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[num];
	 int[] flag = new int[num];
	 for (int i = 0; i < num; i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  flag[i] = 1;
	 }
	 for (int i = 0; i < num; i++)
	 {
	  for (int j = 0; j < i; j++)
	  {
	   if (a[j] >= a[i])
	   {
		flag[i] = flag[j] + 1 > flag[i] != 0 ? flag[j] + 1 : flag[i];
	   }
	  }
	 }
	 int max = flag[0];
	 for (int i = 1; i < num; i++)
	 {
	  if (flag[i] > max)
	  {
	   max = flag[i];
	  }
	 }
	 System.out.printf("%d\n",max);
	 return 0;
	}
}

