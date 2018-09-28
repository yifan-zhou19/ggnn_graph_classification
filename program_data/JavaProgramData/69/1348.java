import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		char t;
		int i;
		int flag = 0;
		int aa;
		int bb;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,300);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,300);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		aa = a.length();
		bb = b.length();
		if (aa == 1 && bb == 1 && a.charAt(0) == '0' && b.charAt(0) == '0')
		{
			System.out.print("0");
			return 0;
		}
		for (i = aa;i <= max(aa, bb);i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		for (i = bb;i <= max(aa, bb);i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (i = 0;i < aa / 2;i++)
		{
			t = a.charAt(aa - i - 1);
			a = tangible.StringFunctions.changeCharacter(a, aa - i - 1, a.charAt(i));
			a = tangible.StringFunctions.changeCharacter(a, i, t);
		}
		for (i = 0;i < bb / 2;i++)
		{
			t = b.charAt(bb - i - 1);
			b = tangible.StringFunctions.changeCharacter(b, bb - i - 1, b.charAt(i));
			b = tangible.StringFunctions.changeCharacter(b, i, t);
		}
		for (i = 0;i <= max(aa, bb) + 1;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + b.charAt(i) - '0');
			if (a.charAt(i) > '9')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, (char)(a.charAt(i) - 10));
				a.charAt(i + 1) += 1;
			}
		}

		for (i = max(aa, bb) + 1;i >= 0;i--)
		{
			if (flag == 0 && a.charAt(i) >= 49 && a.charAt(i) <= 57)
			{
				System.out.print(a.charAt(i));
				flag = 1;
			}
			else if (flag == 1)
			{
				System.out.print(a.charAt(i));
			}
		}
		return 0;
	}

}

