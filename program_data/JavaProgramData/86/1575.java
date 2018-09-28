package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] ts = new int[100];
	 int n;
	 int a;
	 int b;
	 int i;
	 int j;
	 int dj = 0;
	 int sum = 0;
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
	 for (j = 0;j < a;j++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }
	 ts[dj + b] = 1;
	 ts[dj + b + 1] = 1;
	 ts[dj + b + 2] = 1;
	 dj += 3;
	 }
	 dj = 0;
	 for (j = 0;j < 60;j++)
	 {
	 if (ts[j] == 0)
	 {
	 sum++;
	 }
	 }
	 System.out.printf("%d\n",sum);
	 sum = 0;
	 for (j = 0;j < 100;j++)
	 {
	 ts[j] = 0;
	 }
	 }
	 return 0;
	}

}

