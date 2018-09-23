import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] record = new int[26][1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(record,0,(Integer.SIZE / Byte.SIZE));
		String name = new String(new char[10]);
		int m;
		int temp;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			name = new Scanner(System.in).nextLine();
			for (int i = 0;i < name.length();i++)
			{
				record[name.charAt(i) - 65][record[name.charAt(i) - 65][0] + 1] = temp;
				record[name.charAt(i) - 65][0]++;
			}
		}
		int flag = 0;
		for (int i = 0;i < 25;i++)
		{
			if (record[i][0] > record[flag][0])
			{
				flag = i;
			}
		}
		System.out.print((char)(flag + 65));
		System.out.print("\n");
		System.out.print(record[flag][0]);
		System.out.print("\n");
		for (int i = 1;i <= record[flag][0];i++)
		{
			System.out.print(record[flag][i]);
			System.out.print("\n");
		}

		return 0;
	}
}

