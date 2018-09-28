import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[101]; //?????????,(??????)???????????

	public static void lashou(tangible.RefObject<String> str)
	{
		int i;
		int j;
		int len;
		len = str.argValue.length();
		if (len == 2)
		{
			System.out.print(num[0]);
			System.out.print(' ');
			System.out.print(num[1]);
			return;
		}
		for (i = 0;str.argValue.charAt(i + 1) != '\0';i++)
		{
			if (str.argValue.charAt(i) == str.argValue.charAt(0) && str.argValue.charAt(i + 1) != str.argValue.charAt(i))
			{ //????????,???????????
				System.out.print(num[i]);
				System.out.print(' ');
				System.out.print(num[i + 1]);
				System.out.print("\n");
				for (j = i + 2;str.argValue.charAt(j) != '\0';j++)
				{ //?????,??????????
					str.argValue.charAt(j - 2) = str.argValue.charAt(j);
					num[j - 2] = num[j];
				}
				str.argValue.charAt(j - 2) = '\0';
				break;
			}
		}
		lashou(str);
	}

	public static int Main()
	{
		String str = new String(new char[101]);
		int[] flag = new int[101];
		int i;
		int len;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			num[i] = i;
		}
	tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
		lashou(tempRef_str);
		str = tempRef_str.argValue;
		return 0;
	}


}

