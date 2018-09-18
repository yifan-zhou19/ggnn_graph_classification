import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String temp = new String(new char[1000]);
	public static char[][] test = new char[1000][1000];
	public static String s = new String(new char[1000]);
	public static String d = new String(new char[1000]);
	public static String now = new String(new char[1000]);
	public static int Main()
	{
		//freopen("D:\\1.txt","r",stdin);
		temp = new Scanner(System.in).nextLine();
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		d = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(test,0,(Character.SIZE / Byte.SIZE));
		int length = temp.length();
		int i;
		int j = 0;
		int k = 0;
		for (i = 0;i < length;i++)
		{
			if (temp.charAt(i) != ' ')
			{
				now = tangible.StringFunctions.changeCharacter(now, j++, temp.charAt(i));
			}
			else
			{
				test[k] = now;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(now,0,(Character.SIZE / Byte.SIZE));
				j = 0;
				k++;
			}
		}
	   test[k] = now;
		for (i = 0;i <= k;i++)
		{
			if (strcmp(test[i],s) == 0)
			{
				test[i] = d;
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (i != k)
			{
			System.out.print(test[i]);
			System.out.print(" ");
			}
			else
			{
				System.out.print(test[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

