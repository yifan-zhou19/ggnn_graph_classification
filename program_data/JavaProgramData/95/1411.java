import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int compare(String s1, String s2)
	{
		int k = 0;
		for (int i = 0; !s1[i].equals('\0');++i)
		{
			if (s1[i].compareTo(65) >= 0 && s1[i].compareTo(90) <= 0)
			{
				s1[i] += 32;
			}
		}
		for (int i = 0; !s2[i].equals('\0');++i)
		{
			if (s2[i].compareTo(65) >= 0 && s2[i].compareTo(90) <= 0)
			{
				s2[i] += 32;
			}
		}
		k = strcmp(s1,s2);
		return k;
	}

	public static int Main()
	{
		String str1 = new String(new char[81]);
		String str2 = new String(new char[81]);
	int a;
	int i;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		a = compare(str1, str2);
	   if (a == 0)
	   {
		   System.out.print('=');
		   System.out.print("\n");
	   }
	   if (a > 0)
	   {
		   System.out.print('>');
		   System.out.print("\n");
	   }
	   if (a < 0)
	   {
		   System.out.print('<');
		   System.out.print("\n");
	   }
		return 0;
	}
}
