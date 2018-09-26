package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int k;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
	if (n <= 4)
	{
	System.out.print("empty\n");
	}
		 for (i = 4;i < n;i += 2)
		 {
		k = 0;
	for (j = 3;j <= (int)Math.sqrt(i - 1);j += 2)
	{
	if ((i - 1) % j == 0)
	{
		k = 1;
		break;
	}
	}
	for (j = 3;j <= (int)Math.sqrt(i + 1);j += 2)
	{
	if ((i + 1) % j == 0)
	{
		k = 1;
		break;
	}
	}
	if (k == 0)
	{
	System.out.printf("%d %d\n",i - 1,i + 1);
	}
		 }
	  return 0;
	}
}

