import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int sum;
	public static void change(int t, String s, char a, char b)
	{
		if (sum == 0)
		{
			return;
		}
		int i;
		int j;
		for (i = 0;i < t;i++)
		{
			if (s[i].equals(a))
			{
				for (j = i + 1;s[j].equals('0') && j < t;j++)
				{
					;
				}
				if (s[j].equals(b))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
					sum = sum - 2;
					s[i] = s[j] = '0';
					change(t, s, a, b);


				}
			}
		}
	}


	public static int Main()
	{
		String s = new String(new char[105]);
		char a;
		char b;
		s = new Scanner(System.in).nextLine();
		int l = s.length();
		sum = l;
		a = s.charAt(0);
		for (int i = 1;i < l;i++)
		{
			if (s.charAt(i) != s.charAt(0))
			{
				b = s.charAt(i);
			}
		}
		change(l, s, a, b);

		return 0;
	}
}
