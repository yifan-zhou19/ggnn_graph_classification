import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[120]);
		a = new Scanner(System.in).nextLine();
		int j = a.length();
		String b = new String(new char[120]);
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		for (; p < a.Substring(j) ; p++)
		{
			if (p == a.Substring(j) - 1)
			{
				b = tangible.StringFunctions.changeCharacter(b, k++, (int) * p + (int)a.charAt(0));
			}
			 b = tangible.StringFunctions.changeCharacter(b, k++, (int) * p + (int) * (p + 1));
		}
		for (int i = 0 ; i < k - 1 ; i++)
		{
			System.out.print(b.charAt(i));
		}
		System.out.print("\n");




		return 0;
	}

}

