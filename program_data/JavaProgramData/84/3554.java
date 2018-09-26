package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] arr = new int[100];
	 int n;
	 int i;
	 int s;
	 int j;
	n = 0;
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
		  arr[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 int max = -10000;
	 for (s = 0;s < n;s++)
	 {
	  max = (max >= arr[s])?max:arr[s];
	 }
	 int secondMax = 0;
	 for (j = 0;j < n;j++)
	 {
	  secondMax = (secondMax >= arr[j] != 0 || arr[j] == max)?secondMax:arr[j];
	 }
	 System.out.printf("%d\n",max);
	 System.out.printf("%d",secondMax);
	 return 0;
	}
}

