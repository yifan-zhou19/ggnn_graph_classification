import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0; //de?????????
		int j;
		int k;
		int n;
		int de = 0;
		String a = new String(new char[1000]);
		String p;
		p = a;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0 ; i < n ; i++)
		{
			if (*(p.Substring(i)) == ' ') //???
			{
				for (j = i + 1;j < n; j++) //????????????????????????
				{
					if (*(p.Substring(j)) == ' ')
					{
						de++;
						for (k = j; k < n - 1; k++)
						{
							*(p.Substring(k)) = *(p.Substring(k) + 1);
						}
						j--; //?????????1????j???
					}
					else
					{
						break;
					}
				}
			}
		}
		for (i = 0; i < n - de ; i++) //????????
		{
			System.out.print((p.Substring(i)));
		}
		return 0;
	}
}
