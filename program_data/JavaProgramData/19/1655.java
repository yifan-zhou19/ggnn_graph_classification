import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[201]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int S;
		int A;
		int i;
		int j;
		int k = 0;
		int m = 0;
		s = new Scanner(System.in).nextLine();
		S = s.length();
		a = new Scanner(System.in).nextLine();
		A = a.length();
		b = new Scanner(System.in).nextLine();
		while (s.charAt(k) != a.charAt(0))
		{
			System.out.print(s.charAt(k));
			k++;
		}
		for (i = k;i < S;i++)
		{
			if (s.charAt(i) == a.charAt(0))
			{
				for (j = i;j < A + i;j++)
				{
						if (s.charAt(j) == a.charAt(j - i))
						{
							m++;
						}
				}
				if ((i == 0) && (m == A))
				{
					System.out.print(b);
					i = i + A - 1;
				}
				else if ((m == A) && (i != 0) && (s.charAt(i - 1) == 32))
				{
					System.out.print(b);
					i = i + A - 1;
				}
				else
				{
					System.out.print(s.charAt(i));
				}
				m = 0;
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		return 0;
	}
}
