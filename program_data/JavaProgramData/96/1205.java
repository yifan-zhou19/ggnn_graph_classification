package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String N = new String(new char[100]);
		 int[] sh = new int[100];
		 int i;
		 N = new Scanner(System.in).nextLine();
		 int n = N.length();
		 int y = N.charAt(0) - '0';
		 for (i = 1;i < n;i++)
		 {
			 sh[i] = (y * 10 + N.charAt(i) - '0') / 13;
			 y = (y * 10 + N.charAt(i) - '0') % 13;
		 }
		 if (sh[1] == 0 && sh[2] == 0)
		 {
			 System.out.print("0");
		 }
		 else
		 {
			 int j = 1;
			 if (sh[j] == 0)
			 {
				 j++;
			 }
			 for (;j < n;j++)
			 {
				 System.out.printf("%d",sh[j]);
			 }
		 }
		 System.out.printf("\n%d\n",y);
	}

}
