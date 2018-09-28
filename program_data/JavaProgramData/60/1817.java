package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int b;
		 int c;
		 int i;
		 int n;
		 int[] d = new int[10000];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 c = 2;
	 if (n <= 4)
	 {
	 System.out.print("empty");
	 }
	 else
	 {
		 a = 3;
	 do
	 {
		 i = 2;
	   do
	   {
		   b = a % i;
	   if (b > 0)
	   {
		 i = i + 1;
	   }
	   else
	   {
			if (i == a)
			{
				d[c] = a;
			c = c + 1;
			if (d[c - 1] - d[c - 2] == 2)
			{
			System.out.printf("%d %d\n",d[c - 2],d[c - 1]);
			}
			break;
			}
			else
			{
			break;
			}
	   }
	   } while (i <= a);
	   a = a + 1;
	 }while (a <= n);
	 }
	}
}

