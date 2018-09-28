import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[9000]);
	   String b = new String(new char[9000]);
	   int[] x = new int[1000];
	   int[] y = new int[1000];
	   int i;
	   int j = 0;
	   int k = 0;
	   int sum1 = 0;
	   int sum2 = 0;
	   int minx = 0;
	   int maxx = 0;
	   int temp1 = 0;
	   int temp2 = 0;
	   int temp3 = 0;
	   int first = 0;
	   a = new Scanner(System.in).nextLine(); //??????
	   b = new Scanner(System.in).nextLine(); //??????
	   for (i = 0;i < a.length();i++) //??????????????
	   {
		   if (a.charAt(i) == ',')
		   {
			   sum1++;
		   }
	   }
	   sum1 = sum1 + 1;
	   j = 0;
	   for (i = 0;i < a.length();i++) //??????????????
	   {
		  if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
		  {
			   x[j] = a.charAt(i) - '0' + x[j] * 10;
		  }
		  else if (a.charAt(i) == ',')
		  {
			  j++;
		  }
		  else
		  {
			  break;
		  }
	   }
	   k = 0;
	   for (i = 0;i < b.length();i++) //??????????????
	   {
		   if (b.charAt(i) >= '0' && b.charAt(i) <= '9')
		   {
			   y[k] = b.charAt(i) - '0' + y[k] * 10;
		   }
		   else if (b.charAt(i) == ',')
		   {
			   k++;
		   }
		   else
		   {
			   break;
		   }
	   }
	   minx = x[0];
	   maxx = y[0];
	   for (i = 0;i < sum1;i++) //?????????minx??????maxx
	   {
		   if (x[i] < minx)
		   {
			   minx = x[i];
		   }
		   if (y[i] > maxx)
		   {
			   maxx = y[i];
		   }
	   }
	   for (j = minx;j < maxx;j++) //????????????????
	   {
		  temp3 = 0;
		 for (i = 0;i < sum1;i++)
		 {
			 if (j >= x[i] != 0 && j < y[i])
			 {
				 temp3++;
			 }
		 }
		 if (temp3 > sum2)
		 {
			 sum2 = temp3; //?????????sum2
		 }
	   }
	   System.out.print(sum1);
	   System.out.print(" ");
	   System.out.print(sum2);
	   System.out.print("\n");
	   return 0;
	}

}
