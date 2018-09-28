import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		String a = new String(new char[100]);
		final String word = "";
		int i; //????
		int len;
		int j;
		int[] l = new int[50];
		int[] r = new int[50];
		int n;
		a = new Scanner(System.in).nextLine(); //??
		len = a.length(); //???????
		j = 1; //??
		l[0] = 0; //??????????????a[0]
		for (i = 1;i < len;i++)
		{
			if (a.charAt(i - 1) == ' ' && a.charAt(i) != ' ')
			{
				l[j] = i;
				j = j + 1;
			} //?j????????????a[l[j]]
		}
		n = j - 1;
		j = 0;
		for (i = 0;i < len - 1;i++)
		{
			if (a.charAt(i + 1) == ' ' && a.charAt(i) != ' ')
			{
				r[j] = i;
				j = j + 1;
			}
		}
		r[n] = len - 1; //?j??????????????a[r[j]]
		for (i = 0;i <= n;i++)
		{
			for (j = l[i];j <= r[i];j++)
			{
				word.charAt(i)[j - l[i]] = a.charAt(j); //word[i]?a??i???
			}
		}
		System.out.print(word.charAt(0));
		for (i = 1;i <= n;i++)
		{
			System.out.print(" ");
			System.out.print(word.charAt(i));
		}
		return 0;
	} //?????
}
