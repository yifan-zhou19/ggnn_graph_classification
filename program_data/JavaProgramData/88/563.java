import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]);
		int sum = 0;
		str = new Scanner(System.in).nextLine();
		for (int i = 0;;i++)
		{
			sum++;
			if (*(str.Substring(i)) == 0)
			{
				break;
			}
		}
			for (int i = 0;i < sum;i++)
			{
			if (*(str.Substring(i)) >= '0' && *(str.Substring(i)) <= '9')
			{
				System.out.print((str.Substring(i)));
			}
			else if (i != 0 && *(str.Substring(i) - 1) >= '0' && *(str.Substring(i) - 1) <= '9')
			{
				System.out.print("\n");
			}
			}
		return 0;
	}
}
