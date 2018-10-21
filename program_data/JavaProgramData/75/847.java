import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int n;
		int m = 0;
		int[] a = new int[1001];
		int[] b = new int[1001];
		int l1;
		int l2;
		int[] c = new int[1001];
		int p;
		String str1 = new String(new char[9999]);
		String str2 = new String(new char[9999]);
		char[][] ch1 = new char[1001][100];
		char[][] ch2 = new char[1001][100];
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine(); //????2????
		l1 = str1.length();
		l2 = str2.length(); //????????
		for (i = 0;i <= l1 - 1;i++)
		{
			if (str1.charAt(i) != ',') //??????�?�???
			{
										   //??????????
				ch1[k][j] = str1.charAt(i);
				j++;
			}
			else
			{
				k++;
				j = 0; //???�?�??????????????
			}
		}
		for (i = 0;i <= k;i++)
		{
			a[i] = Double.parseDouble(ch1[i]); //?????????????

		}

		k = 0;
		j = 0;
		for (i = 0;i <= l2 - 1;i++) //????2??????
		{
			if (str2.charAt(i) != ',')
			{
				ch2[k][j] = str2.charAt(i);
				j++;
			}
			else
			{
				k++;
				j = 0;
			}
		}
		for (i = 0;i <= k;i++)
		{
			b[i] = Double.parseDouble(ch2[i]);
		}
		n = k + 1;

		for (j = 0;j < 1000;j++) //?????????
		{
			c[j] = 0;
			for (i = 0;i <= k;i++) //????????
			{
				if (a[i] <= j != 0 && b[i]> j)
				{
							//?????????????????????1
					c[j]++;
				}
			}
			if (c[j] > m)
			{
				m = c[j]; //??????
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(m);
			return 0;
	}











}
