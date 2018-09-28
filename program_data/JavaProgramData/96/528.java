import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		 String a = new String(new char[101]);
		 a = new Scanner(System.in).nextLine();
		 int i;
		 int j;
		 int k;
		 int l;
		 l = a.length();
		 int[] c = new int[l];
		 int[] d = new int[l];
		 for (i = 0;i < l;i++)
		 {
			d[i] = 0;
		 }
		 for (i = 0;i < l;i++)
		 {
		   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0');
		 }
		 if (l == 1)
		 {
		   int t = a.charAt(0);
		   System.out.print(0);
		   System.out.print("\n");
		   System.out.print(t);
		   System.out.print("\n");
		 }
		 else if ((l == 2) && (a.charAt(0) == 1) && (a.charAt(i) < 3))
		 {
		   int p = a.charAt(0);
		   int q = a.charAt(1);
			  System.out.print(0);
			  System.out.print("\n");
		   System.out.print(p * 10 + q);
		   System.out.print("\n");
		 }
		 else
		 {
		 if ((a.charAt(0) == 1) && (a.charAt(1) < 3))
		 {
		   a = null;
		   a = tangible.StringFunctions.changeCharacter(a, 1, 10 + a.charAt(1));
		 }
		 else
		 {
			 ;
		 }
		 for (i = 1;i < l;i++)
		 {
		   d[i - 1] = (a.charAt(i) + a.charAt(i - 1) * 10) / 13;
		   k = (a.charAt(i) + a.charAt(i - 1) * 10) % 13;
		   a = tangible.StringFunctions.changeCharacter(a, i, k);
		 }
		 if (d[0] != 0)
		 {
		   for (i = 0;i < l - 1;i++)
		   {
			 System.out.print(d[i]);
		   }
		   System.out.print("\n");
		   System.out.print(k);
		   System.out.print("\n");
		 }
		 else
		 {
			 for (i = 1;i < l - 1;i++)
			 {
			 System.out.print(d[i]);
			 }
		   System.out.print("\n");
		   System.out.print(k);
		   System.out.print("\n");
		 }
		 }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}

}

