import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void find(String target) //??
	{
		int count = 0;
		int i;
		int j;
		int k;
		int flag;
		String change = new String(new char[500]);
		for (i = 0;i <= 500;i++) //????????
		{
			if (!target[i].equals('\0'))
			{
				count++;
			}
			else
			{
				break;
			}
		}
		for (i = 2;i <= count;i++) //??????
		{
			for (j = 0;j <= count - i;j++) //????????
			{
				flag = 1;
				for (k = j;k <= j + i - 1;k++)
				{
					change = tangible.StringFunctions.changeCharacter(change, k, target[k]);
				}
				for (k = 0;k <= i / 2 - 1;k++) //???????????
				{
					change = tangible.StringFunctions.changeCharacter(change, j + k, target[j + i - 1 - k]);
					change = tangible.StringFunctions.changeCharacter(change, j + i - 1 - k, target[j + k]);
				}
				for (k = 0;k < i - 1;k++)
				{
					if (!target[j + k].equals(change.charAt(j + k)))
					{
						flag = 0;
					}
				}
				if (flag == 1) //?????????????
				{
					for (k = j;k <= j + i - 1;k++)
					{
						System.out.print(target[k]);
					}
					System.out.print("\n");
				}
			}
		}
	}

	public static int Main()
	{
		String target = new String(new char[500]);
		target = new Scanner(System.in).nextLine();
		find(target);
		return 0;
	}
}

