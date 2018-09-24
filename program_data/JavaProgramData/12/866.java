package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int a;
		int n = 0;
		int[] b = new int[16];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (a != -1)
		{
		 i = 2;
		 b[1] = a;
		 do
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = Integer.parseInt(tempVar2);
		 }
		 b[i] = a;
		 i = i + 1;
		 } while (a != 0);
		 for (j = 1;j <= i - 3;j++)
		 {
		 for (k = j + 1;k <= i - 2;k++)
		 {
		 if (b[j] == 2 * b[k] || 2 * b[j] == b[k])
		 {
		 n = n + 1;
		 }
		 }
		 }
		 System.out.printf("%d\n",n);
		 n = 0;
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a = Integer.parseInt(tempVar3);
		 }
		}
	}

}

