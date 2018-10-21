package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	 int i;
	 int n;
	 int count1;
	 int count2;
	 int count3;
	 int count4;
	 int[] a = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(a,0,(Integer.SIZE / Byte.SIZE));
	 i = count1 = count2 = count3 = count4 = 0;
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
			 a[i] = Integer.parseInt(tempVar2);
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (1 <= a[i] != 0 && a[i] <= 18)
		 {
		   count1++;
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (19 <= a[i] != 0 && a[i] <= 35)
		 {
		   count2++;
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (36 <= a[i] != 0 && a[i] <= 60)
		 {
		   count3++;
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (a[i] > 60)
		 {
		   count4++;
		 }
	 }
	 System.out.printf("1-18: %.2f%%\n",(double)count1 / n * 100);
	System.out.printf("19-35: %.2f%%\n",(double)count2 / n * 100);
	System.out.printf("36-60: %.2f%%\n",(double)count3 / n * 100);
	System.out.printf("60??: %.2f%%\n",(double)count4 / n * 100);

	}


}

