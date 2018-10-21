import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //????????????
		int j;
		int len;
		int sp;
		String str = new String(new char[31]); //???????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str,'\0',(Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine(); //?????
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') && (str.charAt(i + 1) < '0' || str.charAt(i + 1)>'9')) //??????????????
			{
				System.out.print(str.charAt(i));
				System.out.print("\n");
			}
			else if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') && (str.charAt(i + 1) >= '0' || str.charAt(i + 1) <= '9')) //???????????????
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				continue; //????
			}
		}
		return 0;
	}
}
