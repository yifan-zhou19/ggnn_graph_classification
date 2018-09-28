import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);
	public static int Main()
	{
		int Judge = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		int i;
		for (i = 1;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Character.SIZE / Byte.SIZE));
			a = new Scanner(System.in).nextLine();
			System.out.print(Judge());
			System.out.print("\n");
		}
				  return 0;
	}
	public static int Judge()
	{
		int i;
		int p = 0;
		if ((a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || ((a.charAt(0) <= 'z') && (a.charAt(0) >= 'a')) || (a.charAt(0) == '_'))
		{
			p = 1;
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || ((a.charAt(i) <= 'z') && (a.charAt(i) >= 'a')) || (a.charAt(i) == '_') || ((a.charAt(i) >= '0') && a.charAt(i) <= '9'))
			{
			}
			else
			{
			p = 0;
			}
		}
		return p;
	}

}

