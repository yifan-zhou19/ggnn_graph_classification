package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int a;
	 int b;
	 int i = 2;
	 int j = 2;
	 int[] m = new int[11];
	 int[] n = new int[11];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = Integer.parseInt(tempVar2);
	 }
	 m[1] = a;
	 n[1] = b;
	 m[0] = -1;
	 n[0] = -2;
	 while (a != 1)
	 {
		 m[i] = a / 2;
		 a = a / 2;
		 i++;
	 }
	 while (b != 1)
	 {
		 n[j] = b / 2;
		 b = b / 2;
		 j++;
	 }
	 i--;
	 j--;
	 while (m[i] == n[j])
	 {
		 i--;
		 j--;
	 }
	 System.out.printf("%d",m[i + 1]);
	}

}

