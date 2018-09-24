package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n1;
	int n2;
	int mianji;
	int temp = 0;
	int a = 0;
	int b = 0;
	int n;
	int c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (n1 = 1;n1 <= n;n1++)
	{
	 for (n2 = 1;n2 <= n;n2++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 c = Integer.parseInt(tempVar2);
		 }
		 if (c == 0)
		 {
		 b++;
		 }
	 }
	 if (b != temp)
	 {
		 a++;
		 temp = b;
	 }
	}
	mianji = (a - 2) * (b / 2 - a);
	System.out.printf("%d",mianji);
	}
}

