package <missing>;

public class GlobalMembers
{
	//*************************************
	//*?????? 1300012809           **
	//*************************************
	public static int Main()
	{
	 int n; //????�??�????????7??
	 int k;
	 int u;
	 int sum;
	 int panduan;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 sum = 0;
	 int i;
	 for (i = 1;i <= n;i++)
	 {
		 k = i / 10;
		 u = i % 10;
		 panduan = 0; //??????=0
		 if (k == 7)
		 {
			 panduan = 1;
		 }
		 if (u == 7)
		 {
			 panduan = 1;
		 }
		 if (i % 7 == 0)
		 {
			 panduan = 1;
		 }
		 if (panduan == 0) //???7???????sum?
		 {
			 sum = sum + i * i;
		 }
	 }
	 System.out.print(sum);
	 System.out.print("\n");
	 return 0;
	}
}

