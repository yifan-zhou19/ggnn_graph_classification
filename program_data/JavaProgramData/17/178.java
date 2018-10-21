import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int temp;
		while (str = new Scanner(System.in).nextLine())
		{
			System.out.print(str);
			System.out.print("\n");
			int k;
			int i;
			int s = 0;
			int t = 0;
			String result = new String(new char[101]);
			int[] left = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(result,' ',(Character.SIZE / Byte.SIZE));
			k = str.length();
			int p = 0;
			for (i = 0;i < k;i++)
			{
				if (str.charAt(i) == '(')
				{
					p++;
					left[s] = i;
					temp = s;
					s++;
				}
				if ((str.charAt(i) == ')') && (p == 0))
				{
					result = tangible.StringFunctions.changeCharacter(result, i, '?');
				}
				if ((str.charAt(i) == ')') && (p != 0))
				{
					p--;
					left[temp] = -1;
					do
					{
						temp--;
					} while (left[temp] == -1);
				}
			}
			for (i = 0;i < s;i++)
			{
				if (left[i] == -1)
				{
					continue;
				}
				else
				{
					result = tangible.StringFunctions.changeCharacter(result, left[i], '$');
				}
			}
			for (i = 0;i < k;i++)
			{
				System.out.print(result.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

