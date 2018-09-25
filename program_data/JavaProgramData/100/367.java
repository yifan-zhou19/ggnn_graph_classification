package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String s = new String(new char[301]);
	 int[] g = new int[26];
	 int i;
	 int f = 1;
	 for (i = 0;i <= 25;i++)
	 {
	   g[i] = 0;
	 }
	 s = new Scanner(System.in).nextLine();
	 for (i = 0;i <= s.length() - 1;i++)
	 {
	   if ((s.charAt(i) >= 'a') & (s.charAt(i) <= 'z'))
	   {
		 g[s.charAt(i) - 97]++;
	   }
	 }
	 for (i = 0;i <= 25;i++)
	 {
	   if (g[i] != 0)
	   {
		 System.out.printf("%c=%d\n",i + 97,g[i]);
		 f = 0;
	   }
	 }
	 if (f == 1)
	 {
	   System.out.print("No\n");
	 }
	}
}
