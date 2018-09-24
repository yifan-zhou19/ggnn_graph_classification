import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //????????
		int j;
		String s = new String(new char[100]); //???????
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine(); //????
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;s.charAt(i) != '\0';)
		{ //????????
			if (s.charAt(i + j) == a.charAt(j) && (s.charAt(i - 1) == ' ' || i == 0))
			{
				j++; //???????
			}
			else
			{
				System.out.print(s.charAt(i));
			i++;
			j = 0;
			}
			if (a.charAt(j) == '\0' && (s.charAt(i + j) == ' ' || s.charAt(i + j) == '\0'))
			{ //???????b[100]
				System.out.print(b);
				i += j;
				j = 0;
			}
		}
		return 0; //??
	}

}
