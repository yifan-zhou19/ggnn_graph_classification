package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int a;
		int[] b = new int[30];
		int n;
		int i = 0;
		int j = 2;
		int sum = 2;
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
			 a = Integer.parseInt(tempVar2);
		 }
		 b[0] = 1;
		 b[1] = 1;

		for (j = 2;j < a;j++)
		{
		 b[j] = b[j - 1] + b[j - 2];

		}
		System.out.printf("%d\n",b[j - 1]);
		 }

		return 0;
	}

}

