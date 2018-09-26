package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int i;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static void scanfing()
	{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n1 = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 n2 = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[0] = Integer.parseInt(tempVar3);
		 }
		 for (i = 1;i < n1;i++)
		 {
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 a[i] = Integer.parseInt(tempVar4);
			 }
		 }
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 b[0] = Integer.parseInt(tempVar5);
		 }
		 for (i = 1;i < n2;i++)
		 {
			 String tempVar6 = ConsoleInput.scanfRead(" ");
			 if (tempVar6 != null)
			 {
				 b[i] = Integer.parseInt(tempVar6);
			 }
		 }
	}
	public static int compare(Object elem1, Object elem2)
	{
		return ((int)elem1 - (int)elem2);
	}
	public static void qsorting()
	{
		 qsort(a,n1,(Integer.SIZE / Byte.SIZE),compare);
		 qsort(b,n2,(Integer.SIZE / Byte.SIZE),compare);
	}
	public static void together()
	{
		 for (i = 0;i < n1;i++)
		 {
			 c[i] = a[i];
		 }
		 for (i = 0;i < n2;i++)
		 {
			 c[i + n1] = b[i];
		 }
	}
	public static void printfing()
	{
		 System.out.printf("%d",c[0]);
		 for (i = 1;i < n1 + n2;i++)
		 {
		 System.out.printf(" %d",c[i]);
		 }
	}
	public static int Main()
	{
		scanfing();
		qsorting();
		together();
		printfing();
	}
}

