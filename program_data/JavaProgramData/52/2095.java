package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 (s[i]) = Integer.parseInt(tempVar3);
			 }
			 System.in.read();
		}
		for (i = n - m;i < n;i++)
		{
			 System.out.printf("%d ",s[i]);
			 System.in.read();
		}
		for (i = 0;i < n - m - 1;i++)
		{
			 System.out.printf("%d ",s[i]);
			 System.in.read();
		}
		i = n - m - 1;
		System.out.printf("%d",s[i]);
		return 0;
	}
}

