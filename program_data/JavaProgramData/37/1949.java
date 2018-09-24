import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[26];
		String record = new String(new char[26]);
		String in = new String(new char[20000]);
		int num = 0;
		int t;
		int flag;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		int len;
		for (int i = 0;i < t;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			num = 0;
			in = new Scanner(System.in).nextLine();
			len = in.length();
			for (int i = 0;i < len;i++)
			{
				if (a[in.charAt(i) - 'a'] == 0)
				{
					record = tangible.StringFunctions.changeCharacter(record, num, in.charAt(i),num++);
					a[in.charAt(i) - 'a']++;
				}
				else
				{
					a[in.charAt(i) - 'a']++;
				}
			}
			flag = 0;
			for (int i = 0;i < num;i++)
			{
				if (a[record.charAt(i) - 'a'] == 1)
				{
					System.out.print(record.charAt(i));
					System.out.print("\n");
					flag = 1;
					break;
				}
			}
				if (flag == 0)
				{
					System.out.print("no");
					System.out.print("\n");
				}

		}

	return 0;
	}

}

