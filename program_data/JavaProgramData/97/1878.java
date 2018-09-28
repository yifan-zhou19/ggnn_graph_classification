package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int money;
	int c;
	int i;
	int[] a = new int[6];
	int[] b = {100, 50, 20, 10, 5, 1};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		money = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 6;i++)
	{
		c = money % b[i];
	  a[i] = (money - c) / b[i];
	  money = money % b[i];
	  System.out.printf("%d\n",a[i]);
	}
	}


}

