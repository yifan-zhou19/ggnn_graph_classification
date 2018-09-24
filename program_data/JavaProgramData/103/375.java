import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int t = 1;
		int i = 0;
		int n;
		int k;
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		for (i = 1;a.charAt(i - 1) != '\0';i++)
		{
			if (a.charAt(i - 1) == a.charAt(i) || a.charAt(i - 1) - a.charAt(i) == 32 || a.charAt(i - 1) - a.charAt(i) == -32)
			{
				t++;
			}
			else
			{
				System.out.print("(");
				System.out.print(((int)a.charAt(i - 1) < 97?a.charAt(i - 1):(char)(a.charAt(i - 1) - 32)));
				System.out.print(",");
				System.out.print(t);
				System.out.print(")");
				t = 1;
			}


		}

		 return 0;
	}

}
