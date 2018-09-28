import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[200]);
	a = new Scanner(System.in).nextLine();
	int b = a.length();
	String p = a;
	for (int i = 0;i < b;i++)
	{
	System.out.print((char)(*(p.Substring(i)) + *(p + (i + 1) % b)));
	}
	}
}
