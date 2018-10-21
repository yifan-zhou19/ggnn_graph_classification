package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String str = new String(new char[305]);
	 int n;
	 int i;
	 int m;
	 int[] N = new int[26];
	 int p = 0;
	 str = new Scanner(System.in).nextLine();
	 n = str.length();
	 for (i = 0;i < n;i++)
	 {
		if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
		{
		  m = str.charAt(i) - 'a';
		  N[m]++;
		  p++;
		}
		else
		{
			continue;
		}
	 }
	 if (p == 0)
	 {
		 System.out.print("No");
	 }
	else
	{
	 for (m = 0;m < 26;m++)
	 {
	 if (N[m] != 0)
	 {
		 System.out.printf("%c=%d\n",m + 'a',N[m]);
	 }
	 }
	}
	}

}
