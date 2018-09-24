package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		int[] b;
		int i;
		int j;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = Integer.parseInt(tempVar2);
			}
			b[i] = 0;
		}
		for (i = n - 1;i >= 0;i--)
		{
						   for (j = i - 1;j >= 0;j--)
						   {
							   if (a[i] == a[j])
							   {
								   b[i] = b[i] + 1;
							   }
						   }
		}
		for (i = 0;i < n;i++)
		{
				 for (j = i;j < n;j++)
				 {
					 if (b[j] == 0)
					 {
						 flag = flag + 1;
					 }
				 }
				 if (b[i] == 0)
				 {
					 System.out.printf("%d",a[i]);
				 if (flag > 1)
				 {
					 System.out.print(" ");
				 }
				 }
				 flag = 0;
		}
		 return 0;
	}
}

