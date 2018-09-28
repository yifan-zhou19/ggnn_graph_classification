import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int i;
		int k = 0;
		int n;
		n = a.length();
		for (i = 0;i <= n;i++)
		{
		  if ((int)a.charAt(i) - 32 == 0 && (int)a.charAt(i + 1) - 32 == 0)
		  {
			  continue;
		  }
		  b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
		  k++;
		}
		System.out.print(b);
		System.out.print("\n");
		return 0;
	}

}

