import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[1001]);
	a = new Scanner(System.in).nextLine();
	for (int i = 0; i < a.length(); i++)
	{
	if (a.charAt(i) >= 97)
	{
		a.charAt(i) -= 32;
	}
	}
	int i = 0;
	while (i < a.length())
	{
		int count = 1;
	while (a.charAt(i) == a.charAt(i + 1))
	{
		i++;
		count++;
	}
	System.out.print("(");
	System.out.print(a.charAt(i));
	System.out.print(",");
	System.out.print(count);
	System.out.print(")");
	i++;
	}
	return 0;


	}
}
