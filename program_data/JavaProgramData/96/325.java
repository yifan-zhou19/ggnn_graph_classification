import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = null;
		int p = null;
		int i = 0;
		int j = 0;
		int yushu = 0;
		int[] shang = new int[101];
		int flag = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0 ; a.charAt(i) != '\0' ; i++)
		{
			shang[j] = (yushu * 10 + (a.charAt(i) - '0')) / 13;
			yushu = (yushu * 10 + (a.charAt(i) - '0')) % 13;
			j++;
		}
		shang[j + 1] = 14;
		for (i = 0 ; shang[i] != 14; i++)
		{
			if (shang[i] != 0)
			{
				flag = 1;
				p = shang[i];
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(a);
			System.out.print("\n");
		}
		do
		{
			System.out.print(p);
			p++;
			i++;
		}while (shang[i + 1] != 14);
		System.out.print("\n");
		System.out.print(yushu);
		System.out.print("\n");
		return 0;
	}

}
