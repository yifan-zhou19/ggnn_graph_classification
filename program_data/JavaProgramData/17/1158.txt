import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[101]);
		String mark = new String(new char[101]);
		int[] locate = new int[101];
		int left = 0;
		int right = 0;
		int count = -1;
		int len;
		int i;
		while (line = new Scanner(System.in).nextLine())
		{
			count = -1;
			left = 0;
			right = 0;
			len = line.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(mark, ' ', (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(locate, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 0 ; line.charAt(i) != '\0' ; i++)
			{

				if (line.charAt(i) == '(')
				{
					left++;
					locate[++count] = i;
				}
				if (line.charAt(i) == ')')
				{
					if (left <= right)
					{
						mark = tangible.StringFunctions.changeCharacter(mark, i, '?');
					}
					else
					{
						right++;
						count--;
					}
				}
			}
			if (count >= 0)
			{
				for (i = 0 ; i <= count ; i++)
				{
					mark = tangible.StringFunctions.changeCharacter(mark, locate[i], '$');
				}
			}
				mark = tangible.StringFunctions.changeCharacter(mark, len, '\0');
				System.out.print(line);
				System.out.print("\n");
				System.out.print(mark);
				System.out.print("\n");


		}
			return 0;
	}


}

