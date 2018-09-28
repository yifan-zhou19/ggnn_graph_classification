import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*???:????
	**???:??
	**?  ?:2010?12?10?
	*/
	public static int Main()
	{
		String str = new String(new char[31]);
		String[] p = new String[20];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int i; //???????????????
		int j;
		int l;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		i = 0;
		for (q = str; * q != '\0'; q++) //??
		{
			if (*q >= '0' && *q <= '9') //????
			{
				p[i++] = q; //????
				for (p[i] = q + 1; p[i] <= str.Substring(l); p[i]++) //?????,???????????'\0'
				{
					if (p[i] < '0' || p[i] > '9') //???????????
					{
						q += p[i] - p[i - 1]; //???????????????????????
						i++;
						break;
					}
				}
			}
		}
		for (j = 0; j < i; j = j + 2)
		{
			for (q = p[j]; q < p[j + 1]; q++)
			{
				System.out.print(q);
			}
			System.out.print("\n");
		}
		return 0;
	}
}
