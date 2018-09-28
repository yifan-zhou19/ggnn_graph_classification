import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int i;
		int j;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		String p = null;
		p = str;
		for (i = 0;i < str.length();i++)
		{
			if (*(p.Substring(i)) == ' ' && *(p.Substring(i) + 1) == ' ')
			{
				for (j = i + 1;j < str.length() - 1;j++)
				{
					*(p.Substring(j)) = *(p.Substring(j) + 1);
				}
				i--;
				k++;
			}
		}
		for (i = 0;i < str.length() - k;i++)
		{
			System.out.print(str.charAt(i));
		}
		return 0;
	}



}
