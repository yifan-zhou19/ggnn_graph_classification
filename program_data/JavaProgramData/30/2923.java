package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int s = 0;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		 if (i % 7 != 0)
		 {
		 if (i % 10 != 7)
		 {
			 if (i / 10 % 10 != 7)
			 {
				 s = s + i * i;
			 }
		 }
		 }
	}
	System.out.printf("%d",s);
	}


}

