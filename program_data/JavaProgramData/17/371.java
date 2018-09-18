import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int function(tangible.RefObject<String> out, int t)
	{
		int i = t;
		if (out.argValue.charAt(i) == '(')
		{
			out.argValue.charAt(i) = '$';
			i++;
			while (out.argValue.charAt(i) != ')' && out.argValue.charAt(i))
			{
				if (out.argValue.charAt(i) == '(')
				{
					i = function(out, i) + 1;
					if (i == -1)
					{
						return -2;
					}
				}
				else
				{
					out.argValue.charAt(i) = ' ';
					i++;
				}
			}
			if (out.argValue.charAt(i) == ')')
			{
				out.argValue.charAt(t) = out.argValue.charAt(i) = ' ';
				return i;
			}
			else
			{
				return -2;
			}
		}
		else
		{
			while (out.argValue.charAt(i) != '(' && out.argValue.charAt(i))
			{
				if (out.argValue.charAt(i) == ')')
				{
					out.argValue.charAt(i) = '?';
				}
				else
				{
					out.argValue.charAt(i) = ' ';
				}
				i++;
			}
			if (out.argValue.charAt (i) == '(')
			{
				return function(out, i);
			}
			else
			{
				return -2;
			}
		}
	}



	public static int Main()
	{
		String out = new String(new char[101]);
		int n = -1;
		out = new Scanner(System.in).nextLine();
		while (out.charAt(0) != null)
		{
			n = -1;
			System.out.print(out);
			System.out.print("\n");
			while (n != -2)
			{
			tangible.RefObject<String> tempRef_out = new tangible.RefObject<String>(out);
				n = function(tempRef_out, n + 1);
				out = tempRef_out.argValue;
			}
			System.out.print(out);
			System.out.print("\n");
			out = new Scanner(System.in).nextLine();
		}
		return 0;
	}
}

