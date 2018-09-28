import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[100]);

		for (i = 0;i <= n;i++)
		{
		  a = new Scanner(System.in).nextLine();
		  if (a.charAt(0) == '\0')
		  {
			  continue;
		  }

		if (a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
		{
			t = 1; //??????????
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
			continue;
		}

		for (j = 1;j <= a.length() - 1;j++) //????????
		{
		  if (!((a.charAt(j) >= '0' && a.charAt(j) <= '9') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || a.charAt(j) == '_'))
		  {
			  t = 0;
		   break;
		  }
		}
		System.out.print(t);
		System.out.print("\n");
		}
		return 0;
	}
}

