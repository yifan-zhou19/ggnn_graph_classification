import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[101]);
		char b;
		int len;
		int count = 0;
		int i;
		int j;
		int[] intline = new int[101];
		line = new Scanner(System.in).nextLine();
		b = line.charAt(0);
		len = line.length();
		for (i = 0; i < len; i++)
		{
			if (line.charAt(i) == b)
			{
				intline[i] = 1; //1??boy
			}
			else
			{
				intline[i] = 2; //2??girl, 3?????????????
			}
		}
		while (count < len / 2)
		{
			for (i = 0; i < len; i++) //????????????
			{
				if (intline[i] == 2)
				{
					break;
				}
			}
			for (j = i; j >= 0; j--) //????????????????
			{
				if (intline[j] == 1)
				{
					break;
				}
			}
			intline[i] = 3; //???????????
			intline[j] = 3;
			System.out.print(j);
			System.out.print(" ");
			System.out.print(i);
			System.out.print("\n");
			count++;
		}
		return 0;
	}
}
