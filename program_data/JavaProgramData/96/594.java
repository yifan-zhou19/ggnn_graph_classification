import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String num = new String(new char[105]);
	public static int[] begin = new int[105];
	public static int temp = 0;
	public static int len;
	public static int i;
	public static int Main()
	{
		num = new Scanner(System.in).nextLine();
		len = num.length();
		for (i = 0; i < len; i++)
		{
			begin[i] = num.charAt(i) - '0';
		}
		if (len == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(begin[0]);
			System.out.print("\n");
		}
		else if (len == 2)
		{
			   temp = begin[0] * 10 + begin[1];
			   System.out.print(temp / 13);
			   System.out.print("\n");
			   System.out.print(temp % 13);
			   System.out.print("\n");
		}
		else if (len > 2)
		{
			   temp = begin[0] * 10 + begin[1];
			   if (temp >= 13)
			   {
					  System.out.print(temp / 13);
					  temp = temp % 13;
			   }
			   for (i = 2;i < len;i++)
			   {
					  temp = temp * 10 + begin[i];
					  System.out.print(temp / 13);
					  temp = temp % 13;
			   }
			   System.out.print("\n");
			   System.out.print(temp);
			   System.out.print("\n");
		}

		return 0;
	}

}
