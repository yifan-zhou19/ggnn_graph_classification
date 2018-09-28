import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*************************************************
	//* ????1.cpp                                 *
	//* ?? 1000012747                               *
	//* ??????????????????          *
	//*************************************************
	public static int Main()
	{
		int n = 0;
		int i;
		int j;
		int temp = 0;
		String cinx = new String(new char[100000]); //cinx,ciny??????????
		String ciny = new String(new char[100000]);
		int[] x = new int[1000]; //x,y???????t?????????
		int[] y = new int[1000];
		int[] t = new int[1000];
		int len;
		int lenx = 0;
		int leny = 0;
		int max = 0;
		int maxi;
		for (i = 0;i < 1000;i++)
		{
			x[i] = 0;
			y[i] = 0;
			t[i] = 0;
		}
		cinx = new Scanner(System.in).nextLine();
		len = cinx.length();
		for (i = 0;i < 100000;i++)
		{
			if (cinx.charAt(i) == ',')
			{
				n++;
			}
		}
		n++; //??????????
		for (i = 0;i < len;i++)
		{
			if (cinx.charAt(i) != ',')
			{
				lenx++;
			}
			else
			{
				for (j = lenx - 1;j >= 0;j--)
				{
					x[temp] = x[temp] + ((int)(cinx.charAt(i - j - 1) - '0')) * (Math.pow(10.0,j)); //????????????
				}
				lenx = 0;
				temp++;
			}
		}
		j = 0;
		for (i = 0;i < len;i++) //?????????????
		{
			if (cinx.charAt(i) == ',')
			{
				j++;
			}
			if (j == n - 1)
			{
				break;
			}
		}
		lenx = len - i - 1;
		for (j = lenx - 1;j >= 0;j--)
		{
			x[temp] = x[temp] + ((int)(cinx.charAt(len - j - 1) - '0')) * (Math.pow(10.0,j)); //???????
		}
		ciny = new Scanner(System.in).nextLine();
		len = ciny.length();
		temp = 0;
		for (i = 0;i < len;i++)
		{
			if (ciny.charAt(i) != ',')
			{
				leny++;
			}
			else
			{
				for (j = leny - 1;j >= 0;j--)
				{
					y[temp] = y[temp] + ((int)(ciny.charAt(i - j - 1) - '0')) * (Math.pow(10.0,j));
				}
				leny = 0;
				temp++;
			}
		}
		j = 0;
		for (i = 0;i < len;i++)
		{
			if (ciny.charAt(i) == ',')
			{
				j++;
			}
			if (j == n - 1)
			{
				break;
			}
		}
		leny = len - i - 1;
		for (j = leny - 1;j >= 0;j--)
		{
			y[temp] = y[temp] + ((int)(ciny.charAt(len - j - 1) - '0')) * (Math.pow(10.0,j));
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 1000;j++)
			{
				if ((j >= x[i]) && (j < y[i]))
				{
					t[j]++; //?????????
				}
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (t[i] > max)
			{
				maxi = i;
				max = t[i]; //?????????
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}
