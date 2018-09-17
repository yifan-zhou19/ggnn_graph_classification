import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char temp;
		int i;
		int l;
		int count;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0; i <= l - 1; i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, l, '0');
		temp = a.charAt(0);
		count = 1;
		if (l > 1)
		{
			for (i = 1; i <= l; i++)
			{
				if (a.charAt(i) == temp)
				{
					count++;
				}
				if (a.charAt(i) != temp)
				{
					System.out.print("(");
					System.out.print(temp);
					System.out.print(",");
					System.out.print(count);
					System.out.print(")");
					temp = a.charAt(i);
					count = 1;
				}
			}
		}
		if (l == 1)
		{
			System.out.print("(");
			System.out.print(a.charAt(0));
			System.out.print(",");
			System.out.print(1);
			System.out.print(")");
		}
		System.in.read();
		return 0;
	}
}

