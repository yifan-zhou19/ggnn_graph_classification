package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int flag = 0;
	 String x = new String(new char[500]);
	 int[] y = new int[300];
	 x = new Scanner(System.in).nextLine();
	 for (i = 0;i < x.length();i++)
	 {
		 if ((x.charAt(i) > 64 && x.charAt(i) < 91) || (x.charAt(i)>96 && x.charAt(i) < 123))
		 {
	  y[(int)x.charAt(i)]++;
		 }
	 }
	 for (i = 65;i <= 90;i++)
	 {
		 if (y[i] == 0)
		 {
		continue;
		 }
	  System.out.printf("%c=%d\n",i,y[i]);
	  flag++;
	 }
	 for (i = 95;i <= 122;i++)
	 {
		 if (y[i] == 0)
		 {
		continue;
		 }
	  System.out.printf("%c=%d\n",i,y[i]);
	  flag++;
	 }
	 if (flag == 0)
	 {
		 System.out.print("No");
	 }
	}
}
