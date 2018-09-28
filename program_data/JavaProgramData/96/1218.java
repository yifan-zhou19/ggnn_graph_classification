package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int len;
	   int i;
	   int j;
	   int[] a = new int[100];
	   int[] b = new int[100];
	   String c = new String(new char[100]);
	   c = new Scanner(System.in).nextLine();
	   len = c.length();
	   for (i = 0;i < len;i++)
	   {
		 a[i] = c.charAt(i) - '0';
	   }
	   if (len == 1)
	   {
		  System.out.printf("0\n%d",a[0]);
	   }
	   if (len == 2 && (a[0] * 10 + a[1]) < 13)
	   {
		 System.out.printf("0\n%d",a[0] * 10 + a[1]);
	   }
	   for (i = 1;i < len;i++)
	   {
		  b[i] = (a[i - 1] * 10 + a[i]) / 13;
		  a[i] = (a[i - 1] * 10 + a[i]) % 13;
	   }
	   for (i = 1;i < len;i++)
	   {
		   if (i == 1 && b[i] == 0)
		   {
			 continue;
		   }
		   else
		   {
			 System.out.printf("%d",b[i]);
		   }
		   if (i == len - 1)
		   {
			 System.out.printf("\n%d",a[len - 1]);
		   }
	   }
	}
}
