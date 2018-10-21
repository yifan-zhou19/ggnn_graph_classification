import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String mf = new String(new char[100]);
	public static int j = 1; //??????
	public static int i = 100; //?? ????
	public static void paixu(int n) //?????
	{
		if (i == 0) //??????????
		{
			cin.eof();
		}
		else //??????
		{
			if (mf.charAt(j) != mf.charAt(0))
			{
			  for (i = j - 1;i >= 0;i--)
			  {
				 if (mf.charAt(i) == mf.charAt(0))
				 {
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
					mf = mf.substring(0, i);
					mf = mf.substring(0, j);
					break;
				 }
			  }
			}
			j = j + 1;
			paixu(j);
		}

	}
	public static int Main()
	{
		for (int k = 0;k < 100;k++) //??
		{
			mf = mf.substring(0, k);
		}
		mf = new Scanner(System.in).nextLine(); //?????
		paixu(1);
		return 0;
	}

}
