import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int cont = 1; //????????????????????
	public static String a = new String(new char[100]);
	public static char x;
	public static char y;
	public static int Main()
	{
		int i;
		int out = int len;
		int len; //a???
		a = new Scanner(System.in).nextLine();
		len = a.length();
		x = a.charAt(0);
		for (i = 1;i < len;i++)
		{
			if (a.charAt(i) != x)
			{
				break;
			}
		}
		y = a.charAt(i);
		out(len);
		return 0;
	}

	public static int out(int len)
	{
		if (len == cont * 2)
		{
			System.out.print(0);
			System.out.print(" ");
			System.out.print(len - 1);
			return 1;
		} //??????????????
		int i;
		int j;
		for (i = 1;i < len - 2;i++) //?????
		{
					if (a.charAt(i) == x && a.charAt(i + 1) == y)
					{
							System.out.print(i);
							System.out.print(" ");
							System.out.print(i + 1);
							System.out.print("\n");
						 a = a.substring(0, i);
						 a = a.substring(0, i + 1); //a?i??a?i+1?????
						 cont++;
						 break;
					} //??????
				 if (a.charAt(i) == x && a.charAt(i + 1) == 0) //????0 0 0???
				 {
							for (j = i + 1;j < len - 1;j++) //?a?j???a?i???????0???
							{
								if (a.charAt(j) != 0)
								{
									break;
								}
							}
						 if (a.charAt(j) == y)
						 {
							 System.out.print(i);
							 System.out.print(" ");
							 System.out.print(j);
							 System.out.print("\n");
									   a = a.substring(0, i);
									   a = a.substring(0, j);
									   cont++;
									   break;
						 }
				 }
		}
		out(len); //????????????
	}

}
