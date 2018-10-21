import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????
	//10.11.19
	public static int Main()
	{
		int i;
		int flag;
		String str1 = new String(new char[81]); //??
		String str2 = new String(new char[81]);
		str1 = new Scanner(System.in).nextLine(); //??
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;(str1.charAt(i) != '\0') && (str2.charAt(i) != '\0');i++)
		{
			if (str1.charAt(i) > 90)
			{
				str1.charAt(i) -= 32;
			}
			if (str2.charAt(i) > 90)
			{
				str2.charAt(i) -= 32;
			}
		}
		for (i = 0;(str1.charAt(i) != '\0') && (str2.charAt(i) != '\0');i++) //????
		{
			if (str1.charAt(i) > str2.charAt(i))
			{
				flag = 1;
				break;
			}
			else if (str1.charAt(i) < str2.charAt(i))
			{
				flag = -1;
				break;
			}
			else
			{
				flag = 0;
				continue;
			}
			//cout<<abs(str1[i]-str2[i])<<endl;//??

		}
		//cout<<flag<<endl;//??
		switch (flag) //????
		{
			case 1:
				System.out.print(">");
				System.out.print("\n");
				break;
			case -1:
				System.out.print("<");
				System.out.print("\n");
				break;
			case 0:
				System.out.print("=");
				System.out.print("\n");
				break;
		}
		return 0;
	}

}
