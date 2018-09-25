package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] zimu = new int[26];
		int i;
		int a;
		int z;
		int t = 0;
		a = 'a';
		z = 'z';
		String str = new String(new char[301]);
		str = new Scanner(System.in).nextLine();
			for (i = 0;i < str.length();i++)
			{
			if ((str.charAt(i) >= a) || (str.charAt(i) <= z))
			{
				zimu[str.charAt(i) - a]++;
			}
			}
			for (i = 0;i < 26;i++)
			{
			   if (zimu[i] > 0)
			   {
				   System.out.printf("%c=%d\n",a + i,zimu[i]);
				   t++;
			   }
			}
			if (t == 0)
			{
				System.out.print("No\n");
			}
		return 0;
	}
}
