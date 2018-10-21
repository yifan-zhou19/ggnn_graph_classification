import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main() //????
	{
		int i;
		int j = 0;
		int k = 0;
		int len;
		String str = new String(new char[31]);
		char[][] num = new char[30][30];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,'\0',(Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i < len;i++) //???????????
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				num[j][k] = str.charAt(i);
				k++;
			}
			else if (str.charAt(i - 1) >= '0' && str.charAt(i - 1) <= '9')
			{
				j++;
				k = 0;
			}
		}
		for (i = 0;i <= j;i++) //????
		{
			System.out.print(num[i]);
			System.out.print("\n");
		}
		return 0;
	}
}
