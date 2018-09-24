import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]); //??????
		a = new Scanner(System.in).nextLine(); //?????
		int i;
		int j;
		int k;
		int m;
		int l;
		int s;
		l = a.length(); //???????
		for (i = 1;i <= l - 1;i++)
		{
			for (j = 0;j <= l - 1 - i;j++)
			{
				for (k = 0,s = 0;k < (i + 1) / 2;k++)
				{
					if (a.charAt(j + k) == a.charAt(j + i - k))
					{
						s = 0; //????j+i??????????????s=0
					}
					else
					{
						s = s + 1;
						break;
					} //???s=s+1,????
				}
				if (s == 0) //??s=0
				{
					for (m = j;m <= j + i;m++)
					{
						System.out.print(a.charAt(m));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
