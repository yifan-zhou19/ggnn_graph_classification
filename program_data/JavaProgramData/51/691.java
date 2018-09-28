import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//*???n-gram????**
	//*?????1300062805 **
	//*???2013.12.17 **
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int len;
		int j;
		int k;
		String a = new String(new char[501]);
		char[][] b = new char[501][5]; //?????????????
		int[] c = new int[501]; //???????????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //????
		a = new Scanner(System.in).nextLine();
		String p; //???????a
		p = a;
		String q = new String(new char[5]); //???????b
		q = b;
		len = a.length(); //????????
		k = 0;
		for (i = 0 ; i <= len - n ; i++) //??????????
		{
			for (j = i; k <= n - 1; j++, k++)
			{
				 q.charAt(i)[k] = p.charAt(j);

			}
			k = 0;
		}
		int sum;
		int temp = 0;
		int m = 0;
		for (i = 0; i <= len - n; i++) //?????????????????????
		{
			sum = 1;
			for (j = i; j < len - n; j++)
			{
				 if (strcmp(q.charAt(i), q.charAt(j + 1)) == 0) //?????sum??
				 {
						 sum++;
				 }
			}

				 if (sum > temp)
				 {
						 temp = sum;
						 k = i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
						 memset(c, 0, (Integer.SIZE / Byte.SIZE));
						 m = 0;
				 }
				 else
				 {
						 if (sum == temp)
						 {
								 c[m] = i;
								 m++;
						 }
				 }
		}
		if (temp == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
				 System.out.print(temp);
				 System.out.print("\n");
				 System.out.print(b[k]);
				 System.out.print("\n");
				 for (i = 0 ; i <= m - 1 ; i++)
				 {
						 System.out.print(b[c[i]]);
						 System.out.print("\n");
				 }
		}
		return 0;
	}
}

