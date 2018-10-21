import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		String a = new String(new char[102]);
		a = new Scanner(System.in).nextLine();
		char boy = a.charAt(0);
		char girl;
		int length = a.length();
	   for (int i = 1;i < length;i++)
	   {
		 if (a.charAt(i) == boy)
		 {
			 continue;
		 }
		 else
		 {
			 girl = a.charAt(i);
			 break;
		 }
	   }
	   int t = 0;
	   int[] placeofboy = new int[55];
	   for (int i = 0;i < length;i++)
	   {
		 if (a.charAt(i) == boy)
		 {
			 placeofboy[++t] = i;
		 }
		 else
		 {
			System.out.print(placeofboy[t]);
			System.out.print(' ');
			System.out.print(i);
			System.out.print("\n");
			t--;
		 }
	   }

	   return 0;
	}

}
