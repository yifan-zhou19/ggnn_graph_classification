import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String s = new String(new char[4000]);
		int[] a = new int[1001];
		int[] b = new int[1001];
		int i = 0;
		int j = 0;
		int num = 0;
		int t1 = 2000;
		int t2 = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,'\0',(Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != ',')
			{
				num = num * 10 + s.charAt(i) - '0';
			}
			else
			{
				a[j] = num;
				if (t1 > a[j])
				{
					t1 = a[j];
				}
				num = 0;
				j++;
			}
		}
		a[j] = num;
					if (t1 > a[j])
					{
						t1 = a[j];
					}
					num = 0;
					j = 0;
	   s = new Scanner(System.in).nextLine();
	   for (i = 0;i < s.length();i++)
	   {
			   if (s.charAt(i) != ',')
			   {
				   num = num * 10 + s.charAt(i) - '0';
			   }
			   else
			   {
				   b[j] = num;
				   if (t2 < b[j])
				   {
					   t2 = b[j];
				   }
				   num = 0;
				   j++;
			   }
	   }
		   b[j] = num;
					   if (t2 < b[j])
					   {
						   t2 = b[j];
					   }
					   num = 0;
	   int ren = 0;
	   double d = t1 + 0.5;
	  while (d < t2)
	  {
		   int cou = 0;
		   for (int p = 0;p <= j;p++)
		   {
			   if (d > a[p] && d < b[p])
			   {
				   cou++;
			   }
		   }

		   if (cou > ren)
		   {
			   ren = cou;
		   }
		   d += 1;
	  }
	   System.out.print(j + 1);
	   System.out.print(" ");
	   System.out.print(ren);
	   return 0;
	}
}
