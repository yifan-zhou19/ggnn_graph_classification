import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int shu;
		String ppl = new String(new char[27]);
		int[][] a = new int[26][n + 1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE)); //???
		for (int i = 0 ; i < n ; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(ppl, 0, (Character.SIZE / Byte.SIZE)); //????
			shu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read(); //???
			ppl = new Scanner(System.in).nextLine(); //????
			for (int j = 0 ; 'A' <= ppl.charAt(j) && ppl.charAt(j) <= 'Z' ; j++)
			{
				a[(int) ppl.charAt(j) - (int) 'A'][0]++; //0????
				a[(int) ppl.charAt(j) - (int) 'A'][a[(int) ppl.charAt(j) - (int) 'A'][0]] = shu; //??????
			}
		}
		int max = 0; //??????
		int set = 0;
		for (int i = 0 ; i < 26 ; i++)
		{
			if (a[i][0] > max)
			{
				max = a[i][0];
				set = i;
			}
		}
		System.out.print((char)((int)'A' + set));
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (int i = 1 ; i <= max ; i++)
		{
			System.out.print(a[set][i]);
			System.out.print("\n");
		}

		return 0;
	}
}

