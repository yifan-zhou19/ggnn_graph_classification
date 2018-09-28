import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k;
		int p;
		int[] b = new int[100];
		String m = new String(new char[100]);
		String l = new String(new char[1]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = new Scanner(System.in).nextLine();
		int han = char m.charAt();
		for (k = 0;k < n;k++)
		{
			m = new Scanner(System.in).nextLine();
			b[k] = han(m);
		   //cout<<han(m)<<endl;
		}
		for (k = 0;k < n;k++)
		{
			System.out.print(b[k]);
			System.out.print("\n");
		}

		return 0;
	}
	public static int han(String m)
	{
	   int i;
	   int p = 1;

		if ((m[0].compareTo(65) >= 0 && m[0].compareTo(97) <= 0) || (m[0].compareTo(97) >= 0 && m[0].compareTo(122) <= 0) || m[0].equals(95))
		{
				for (i = 1;i < m.length();i++)
				{
				if ((m[i].compareTo(65) >= 0 && m[i].compareTo(97) <= 0) || (m[i].compareTo(97) >= 0 && m[i].compareTo(122) <= 0) || m[i].equals(95) || (m[i].compareTo(48) >= 0 && m[i].compareTo(57) <= 0))
				{
				 p++;
				}
				}
		}
			if (p == m.length())
			{
				return 1;
			}
			else
			{
				return 0;
			}
	}

}

