import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[1000]);
	public static int Main(String[] args)
	{
		char current;
		int q = 0;
		str = new Scanner(System.in).nextLine();
		current = str.charAt(0) >= 96?str.charAt(0) - 'a'+'A':str.charAt(0);

		for (int i = 0;i < str.length() + 1;i++)
		{
			if (str.charAt(i) >= 96)
			{
				str.charAt(i) -= 'a'-'A';
			}
			if (str.charAt(i) == current)
			{
				q++;
			}
			else
			{
				System.out.print("(");
				System.out.print(current);
				System.out.print(",");
				System.out.print(q);
				System.out.print(")");
				current = str.charAt(i);
				q = 1;
			}
		}
		return EXIT_SUCCESS;
	}

}
