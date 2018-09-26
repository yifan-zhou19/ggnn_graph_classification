package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int w;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 w = Integer.parseInt(tempVar);
	 }
	 int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 int[] b = new int[12]; // ???13??1.1??????????
	 int i;
	 int j;
	  b[0] = 12;
	 for (i = 1;i < 12;i++)
	 {
		   b[i] = 0;
		 for (j = 0;j < i;j++)
		 {
		  b[i] = b[i] + a[j];
		 }
		  b[i] = b[i] + 12;
	 }
	 for (i = 0;i < 12;i++)
	 {
		 int y;
		 y = b[i] % 7;
		 if ((y + w) % 7 == 5)
		 {
		 System.out.printf("%d\n",i + 1);
		 }
	 }
	}

}

