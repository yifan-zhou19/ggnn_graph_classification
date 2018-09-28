import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String p;
		int i;
		int len2;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		len2 = b.length();
		p = tangible.StringFunctions.strStr(a,b);
		if (p != null)
		{
			for (i = 0;a.Substring(i) != p;i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print(c);
			if (*(p.Substring(len2)) != '\0')
			{
				for (i = 0; * (p.Substring(len2) + i) != '\0';i++)
				{
					System.out.print((p.Substring(i) + len2));
				}
			}
		}
		else
		{
			System.out.print(a);
			System.out.print("\n");
		}
		return 0;
	}


}

