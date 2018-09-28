package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		 while (m >= 100)
		 {
			 a++;
			 m -= 100;
		 }
		 while (m >= 50 && m < 100)
		 {
			 b++;
			 m -= 50;
		 }
		 while (m >= 20 && m < 50)
		 {
			 c++;
			 m -= 20;
		 }
		 while (m > 10 && m < 20)
		 {
			 d++;
			 m -= 10;
		 }
		 while (m <= 10 && m >= 5)
		 {
			 e++;
			 m -= 5;
		 }
		 while (m < 5 && m>0)
		 {
			 f++;
			 m -= 1;
		 }
		 System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	}


}

