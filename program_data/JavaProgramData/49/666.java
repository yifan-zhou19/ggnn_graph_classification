import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[505]);
		String tem1 = new String(new char[505]);
		String tem2 = new String(new char[505]);
		char[][] b = new char[505][505];
		int len1;
		int p = 0;
		int m = 1;
		int[] len = new int[505];
		int[] count = new int[505];
		a = new Scanner(System.in).nextLine(); //?????
		len1 = a.length() - 1; //????????
		for (int i = 1;i <= 504;i++)
		{
			count[i] = i;
		}
		for (int i = 0;i <= len1 - 1;i++)
		{
			for (int j = i + 1;j <= len1;j++) //????????????b?
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(tem1,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(tem2,'\0',(Character.SIZE / Byte.SIZE));
				p = 0;
				for (int k = i;k <= j;k++)
				{
					tem1 = tangible.StringFunctions.changeCharacter(tem1, p, a.charAt(k));
					p++;
				}
				p = 0;
				for (int k = j;k >= i;k--)
				{
					tem2 = tangible.StringFunctions.changeCharacter(tem2, p, a.charAt(k));
					p++;
				}
				if (strcmp(tem1,tem2) == 0)
				{
					b[m] = tem1;
					m++;
				}
			}
		}
		for (int i = 1;i <= m - 1;i++) //???????? ???
		{
			len[i] = String.valueOf(b[i]).length();
		}
		for (int i = 1;i <= m - 2;i++) //????
		{
			for (int j = 1;j <= m - 1 - i;j++)
			{
				if (len[j] > len[j + 1])
				{
					int f = len[j];
					len[j] = len[j + 1];
					len[j + 1] = f;
					int g = count[j];
					count[j] = count[j + 1];
					count[j + 1] = g;
				}
			}
		}
		for (int i = 1;i <= m - 1;i++) //?????
		{
			System.out.print(b[count[i]]);
			System.out.print("\n");
		}
		return 0;
	}
}

