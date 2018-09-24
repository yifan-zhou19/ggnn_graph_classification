import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int print = char m[];
		int n;
		String a = new String(new char[81]);
		char ch;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ch = System.in.read(); //?????????
		for (int j = 0;j < n;j++)
		{
		  a = new Scanner(System.in).nextLine(); //?????????????
		  System.out.print(print(a));
		  System.out.print("\n");
		}
		return 0;
	}
	public static int print(String m) //?????????
	{ //??????1??????0
		if (!((m[0].equals('_')) || (m[0].compareTo(64) > 0 && m[0].compareTo(91) < 0) || (m[0].compareTo(96) > 0 && m[0].compareTo(123) < 0)))
		{
			return 0;
		}
		int i = 1;
		while (!m[i].equals('\0'))
		{
		  if (!((m[i].equals('_')) || (m[i].compareTo(64) > 0 && m[i].compareTo(91) < 0) || (m[i].compareTo(96) > 0 && m[i].compareTo(123) < 0) || (m[i].compareTo(47) > 0 && m[i].compareTo(58) < 0)))
		  {
			  return 0;
		  }
		  i++;
		}
		return 1;

	}

}

