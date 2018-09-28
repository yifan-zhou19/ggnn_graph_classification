package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[1000];
	int[] b = new int[1000];
	int i;
	int zhishu;
	int shu;
	for (i = 0;i < 1000;i++)
	{
		 if (i == 0)
		 {
			 a[0] = 1;
		 }
		 else
		 {
			 if (i == 1)
			 {
				 a[i] = 1;
			 }
			 else
			 {
				 a[i] = a[i - 1] + a[i - 2];
			 }
		 }
	}

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  zhishu = Integer.parseInt(tempVar);
	  }
	for (i = 0;i < zhishu;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		shu = Integer.parseInt(tempVar2);
	}
	b[i] = a[shu - 1];
	}
	for (i = 0;i < zhishu;i++)
	{
	System.out.printf("%d\n",b[i]);
	}
	return 0;
	}

}

