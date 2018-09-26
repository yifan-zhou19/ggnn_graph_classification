import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[200]);
		int[] innum = new int[200]; //temp???????13???
		int[] outnum = new int[200];
		int temp = 0;
		int i;
		int len;
		int mark = 0;
		num = new Scanner(System.in).nextLine();
		len = num.length();
		for (i = 0;i < len;i++)
		{
			innum[i] = num.charAt(i) - '0'; //??????
		}
		for (i = 0;i < len;i++)
		{
			temp = temp * 10 + innum[i];
			if (temp / 13 != 0)
			{
				outnum[i] = temp / 13; //???13?????outnum?
				temp = temp % 13; //temp??temp%13
			}
			else
			{
				outnum[i] = 0;
			}
		}
		for (i = 0;i < len;i++)
		{
			if (mark == 0 && outnum[i] == 0) //mark?????0???
			{
				continue;
			}
			if (outnum[i] != 0)
			{
				mark = 1;
			}
				System.out.print(outnum[i]);
		}
		if (mark == 0)
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(temp);
		}
		else
		{
			System.out.print("\n");
			System.out.print(temp);
		}
			return 0;

	}
}
