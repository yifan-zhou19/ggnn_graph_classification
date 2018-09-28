package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	 int s = 0;
	 int w;
	 int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 w = Integer.parseInt(tempVar);
	 }
	 int i;
	 int j;
	 if (w == 7)
	 {
		System.out.print("1\n");
	 }
	 for (i = 1;i < 12;i++)
	 {
	 for (j = 0;j < i;j++)
	 {
	 s = s + m[j];
	 }
	 s = s + 13;
	 if ((s + w - 1) % 7 == 5)
	 {
			System.out.printf("%d\n",i + 1);
	 }
	 s = 0;
	 }
	}
}

