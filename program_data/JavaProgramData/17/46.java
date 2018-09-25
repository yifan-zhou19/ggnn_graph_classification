import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		while (true)
		{
			String s = new String(new char[101]);
			char zhui = '#';
			int[] count = new int[101]; //count = 1????count = 2???
			int i = 0;
			int j = 0;
			int sl = 0;
			int p = 0;
			int q = 0;
			for (i = 0; i < 101; i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '#');
			} //???

			//??
			s = new Scanner(System.in).nextLine();
			sl = s.length();
			if (s.charAt(0) == '\0')
			{
				break;
			} //???????????
			//???
			for (i = 0; i < sl; i++)
			{
				if (s.charAt(i) == '(')
				{
					count[i] = 1;
				}
				else if (s.charAt(i) == ')')
				{
					count[i] = 2;
				}
				else
				{
					continue;
				}
			}

			//??????????0 
			for (i = sl - 1; i >= 0; i--)
			{
				if (count[i] == 1)
				{
					for (j = i + 1; j < sl; j++)
					{
						if (count[j] == 2)
						{
							count[i] = 0;
							count[j] = 0;
							break;
						}
					}
				}
			}

			//???0?????????;
			int[] dingzuo = new int[101];
			int[] dingyou = new int[101];
			int flag = 0; //???????
			int count0 = 0;
			for (i = 0; i < sl; i++)
			{
				if (count[i] == 1)
				{
					dingzuo[i] = 1;
					flag = 1;
					count0++;
				}
				else if (count[i] == 2)
				{
					dingyou[i] = 1;
					flag = 1;
					count0++;
				}
				else
				{
					continue;
				}
			}

			//?? 
			int k = count0;
			for (i = 0; i < sl; i++)
			{
				System.out.print(s.charAt(i));
			} //???????
			if (flag == 1)
			{
				System.out.print("\n");
				for (i = 0; i < sl; i++)
				{
					if (dingzuo[i] == 1)
					{
						System.out.print("$");
						count0--;
					}
					else if (dingyou[i] == 1)
					{
						System.out.print("?");
						count0--;
					}
					else
					{
						if ((count0 > 0) && (count0 < k))
						{
							System.out.print(" ");
						}
					}
				}
				System.out.print("\n");
			}
			else
			{
				System.out.print("\n");
			}
		}

	return 0;
	}

}

