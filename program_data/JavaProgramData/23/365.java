import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]); //????a?????b
		char[][] b = new char[51][51];
		int i = 0;
		int j = 0;
		int p = 0;
		int n = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++) //?????????????????????
		{
			if (a.charAt(i) != ' ')
			{
				b[j][p] = a.charAt(i);
				p = p + 1;
			}
			else //?????????
			{
				b[j][p] = ' ';
				j = j + 1;
				p = 0;
			}
		}
		n = j;
		b[j][p] = ' ';
		for (j = n;j >= 1;j--) //????????
		{
			for (p = 0;b[j][p] != ' ';p++)
			{
				System.out.print(b[j][p]);
			}
			System.out.print(' ');
		}
		for (p = 0;b[0][p] != ' ';p++) //???????????
		{
				System.out.print(b[0][p]);
		}
		return 0;
	}
}
