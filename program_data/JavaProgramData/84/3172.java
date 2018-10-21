package <missing>;

public class GlobalMembers
{
	public static void insert(int[] ma, int tem)
	{
	if (tem > ma[0])
	{
		ma[1] = ma[0];
		ma[0] = tem;
	}
	else if (tem > ma[1])
	{
		ma[1] = tem;
	}
	}


	public static int Main()
	{
	int n;
	int i;
	int temp;
	int[] max = {0, 0};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 temp = Integer.parseInt(tempVar2);
		 }
		 if (temp > max[0])
		 {
			 max[1] = max[0];
			 max[0] = temp;
		 }
		 else if (temp > max[1])
		 {
			 max[1] = temp;
		 }
	}
	 System.out.printf("%d\n%d",max[0],max[1]);
	return 0;
	}

}

