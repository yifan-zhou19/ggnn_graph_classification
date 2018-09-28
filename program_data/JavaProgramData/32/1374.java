import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int lena;
		int lenb;
		int pos;

		String a = new String(new char[101]);
		String b = new String(new char[101]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			System.in.read();
			if (i >= 2)
			{
				System.out.print("\n");
			}
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			lena = a.length();
			lenb = b.length();
			int[] numa = new int[100];
			int[] numb = new int[100];
			j = 0;
			for (i = lena - 1; i >= 0; i--)
			{
				numa[j++] = a.charAt(i) - '0';
			}
			j = 0;
			for (i = lenb - 1; i >= 0; i--)
			{
				numb[j++] = b.charAt(i) - '0';
			}
			for (i = 0; i < lena; i++)
			{
				numa[i] = numa[i] - numb[i];
				if (numa[i] < 0)
				{
					numa[i] += 10;
					numa[i + 1]--;
				}
			}
			i = lena - 1;
			while (numa[i] != 0)
			{
				pos = i;
				break;
			}
			for (i = pos; i >= 0; i--)
			{
				System.out.print(numa[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

