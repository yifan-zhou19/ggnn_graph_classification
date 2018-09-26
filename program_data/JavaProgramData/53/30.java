package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[310];
		int i;
		int j;
		int[] b = new int[310];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		p = b;

		int chong;
		int l = 0;
		for (i = 0;i < n;i++)
		{
				chong = 0;
			 for (j = 0;j < n;j++)
			 {
				 if (a[i] == b[j])
				 {
					 chong = 1;
				 }
			 }
			 if (chong != 0)
			 {
				 ;
			 }
			 else
			 {
				 *p = a[i];
				 p++;
				 l++;
			 }
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < l;i++)
		{
			System.out.printf(",%d",b[i]);
		}
		System.out.print("\n");
	}
}

