package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] b = new int[255];
		int k = 0;
		String a = new String(new char[301]);
		a = new Scanner(System.in).nextLine();
		for (i = 97;i < 123;i++)
		{
			 b[i] = 0;
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
			 if (97 <= a.charAt(i) && 122 >= a.charAt(i))
			 {
				  b[(int)a.charAt(i)]++;
			 }
		}
		for (i = 97;i < 123;i++)
		{
			 if (b[i] != 0)
			 {
				  System.out.printf("%c=%d\n",(char)i,b[i]);
				  k++;
			 }
		}
		if (k == 0)
		{
			 System.out.print("No\n");
		}
		return 0;
	}
}
