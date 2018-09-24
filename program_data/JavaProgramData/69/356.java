import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int max; //???????????
	   int n;
	   String a = new String(new char[300]); //??????????a?b
	   String b = new String(new char[300]);
	   int[] aa = new int[300]; //????????????aa?bb
	   int[] bb = new int[300];
	   int[] h = new int[300]; //?????
	   int[] jinwei = new int[300]; //?????????
	   int i;
	   for (i = 0;i < 300;i++)
	   {
		   aa[i] = 0;
	   }
	   for (i = 0;i < 300;i++)
	   {
		   bb[i] = 0;
	   }

	   a = new Scanner(System.in).nextLine();
	   b = new Scanner(System.in).nextLine();
	   int long1 = a.length();
	   int long2 = b.length();
	   for (i = 1;i <= long1;i++)
	   {
		   aa[i] = (int)a.charAt(long1 - i) - 48;
	   }
	   for (i = 1;i <= long2;i++)
	   {
		   bb[i] = (int)b.charAt(long2 - i) - 48;
	   }
	   if (long1 > long2)
	   {
		   max = long1;
	   }
	   else
	   {
		   max = long2;
	   }
	   jinwei[0] = 0;

	   for (i = 1;i <= max + 1;i++)
	   {
		   if (aa[i] + bb[i] + jinwei[i - 1] < 10) //??????????????
		   {
			   h[i] = aa[i] + bb[i] + jinwei[i - 1];
			 jinwei[i] = 0;
		   }
		   else
		   {
			   h[i] = aa[i] + bb[i] + jinwei[i - 1] - 10;
			   jinwei[i] = 1;
		   }
	   }
	   for (i = max + 1;i >= 1;i--) //?????????0
	   {
		   if (h[i] != 0)
		   {
			   n = i;
			   break;
		   }
	   }
	   if (i == 0)
	   {
		   System.out.print("0");
	   }
	   else
	   {
		   for (i = n;i >= 1;i--)
		   {
			   System.out.print(h[i]);
		   }
	   }

	   return 0;
	}

}
