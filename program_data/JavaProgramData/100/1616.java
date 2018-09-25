package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 final String zu = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	 String su = new String(new char[300]);
	 int k;
	 int i;
	 int[] x = new int[52];
	 int y = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 su = tempVar.charAt(0);
	 }
	 for (i = 0;i < 52;i++)
	 {
	 for (k = 0;k < su.length();k++)
	 {
	 if (su.charAt(k) == zu.charAt(i))
	 {
	 x[i]++;
	 }
	 }
	 if (x[i] != 0)
	 {
		System.out.printf("%c=%d\n",zu.charAt(i),x[i]);
		y++;
	 }
	 }
	if (y == 0)
	{
	System.out.print("No");
	}
		return 0;
	}

}

