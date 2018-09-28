import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine(); //?????
		l = str.length();
		for (i = 0;i <= l - 1;i++)
		{
			if (str.charAt(i) <= '9' && str.charAt(i) >= '0' && (str.charAt(i + 1) > '9' || str.charAt(i + 1) < '0'))
			{
				System.out.print(str.charAt(i));
				System.out.print("\n");
			} //????????????????
			else if (str.charAt(i) <= '9' && str.charAt(i) >= '0' && str.charAt(i + 1) <= '9' && str.charAt(i + 1) >= '0')
			{
				System.out.print(str.charAt(i));

			} //?????????????????
		}
			return 0;
	}
}
