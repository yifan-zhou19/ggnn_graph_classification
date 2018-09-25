package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int bai;
	 int wushi;
	 int ershi;
	 int shi;
	 int wu;
	 int yi;
	 int a;
	 int b;
	 int c;
	 int d;
	 int e;
	 int f;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 bai = m / 100;
	 System.out.printf("%d\n",bai);
	 if (m % 100 >= 50)
	 {
		 wushi = 1;
	 }
	 else if (m % 100 <= 50)
	 {
		 wushi = 0;
	 }
	 System.out.printf("%d\n",wushi);
	 if (m % 50 >= 40)
	 {
		 ershi = 2;
	 }
	 else if (m % 50 >= 20 && m % 50 < 40)
	 {
		 ershi = 1;
	 }
	 else if (m % 50 < 20)
	 {
		 ershi = 0;
	 }
	 System.out.printf("%d\n",ershi);
	 if (m - bai * 100 - wushi * 50 - 20 * ershi > 9)
	 {
		 shi = 1;
	 }
	 else if (m - bai * 100 - wushi * 50 - 20 * ershi < 10)
	 {
		 shi = 0;
	 }
	 System.out.printf("%d\n",shi);
	 if (m % 10 >= 5)
	 {
		 wu = 1;
	 }
	 else if (m % 10 < 5)
	 {
		 wu = 0;
	 }
	 System.out.printf("%d\n",wu);
	 yi = m % 5;
	 System.out.printf("%d\n",yi);
	 return 0;
	}
}

