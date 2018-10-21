package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 String a = new String(new char[110]);
		 int i;
		 int k;
		 int len;
		 int m = 0;
		 int[] b = new int[100];
		 a = new Scanner(System.in).nextLine();
		 len = a.length();
		 for (i = 0;i < len - 1;i++)
		 {
			 if (a.charAt(i) == ' ')
			 {
				 b[m] = i;
				 m++;
			 }
		 }
		 for (k = m - 1;k >= 0;k--)
		 {
			 for (i = b[k] + 1;a.charAt(i) != ' ' && a.charAt(i) != '\0';i++)
			 {
				 System.out.printf("%c",a.charAt(i));
			 }
		 System.out.print(" ");
		 }
		 i = 0;
		 while (a.charAt(i) != ' ' && a.charAt(i) != '\0')
		 {
			 System.out.printf("%c",a.charAt(i));
		   i++;
		 }
	}

}
