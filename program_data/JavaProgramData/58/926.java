import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int dicide(String words)
	{
		int j = 0;
		int z = 1;
		if (!words[0].equals('_') && (words[0].compareTo('A') < 0 || (words[0].compareTo('Z') > 0 && words[0].compareTo('a') < 0) || words[0].compareTo('z') > 0))
		{
			   z = 0;
		}
		else
		{
			while (!words[j].equals('\0'))
			{
				z = 1;
				j++;
				if ((words[j].compareTo('A') < 0 || (words[j].compareTo('Z') > 0 && words[j].compareTo('a') < 0) || words[j].compareTo('z') > 0) && !words[j].equals('\n') && !words[j].equals('\0') && !words[j].equals('_') && (words[j].compareTo('0') < 0 || words[j].compareTo('9') > 0))
				{
					z = 0;
					break;
				}
			}

		}
	return (z);
	}
	public static int Main()
	{
		int time = 0;
		time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		char[][] a = new char[100][100];
		int i = 0;
		for (i = 0;i < time;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			System.out.print(dicide(a[i]));
			System.out.print("\n");
		}
	return 0;
	}

}

