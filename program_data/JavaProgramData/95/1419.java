import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		int a;
		int b;
		int i;
	 s1 = new Scanner(System.in).nextLine();
	 s2 = new Scanner(System.in).nextLine();
	 a = s1.length();
	 b = s2.length();
	 for (i = 0;i < a;i++)
	 {
				if (s1.charAt(i) > 96)
				{
					s1.charAt(i) -= 32;
				}
	   if (s2.charAt(i) > 96)
	   {
		   s2.charAt(i) -= 32;
	   }
	 }
			for (i = 0;i < a;i++)
			{
				if (s1.charAt(i) > s2.charAt(i))
				{
					System.out.print('>');
					return 0;
				}
				if (s1.charAt(i) < s2.charAt(i))
				{
					System.out.print('<');
					return 0;
				}
			}
			System.out.print('=');
		return 0;
	}

}
