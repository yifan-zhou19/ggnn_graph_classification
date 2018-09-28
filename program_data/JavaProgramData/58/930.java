import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String m = new String(new char[20]);
		String iflegal = new String(new char[n]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(iflegal,'1',(Character.SIZE / Byte.SIZE));
		m = new Scanner(System.in).nextLine();
		char[][] ch = new char[n][81];
		for (i = 0;i < n;i++) //???????
		{
			ch[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			if ((ch[i][0] != '_') && (ch[i][0] < 'A' || (ch[i][0]>'Z' && ch[i][0] < 'a') || ch[i][0]>'z')) //????????????????
			{
				iflegal = tangible.StringFunctions.changeCharacter(iflegal, i, '0'); //???????????'0'
				continue;
			}
			else //?????????
			{
				for (j = 1;j < String.valueOf(ch[i]).length();j++) //??????????
				{
					if ((ch[i][j] == '_') || (ch[i][j] >= 'A' && ch[i][j] <= 'Z') || (ch[i][j] >= 'a' && ch[i][j] <= 'z') || (ch[i][j] >= '0' && ch[i][j] <= '9')) //?????????????????
					{
					continue; //????
					}
					else
					{
						iflegal = tangible.StringFunctions.changeCharacter(iflegal, i, '0'); //??????0
						break;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
		System.out.print(iflegal.charAt(i));
		System.out.print("\n");
		}
		return 0;
	}
}

