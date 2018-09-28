package <missing>;

public class GlobalMembers
{
	/**
	* @file 3.cpp
	* @author ???
	* @date 2011-09-28
	* @description
	* ??????: ?7???????
	*/
	public static int tell(int a)
	{
		int s;
		int k;
		int m = 0;
	 for (k = 0,s = a;k < 3;k++,s /= 10)
	 {
		 if (s % 10 == 7)
		 {
			 m = 1;
		 }
	 }
	 if (a % 7 == 0)
	 {
		 m = 1;
	 }
	 return m;
	}
	public static int Main()
	{
		int n;
		int sum;
		int i;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1,sum = 0;i < n + 1;i++)
	 {
		 if (tell(i) == 1)
		 {
			 continue;
		 }
							  sum += i * i;
	 }
	 System.out.print(sum);
	 System.out.print("\n");
	 return 0;
	}
}

