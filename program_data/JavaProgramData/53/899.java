package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j = 0;
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 (s[i]) = Integer.parseInt(tempVar2);
			 }
			 System.in.read();
		}
		System.out.printf("%d",(s[0]));
		System.in.read();
		for (i = 1;i < n;i++)
		{
			 for (k = 0;k < i;k++)
			 {
				 if (s[i] != s[k])
				 {
					  j++;
				 }
			 }
			 if (j == i)
			 {
				 System.out.printf(",%d",(s[i]));

			 }
			 j = 0;
		}
		System.out.print("\n");
		System.in.read();

		return 0;
	}

}

