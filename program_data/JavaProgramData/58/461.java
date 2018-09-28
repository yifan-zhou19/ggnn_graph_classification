import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sym = new char[100][100]; //???????????
		char temp;
		int[] k = new int[100]; //?????????????????????
		int i;
		int j;
		int n;
		int[] len = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			sym[i] = new Scanner(System.in).nextLine(); //???????
			len[i] = String.valueOf(sym[i]).length(); //??????????
			if ((sym[i][0] >= 'A' && sym[i][0] <= 'Z') || (sym[i][0] >= 'a' && sym[i][0] <= 'z') || (sym[i][0] == '_'))
			{
				k[i] = 1; //???k????1
				for (j = 1;j < len[i];j++)
				{
					temp = sym[i][j];
					if (!((temp >= 'A' && temp <= 'Z') || (temp >= 'a' && temp <= 'z') || (temp == '_') || (temp >= '0' && temp <= '9')))
					{
							k[i] = 0;
							break;
					} //???????????????k=0?????
				}
			}
			else
			{
				k[i] = 0; //???????k?0
			}

		}
		for (i = 0;i < n;i++)
		{
			System.out.print(k[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

