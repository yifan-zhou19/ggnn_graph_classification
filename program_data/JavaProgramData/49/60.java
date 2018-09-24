import java.util.*;

package <missing>;

public class GlobalMembers
{
	/***************************************************************************
	*autour:??? 
	*number:1000012905
	*description:???? 
	****************************************************************************/
	//hui ???????????????
	public static int hui(String a, int n)
	{
		int k = (int)(n / 2);
		int i;
		//?????? 
		for (i = 0; i <= k; i++)
		{
			if (!a[i].equals(a[n - 1 - i]))
			{
				break;
			}
		}

		//?? 
		if (i == k + 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		//?????????? 
		String str = new String(new char[500]);
		int sl = 0;
		str = new Scanner(System.in).nextLine();
		sl = str.length();

		int i;
		int j;
		int k;
		String jian = new String(new char[500]); //??????????
		int jl = 0; //??????
		for (i = 2; i <= sl; i++)
		{
			for (j = 0; j <= sl - i; j++)
			{
				//??????j???????i??? 
				for (k = j; k < j + i; k++)
				{
					jian = tangible.StringFunctions.changeCharacter(jian, k - j, str.charAt(k));
				}
				jl = i;

				//?????????,????? 
				if (hui(jian, jl) != 0)
				{
					int t;
					for (t = 0; t < jl; t++)
					{
						System.out.print(jian.charAt(t));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

