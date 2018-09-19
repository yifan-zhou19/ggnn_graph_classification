package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int e;
	e = 0;
	int[] a = new int[20000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	}
	for (int i = 0;i < n;i++)
	{
			for (int j = i + 1;j < n;j++)
			{
			if (a[i] == a[j])
			{
			a[j] = 0;
			}
			}
	}
	for (int i = 0;i < n;i++)
	{
			   if (e == 0 && a[i] != 0)
			   {
			   System.out.printf("%d",a[i]);
			   e = 1;
			   }
			   else if (e == 1 && a[i] != 0)
			   {
					 System.out.printf(" %d",a[i]);
			   }

	}



	int hou;
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		hou = Integer.parseInt(tempVar3);
	}
	return 0;
	}

}

