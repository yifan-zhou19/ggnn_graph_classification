import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		char t;
		int i;
		int count = 0;
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		for (i = 0; i < len; i++)
		{
			if (str.charAt(i) >= 97)
			{
				str.charAt(i) -= 32;
			}
		}
		t = str.charAt(0);
		i = 0;
		while (i < len)
		{
			if (t == str.charAt(i))
			{
				count++;
			}
			else
			{
				System.out.print("(");
				System.out.print(t);
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				count = 1;
				t = str.charAt(i);
			}
			i++;
		}
		System.out.print("(");
		System.out.print(t);
		System.out.print(",");
		System.out.print(count);
		System.out.print(")");
		System.out.print("\n");
		return 0;
	}
}
