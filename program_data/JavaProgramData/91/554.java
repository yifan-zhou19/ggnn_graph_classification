import java.util.*;

package <missing>;

public class GlobalMembers
{
	 //******************************//
	 //*     ?????				*//
	 //*     ???1000012711		*//
	 //*     ??????????	*//
	 //*     ???2010.12.15		*//
	 //******************************//
	public static int Main()
	{
		int i;
		int l;
		String str = new String(new char[101]);
		char temp;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		temp = str.charAt(0);
		for (i = 0; i < l; i++)
		{
			if (i == l - 1)
			{
				str.charAt(i) += temp;
				continue;
			}
			str.charAt(i) += str.charAt(i + 1);
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}
