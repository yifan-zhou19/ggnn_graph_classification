import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int j;
		int a;
		int b;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		for (len = 0;str.charAt(len) != '\0';len++)
		{
			;
		}
		a = len + 1;
		for (i = len - 1;i >= 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
				b = a - 1;
				a = i + 1;
				for (j = a;j < b;j++)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(' ');
			}
		}
		for (j = 0;j < a - 1;j++)
		{
			System.out.print(str.charAt(j));
		}
	}
}
