import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char[][] str1 = new char[20][20];
		int i; //str1[j][k]
		int j = 0;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) != ' ')
			{
				str1[j][k] = str.charAt(i);
				//cout<<"str1["<<j<<"]["<<k<<"]="<<str[i]<<endl;
				k++;
			}
			else
			{
				str1[j][k] = '\0';
				//cout<<"str1["<<j<<"]["<<k<<"]='\ 0'"<<endl;
				k = 0;
				j++;
			}
		}
		str1[j][k] = '\0';
		for (i = 0;i < j;i++)
		{
			System.out.print(str1[j - i]);
			System.out.print(' ');
		}
		System.out.print(str1[0]);
		return 0;
	}
}
