import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		int[] a = new int[100];
		String ch = new String(new char[100]); //????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //????
		for (i = 0;i < n;i++)
		{
			ch = new Scanner(System.in).nextLine();
			for (j = 0;j < ch.length();j++)
			{
				if (ch.charAt(j) < 48 || (ch.charAt(j)>57 && ch.charAt(j) < 65) || (ch.charAt(j)>90 && ch.charAt(j) < 95) || ch.charAt(j) == 96 || ch.charAt(j)>122)
				{
					flag++; //??????????
				}
			}
			if (flag == 0)
			{
				if ((ch.charAt(0) == 95) || (ch.charAt(0) > 64 && ch.charAt(0) < 91) || (ch.charAt(0) >= 97 && ch.charAt(0) < 123)) //????????65~90??97~122??95
				{
			a[i] = 1;
				}
			}
			flag = 0;
			//????????a[i]??1

		}
		for (j = 0;j < n;j++)
		{
			System.out.print(a[j]);
			System.out.print("\n");
		}
		return 0;
	}
}

