package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[1000];
	 int b;
	 int c;
	 int d;
	 int i;
	 int n;
	 int j;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < n;i++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 a[i] = Integer.parseInt(tempVar3);
	 }
	 }
	 for (i = 0;i < n;i++)
	 {
	 for (j = 0;j < n;j++)
	 {
	 if (a[i] + a[j] == k)
	 {
	  System.out.print("yes\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 goto loop;
	 }
	 }
	 }
	 System.out.print("no\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	 b = 0;
	}
}

