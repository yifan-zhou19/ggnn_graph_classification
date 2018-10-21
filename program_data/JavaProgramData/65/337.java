package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int[] a = new int[400];
		 int A = 0;
		 int B = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i <= 2 * n - 1;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		 }
		 for (i = 0;i <= 2 * n - 2;i += 2)
		 {
							if (a[i] == 1 && a[i + 1] == 2)
							{
							A += 1;
							}
							if (a[i] == 2 && a[i + 1] == 0)
							{
							A += 1;
							}
							if (a[i] == 0 && a[i + 1] == 1)
							{
							A += 1;
							}
							if (a[i] == 2 && a[i + 1] == 1)
							{
							B += 1;
							}
							if (a[i] == 1 && a[i + 1] == 0)
							{
							B += 1;
							}
							if (a[i] == 0 && a[i + 1] == 2)
							{
							B += 1;
							}
		 }
		 if (A > B)
		 {
		 System.out.print("A");
		 }
		 if (A < B)
		 {
		 System.out.print("B");
		 }
		 if (A == B)
		 {
		 System.out.print("Tie");
		 }
	}


}

