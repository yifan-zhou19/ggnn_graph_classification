import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012853_2
	* @author 1000012853 ??
	* @date 2010?11?19
	* @desc ????????????
	*/
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int len;
		int[] count = new int[26];
		String a = new String(new char[100000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //????\n
		for (m = 1; m <= n; m++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(count,0,(Integer.SIZE / Byte.SIZE)); //count?0
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Character.SIZE / Byte.SIZE)); //a?0
			a = new Scanner(System.in).nextLine();
			len = a.length(); //a???
			for (i = 0; i < len; i++)
			{
				count[a.charAt(i) - 'a']++; //???????????
			}
			for (j = 0; j < len; j++)
			{
				if (count[a.charAt(j) - 'a'] == 1) //?????????????????
				{
					System.out.print(a.charAt(j));
					System.out.print("\n");
					break;
				}
			}
			if (j == len) //?????????no
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

