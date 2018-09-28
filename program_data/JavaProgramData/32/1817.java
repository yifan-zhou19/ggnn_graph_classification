import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************************
	//*????????          **
	//*??????             **
	//*???2013.11.15         **
	//***************************
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k <= n;k++)
		{
		final int MAX_LEN = 200;
		int[] num1 = new int[MAX_LEN + 1];
		int[] num2 = new int[MAX_LEN];
		String str1 = new String(new char[MAX_LEN + 1]);
		String str2 = new String(new char[MAX_LEN + 1]);
		System.in.read();
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		int nLen1 = str1.length();
		int nLen2 = str2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num2, 0, (Integer.SIZE / Byte.SIZE));
		int i;
		int j = 0;
		for (i = nLen1 - 1; i >= 0; i--)
		{
		num1[j++] = str1.charAt(i) - '0'; //???????????????
		}
		j = 0;
		for (i = nLen2 - 1; i >= 0; i--)
		{
		num2[j++] = str2.charAt(i) - '0';
		}
		for (i = 0; i < MAX_LEN; i++)
		{
		   num1[i] -= num2[i]; //???????????
		   if (num1[i] >= 10) //????????
		   {
			  num1[i] += 10;
			  num1[i + 1]--; //????
		   }
		}
		 i = MAX_LEN;
		while (num1[i] == 0)
		{
			i--; //???????0??
		}
		for (; i >= 0; i--)
		{
		System.out.print(num1[i]);
		}
		System.out.print("\n");
		}
		return 0;
	}
}

