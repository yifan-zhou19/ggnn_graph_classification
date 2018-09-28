package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int[] a = new int[3];
	 int i = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 if (n % 3 == 0)
	 {
	 a[i++] = 3;
	 }
	 if (n % 5 == 0)
	 {
	 a[i++] = 5;
	 }
	 if (n % 7 == 0)
	 {
	 a[i++] = 7;
	 }
	 switch (i)
	 {
	 case 3:
		 System.out.printf("%d %d %d",a[0],a[1],a[2]);
		 break;
	 case 2:
		 System.out.printf("%d %d",a[0],a[1]);
		 break;
	 case 1:
		 System.out.printf("%d",a[0]);
		 break;
	 case 0:
		 System.out.printf("%c",'n');
		 break;
	 }
	}

}

