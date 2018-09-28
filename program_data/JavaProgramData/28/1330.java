package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int t = 1;
	 int i;
	 int j;
	 int[] a = new int[10000];
	 String c = new String(new char[100000]);
	 c = new Scanner(System.in).nextLine();
	 for (i = 0;c.charAt(i) != ' ' && c.charAt(i) != '\0';i++)
	 {
	 a[0] = i + 1;
	 }
	 for (i = 1;c.charAt(i) != '\0';i++)
	 {
		 if (c.charAt(i - 1) == ' ' && c.charAt(i) != ' ')
		 {
			 for (j = i;c.charAt(j) != ' ' && c.charAt(j) != '\0';j++)
			 {
			 }
		   a[t] = j - i;
		   t++;
		 }
	 }
	 for (i = 0;i < t - 1;i++)
	 {
			System.out.printf("%d,",a[i]);
	 }
	System.out.printf("%d",a[t - 1]);
	}

}
