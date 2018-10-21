package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		String s1 = new String(new char[10000]);
		String p;
		String p1;
		int[] a = new int[10000];
		int i;
		int n;
		s = new Scanner(System.in).nextLine();
		p = s;
		p1 = s1;
		n = s.length();
		for (i = 0;i < n;i++)
		{
		  a[i] = (p.Substring(i));
		}
		 for (i = 0;i < n - 1;i++)
		 {
			*(p1.Substring(i)) = *(p.Substring(i)) + a[i + 1];
		 }
		 *(p1.Substring(n) - 1) = *(p.Substring(n) - 1) + a[0];
		 for (i = 0;i < n;i++)
		 {
		 System.out.printf("%c",*(p1.Substring(i)));
		 }
		 return 0;
	}


}
