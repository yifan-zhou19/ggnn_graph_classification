package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int weishu;
	 int ge;
	 int shi;
	 int bai;
	 int qian;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 if ((0 <= n) && (n <= 9))
	 {
	   System.out.printf("%d\n",n);
	 }
	 if ((10 <= n) && (n <= 99))
	 {
		 ge = n % 10;
	   shi = n / 10;
	   System.out.printf("%d%d",ge,shi);
	 }
	 if ((100 <= n) && (n <= 999))
	 {
		 ge = n % 10;
		shi = ((n - ge) / 10) % 10;
		bai = n / 100;
		System.out.printf("%d%d%d",ge,shi,bai);
	 }
	  if ((1000 <= n) && (n <= 9999))
	  {
		  ge = n % 10;
	  shi = ((n - ge) / 10) % 10;
	  bai = ((n - shi * 10) / 100) % 10;
	  qian = (n - bai * 100) / 1000;
	  System.out.printf("%d%d%d%d",ge,shi,bai,qian);
	  }

	}
}

