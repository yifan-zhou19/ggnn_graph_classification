package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] arr = new int[100];
	 int n = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (int i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  arr[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 int max = -10000;
	 for (int s = 0;s < n;s++)
	 {
	  max = (max >= arr[s])?max:arr[s];
	 }
	 int sm = -10000;
	 for (int j = 0;j < n;j++)
	 {
		  if (arr[j] != max)
		  {
	if (arr[j] > sm)
	{
	sm = arr[j];
	}
		  }
	 }
	 System.out.printf("%d\n",max);
	 System.out.printf("%d",sm);
	 return 0;
	}

}

