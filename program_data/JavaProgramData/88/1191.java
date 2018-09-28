import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String in = new String(new char[31]);
		int[] out = new int[30];
		int i;
		int j;
		int k;
		int l = 0;
		int flag1;
		int flag2;
		in = new Scanner(System.in).nextLine();
		for (i = 0;i < 30;i++) //???
		{
			out[i] = 0;
		}
		for (i = 0;i < 31;i++) //???????
		{
			if (in.charAt(i) >= '0' && in.charAt(i) <= '9') //???????
			{
				flag1 = i;
				for (j = i;j < 31;j++)
				{
					if (!(in.charAt(j) >= '0' && in.charAt(j) <= '9')) //????????
					{
						flag2 = j - 1;
						i = j;
						break;
					}
				}
				for (k = flag2;k >= flag1;k--) //?????
				{

					out[l] = out[l] + (in.charAt(k) - '0') * (int)Math.pow(10.0,(double)(flag2 - k));

				}
				l++;
			}
		if (in.charAt(i) == '\0')
		{
			break;
		}
		}
		for (i = 0;i < l - 1;i++)
		{
			System.out.print(out[i]);
			System.out.print("\n");
		}
		System.out.print(out[l - 1]);
		return 0;
	}
}
