import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (k = 1; k <= n; k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Character.SIZE / Byte.SIZE));
			a = new Scanner(System.in).nextLine();
			if ((a.charAt(0) == '_') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
			{
				for (i = 1; a.charAt(i) != '\0';)
				{
					if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9') || a.charAt(i) == '_')
					{
						i++;
					}
					else
					{
						break;
					}
				}
					if (a.charAt(i) == '\0')
					{
						System.out.print('1');
						System.out.print("\n");
					}
					else
					{
						System.out.print('0');
						System.out.print("\n");
					}
			}
			else
			{
				System.out.print('0');
				System.out.print("\n");
			}
		}
		return 0;
	}
}

