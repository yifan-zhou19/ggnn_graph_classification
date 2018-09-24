import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[500]);
	public static void huiwen(int n,int l)
	{
			int k;
			int i;
			int j;
			int e;
			int sum = 0;
			for (k = 0;k < l - n + 1;k++)
			{
				e = k + n - 1;
				for (j = k;j < n / 2 + k;j++,e--)
				{
					if (s.charAt(j) == s.charAt(e))
					{
						sum++;
					}
					if (s.charAt(j) != s.charAt(e))
					{
						sum = 0;
						break;
					}
					if (sum == n / 2)
					{
						for (i = k;i < n + k;i++)
						{
							System.out.print(s.charAt(i));
						}
						System.out.print("\n");
						sum = 0;
					}
				}
			}
	}
	public static int Main()
	{
		 int m;
		 int l;
		 s = new Scanner(System.in).nextLine();
		 l = s.length();
		 for (m = 2;m < l;m++)
		 {
			 huiwen(m, l);
		 }
		 return 0;
	}
}
