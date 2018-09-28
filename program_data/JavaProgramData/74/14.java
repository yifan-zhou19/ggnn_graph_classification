package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int s;
		int t = 0;
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
	 for (i = a;i <= b;i++)
	 {
		 for (j = 2;j <= Math.sqrt(i);j++)
		 {
		if (i % j == 0)
		{
			break;
		}
		 }
		if (j > Math.sqrt(i))
		{
			k = i;
		 s = 0;
		 while (k > 0)
		 {
			 s = 10 * s + k % 10;
		 k = k / 10;
		 }
		 if (s == i)
		 {
			 if (t != 0)
			 {
		  System.out.print(",");
			 }
		  System.out.printf("%d",i);
		  if (t == 0)
		  {
			  t++;
		  }
		 }
		}
	 }
	 if (t == 0)
	 {
		 System.out.print("no");
	 }
	}
}

