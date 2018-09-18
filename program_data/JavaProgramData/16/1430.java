package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int num;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 num = Integer.parseInt(tempVar);
	 }
	 if (num == 10000)
	 {
	 System.out.print("00001\n");
	 }
	 else
	 {
	 if (num > 999)
	 {
	 System.out.printf("%d%d%d%d\n",num % 10,num % 100 / 10,num / 100 % 10,num / 1000 % 10);
	 }
	 else
	 {
	 if (num > 99)
	 {
	 System.out.printf("%d%d%d\n",num % 10,num % 100 / 10,num / 100 % 10);
	 }
	 else
	 {
	 if (num > 9)
	 {
	 System.out.printf("%d%d\n",num % 10,num % 100 / 10);
	 }
	 else
	 {
	 System.out.printf("%d\n",num);
	 }
	 }
	 }
	 }
	 return 0;
	}
}

