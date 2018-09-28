import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????
	//1000062701
	//???

	public static int Main()
	{
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine();
		String p = str; //???????
		int flag = 0;
		for (int i = 0; str.charAt(i) != '\0'; i++)
		{
			if (((*(p.Substring(i)) - '0') >= 0) && ((*(p.Substring(i)) - '0') <= 9))
			{
				flag = 0;
				System.out.print((p.Substring(i)));
			}
			else if (flag == 0)
			{
				System.out.print("\n");
				flag = 1;
			}
		}
		System.out.print("\n");
		return 0;
	}
}
