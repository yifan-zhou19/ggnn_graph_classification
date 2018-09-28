package <missing>;

public class GlobalMembers
{
	/*
	 * ???1.cpp
	 * Created on: 2012-10-28
	 * Author: ???
	 * ???????????
	 */
	public static int Main()
	{
		 int n; //????
		 int i;
		 int k;
		 int j = 0;
		 int x;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 int[] a = new int[n]; //????
		 for (i = 0;i <= n - 1;i++) //????
		 {
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 i = 0; //?i?0
		 while (i <= n - 1 - j) //????
		 {
			if (a[i] == k) //????K
			{
				j = j + 1; //?j?1
				for (x = i;x <= n - 1 - j;x++) //????
				{
				a[x] = a[x + 1]; //??????
				}
			}
			else
			{ //?????k
				i = i + 1; //?i?1
			}
		 }
		 for (i = 0;i <= n - j - 1;i++)
		 { //????
			 if (i == 0)
			 {
				 System.out.print(a[i]);
			 }
			 else
			 {
				 System.out.print(" ");
				 System.out.print(a[i]);
			 }
		 }
		 return 0; //????
	}

}

