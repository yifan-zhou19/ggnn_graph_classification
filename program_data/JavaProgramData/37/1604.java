import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//*???? ????????????
	//********************************


	public static int Main()
	{
		String a = new String(new char[100100]);
		int i;
		int j;
		int k;
		int t;
		int n;
		int c;
		int[] num = new int[26];
		int[] No = new int[26];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= t; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num,0,26 * 4);
			k = 0;
			a = new Scanner(System.in).nextLine();
			n = a.length();
			for (j = 0; j < n; j++)
			{
				c = (int)a.charAt(j) - 'a';
				if (num[c] == 0)
				{
					No[k] = c;
					k++;
				}
				num[c]++;
			}
			for (j = 0; j < k; j++)
			{
				if (num[No[j]] == 1)
				{
					System.out.print((char)(No[j] + 'a'));
					System.out.print("\n");
					break;
				}
			}
			if (j == k)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		System.in.read();
		System.in.read(); //????
		return 0;
	}

}

