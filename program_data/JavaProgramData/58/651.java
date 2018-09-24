import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????????C????????
	public static int Main()
	{
		int n; //????n??????num?10???????????????????????flag
		int num;
		int[] panduan = new int[100];
		int flag;
		int i;
		int j;
		char[][] ch = new char[100][81]; //???ch???????????huiche
		String huiche = new String(new char[1]);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		huiche = new Scanner(System.in).nextLine(); //????
		for (i = 0;i < n;i++)
		{
			ch[i] = new Scanner(System.in).nextLine(); //??n????
		}

		for (i = 0;i < n;i++)
		{
			num = 0;
			flag = 0;

			for (j = 0;j < 81;j++)
			{
				if (ch[i][j] != '\0')
				{
					num = num + 1; //???????
				}
				else
				{
					break;
				}
			};

			if ((ch[i][0] == '_' || (65 <= ch[i][0] && ch[i][0] <= 90) || (97 <= ch[i][0] && ch[i][0] <= 122)) == 0)
			{
				panduan[i] = 0; //???????????
			}
			else
			{
				for (j = 1;j < num;j++)
				{
					if (ch[i][j] == '_' || (65 <= ch[i][j] && ch[i][j] <= 90) || (97 <= ch[i][j] && ch[i][j] <= 122) || (48 <= ch[i][j] && ch[i][j] <= 57))
					{
						flag = flag + 1;
					}
				};

				if (flag == num - 1)
				{
					panduan[i] = 1; //???????????????????????
				}
				else
				{
					panduan[i] = 0;
				}
			};

		};

		for (i = 0;i < n;i++)
		{
			System.out.print(panduan[i]);
			System.out.print("\n");
		}

		return 0;
	}
}

