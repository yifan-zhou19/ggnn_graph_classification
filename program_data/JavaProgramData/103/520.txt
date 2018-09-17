import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int p;
		int q;
		int count = 0;
		String f = new String(new char[1000]);
		f = new Scanner(System.in).nextLine();
		for (i = 0;i < 1000;i++)
		{
			if (f.charAt(i) >= 'a' && f.charAt(i) <= 'z')
			{
				f = tangible.StringFunctions.changeCharacter(f, i, f.charAt(i) - 'a'+'A');
			}
		}
		for (p = 0;p < f.length();p++)
		{
			if (f.charAt(p) == '\0')
			{
				break;
			}
			if (f.charAt(p) == '0')
			{
				continue;
			}
			for (q = p + 1;q < f.length();q++)
			{
				  if (f.charAt(q) == f.charAt(p))
				  {
					  count++;
					  f = tangible.StringFunctions.changeCharacter(f, q, '0');
				  }
				  else
				  {
					  break;
				  }
			}
			System.out.print("(");
			System.out.print(f.charAt(p));
			System.out.print(",");
			System.out.print(count + 1);
			System.out.print(")");
			f = tangible.StringFunctions.changeCharacter(f, p, '0');
			count = 0;
		}
		return 0;
	}
}

