import java.util.*;

package <missing>;

public class GlobalMembers
{
	// 3.cpp : ??????????????
	//

	public static String x = new String(new char[5000]); //x?y????????
	public static String y = new String(new char[5000]);

	public static int[] vis = new int[1010]; //????
	public static int[] xx = new int[1001]; //????????????
	public static int[] yy = new int[1001];
	public static int Main()
	{
		//freopen("1.in","r",stdin);
		//freopen("1.out","w",stdout);
		x = new Scanner(System.in).nextLine();
		y = new Scanner(System.in).nextLine();
		int lenx = x.length();
		int leny = y.length();
		int ans1 = 1; //   ??
		for (int i = 0;i < lenx;i++)
		{
		  if (x.charAt(i) == ',')
		  {
			  ans1++;
		  }
		}
		System.out.print(ans1);
		System.out.print(" ");
		int k = 0;
		int t = 1;

		for (int i = lenx - 1;i >= 0;i--)
		{
			 if (x.charAt(i) != ',')
			 {
				xx[k] += (x.charAt(i) - '0') * t;
				t = t * 10;
			 }
			else
			{
				 t = 1;
				 k++;
			}
		}
		 k = 0;
		 t = 1;
		 for (int i = leny - 1;i >= 0;i--)
		 {
			 if (y.charAt(i) != ',')
			 {
				yy[k] += (y.charAt(i) - '0') * t;
				t = t * 10;
			 }
			else
			{
				 t = 1;
				 k++;
			}
		 }
		for (int i = 0;i < k + 1;i++)
		{
		  for (int j = xx[i];j < yy[i];j++)
		  {
			vis[j]++;
		  }
		}
		int max = vis[0];
		for (int j = 0;j < 1010;j++)
		{
		  if (vis[j] > max)
		  {
			  max = vis[j];
		  }
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}
