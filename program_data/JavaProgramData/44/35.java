package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
	 int[] a = new int[100];
	 int i;
	 int count = 0;
	 for (i = 0; ;i++)
	 {
		a[i] = num % 10;
		num = num / 10;
		count = count + 1;
		if (num == 0)
		{
			break;
		}
	 }
	 int rev = 0;
	 for (i = 0; i < count; i++)
	 {
		rev = rev * 10 + a[i];
	 }
	 return rev;
	}
	 public static int Main()
	 {
	 int num;
	 int rev;
	 int[] a = new int[6];
	 int i;
	 for (i = 0; i < 6; i++)
	 {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
	 }
	 for (i = 0; i < 6; i++)
	 {
	 if (a[i] < 0)
	 {
		  a[i] = -a[i];
		  rev = reverse(a[i]);
		  System.out.printf("%d\n", -rev);
	 }
	 else
	 {
		 rev = reverse(a[i]);
		 System.out.printf("%d\n", rev);
	 }
	 }
	 return 0;
	 }
}

