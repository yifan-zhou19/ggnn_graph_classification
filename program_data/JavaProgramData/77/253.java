import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void f(String s)
	{
		int i;
		int j = 1;
		int l = s.length(); //????
		for (i = 0;i < l - 1;i++)
		{
			j = 1;
			if (!s[i].equals('*')) //??????????
			{
				while (s[i + j].equals('*') && i + j < l)
				{
					j++;
				}
				if (!s[i].equals(s[j + i]))
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(i + j);
					System.out.print("\n");
					s[i] = '*',s[i + j] = '*';
					break;
				}
			}
		}
		f(s); //??????
	}
	public static int Main()
	{
		String str = new String(new char[100]); //??????
		str = new Scanner(System.in).nextLine(); //?????
		f(str); //????
		return 0;
	}


}
