package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int max;
	 int cmax;
	 int i;
	 int[] num = new int[n];
	 max = 0;
	 cmax = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < a;i++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 num[i] = Integer.parseInt(tempVar2);
	 }
	 }
	 for (i = 0;i < a;i++)
	 {
	 if (num[i] > max)
	 {
	  max = num[i];
	 }
	 }
	 for (i = 0;i < a;i++)
	 {
	 if (num[i] > cmax && num[i] < max)
	 {
	  cmax = num[i];
	 }
	 }

	 System.out.printf("%d\n%d\n",max,cmax);

	return 0;
	}
}

