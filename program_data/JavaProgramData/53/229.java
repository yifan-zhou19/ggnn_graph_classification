package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[300];
	 int[] b = new int[100];
	 int n;
	 int m;
	 int p;
	 int s;
	 int t;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (m = 0;m < n;m++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[m] = Integer.parseInt(tempVar2);
		 }
	 }
	 m = 0;
	 p = 0;
	 do
	 {
		 b[p] = a[m];
		 if (m != 0)
		 {
			 System.out.print(",");
		 }
		 System.out.printf("%d",b[p]);
		 s = m + 1;
		 while (s < n)
		 {
			 if (b[p] == a[s])
			 {
				 a[s] = 0;
			 }
			 else
			 {
				 ;
			 }
			 s = s + 1;
		 }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	lable:
	m = m + 1;
		 if ((a[m] == b[p]) || (a[m] == 0))
		 {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			 goto lable;
		 }
		 else
		 {
			 ;
		 }
		 p = p + 1;
	 } while (m < n);
	}
}

