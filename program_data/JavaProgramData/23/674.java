import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
	int i;
	int j;
	int temp;
	int count = 1;
	str = new Scanner(System.in).nextLine();
	for (i = str.length();i >= 0;i--)
	{
		if ((str.charAt(i) == ' ') && (count != 1))
		{
			for (j = i + 1;j < temp;j++)
			{
				System.out.print(str.charAt(j));
			}
		System.out.print(" ");
		temp = i;
		}
		if ((str.charAt(i) == ' ') && (count == 1))
		{
			temp = str.length();
									  for (j = i + 1;j < temp;j++)
									  {
										  System.out.print(str.charAt(j));
									  }
									  System.out.print(" ");
										count = 2;
										temp = i;
		}
	}
	for (i = 0;i < str.length();i++)
	{
		System.out.print(str.charAt(i));
		if (str.charAt(i + 1) == ' ')
		{
			break;
		}
	} //????????????


		return 0;
	}

}
