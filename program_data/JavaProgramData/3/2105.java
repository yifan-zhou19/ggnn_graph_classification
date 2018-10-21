package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[1000];
		 int n;
		 int k;
		 int i;
		 int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 k = Integer.parseInt(tempVar2);
		 }
		 for (i = 0;i < n;i++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i] = Integer.parseInt(tempVar3);
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 j = i + 1;
		 for (;j < n;j++)
		 {
			 if (k == (a[i] + a[j]))
			 {
			 System.out.print("yes");
		   i = -1;
		   break;
			 }
		 }
			if (i == -1)
			{
				break;
			}
			if (i == n - 1)
			{
				System.out.print("no");
			break;
			}
		 }

		  return 0;
	}
}

