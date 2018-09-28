package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int j;
	 int f;
	 int s = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
	   if (i % 7 != 0)
	   {
		 f = 1;
		 for (j = i;j != 0;)
		 {
		   if (j % 10 == 7)
		   {
		 f = 0;
		 break;
		   };
		   j = j / 10;
		 };
		 if (f == 1)
		 {
		   s = s + i * i;
		 }
	   };
	 }
	   System.out.printf("%ld\n",s);
	}
}

