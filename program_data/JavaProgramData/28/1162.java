package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int p = 0;
		char[][] a = new char[300][50];
		String c = new String(new char[15000]);

		int[] b = new int[300];
		c = new Scanner(System.in).nextLine();
	   for (i = 0;i < 15000;i++)
	   {
		   if (c.charAt(i) != 32 && c.charAt(i) != 0)
		   {
			   a[j][k] = c.charAt(i);
			   k++;
		   }
		   else
		   {
		   if (c.charAt(i) == 32)
		   {
			   if (c.charAt(i + 1) == 32)
			   {
			   continue;
			   }
			   else
			   {
			   j++;
			   }
		   k = 0;
		   p = p + 1;
		   }
		   else
		   {
		   break;
		   }
		   }
	   }
	   for (i = 0;i <= p;i++)
	   {
		b[i] = String.valueOf(a[i]).length();
	   }

		 for (i = 0;i <= p - 1;i++)
		 {
		 System.out.printf("%d,",b[i]);
		 }
		 System.out.printf("%d",b[p]);
	}
}
