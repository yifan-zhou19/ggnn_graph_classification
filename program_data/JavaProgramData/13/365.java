package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n;
		int n;
		int i;
		int j;
		int[] a = new int[20000];
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			m = 0;
			for (j = 0;j < i;j++)
			{
			 if (a[i] == a[j])
			 {
			 m = 1;
			 break;
			 }
			}
			if (m == 0)
			{
			System.out.printf(" %d",a[i]);
			}
		}
		System.out.print("\n");
	}
}

