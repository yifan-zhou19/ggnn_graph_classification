package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int[] a = new int[20000];
		int n;
		int i;
		int l = 0;
		int p;
		int k = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		   l = 0; //l??????????????????
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   c = Integer.parseInt(tempVar2);
		   }
		   for (j = 0;j < k;j++) //??????????????????????
		   {
		   if (c == a[j]) //?????????????????
		   {
		   l = l + 1;
		   }
		   }
		   if (l == 0)
		   {
		   a[k] = c;
		   k++;
		   }
		}
		for (i = 0;i < k;i++)
		{
		if (i == 0)
		{
		System.out.printf("%d",a[i]);
		}
		else
		{
		System.out.printf(" %d",a[i]);
		}
		}
		System.in.read();
		System.in.read();
	}

}

