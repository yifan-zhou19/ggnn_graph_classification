package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 1;
		int t2;
		int k;
		int n;
		int a;
		int b = 0;
		float t1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		do
		{
			t2 = n * j + k;
			t1 = (float)t2;
		   for (i = 0;i < n - 1;i++)
		   {
			   if (t1 / (n - 1) == t2 / (n - 1))
			   {
				   a = k + n * t2 / (n - 1);
				   b++;
			   }
			   else
			   {
				   b = 0;
				   break;
			   }
			   t2 = a;
			   t1 = (float)t2;
		   }
		   j++;
		}while (b < n - 1);
		t2 = (int)t1;
		System.out.printf("%d",t2);
		return 0;
	}


}

