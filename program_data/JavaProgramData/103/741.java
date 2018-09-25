import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char change(char ch)
	{
		if (ch >= 'a' && ch <= 'z')
		{
			return ch - 'a' + 'A';
		}
		else
		{
			return ch;
		}
	}

	public static int Main()
	{
		int i;
		int num = 1;
		int len;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		len = str.length();
		System.out.print("(");
		System.out.print(change(str.charAt(0)));
		System.out.print(",");
		for (i = 1; i < len; i++)
		{
			if (change(str.charAt(i)) == change(str.charAt(i - 1)))
			{
				num++;
			}
			else
			{
				System.out.print(num);
				System.out.print(")(");
				System.out.print(change(str.charAt(i)));
				System.out.print(",");
				num = 1;
			}
		}
		System.out.print(num);
		System.out.print(")");
		System.out.print("\n");
		/*if(change(str[len - 1]) == change(str[len - 2]))
			cout << num + 1 << ")" << endl;
		else
			cout << num << ")(" << change(str[len - 1]) << ",1)" << endl;*/
		return 0;
	}

}
