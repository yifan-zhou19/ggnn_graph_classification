package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 int sum = 0;
	 int i = 0;
	 while (i <= a)
	 {
		 if ((i % 7 == 0 || i % 10 == 7 || i / 10 == 7) == 0)
		 {
		 sum = sum + i * i;
		 }
		 i++;
	 }
	 System.out.printf("%d",sum);
	 return 0;
	}
}

