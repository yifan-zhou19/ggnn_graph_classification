import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n = 0;
		int i = 0;
		int count = 0;
		int l = 0;
		String a = new String(new char[800]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine(); //???????????
		for (;n > 0;n--) //?????
		{
			count = 0; //?????
			a = new Scanner(System.in).nextLine();
			l = a.length();
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == '_' || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9'))
				{
					count += 1;
				}
			}
			if ((a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')) && count == l)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}
		return 0; //??
	}

}

