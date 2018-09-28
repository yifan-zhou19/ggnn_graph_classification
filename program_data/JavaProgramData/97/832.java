package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int bai;
	 int wushi;
	 int ershi;
	 int shi;
	 int wu;
	 int yi;
	 int yu1;
	 int yu2;
	 int yu3;
	 int yu4;
	 int yu5;
	 bai = (n - n % 100) / 100;

	 yu1 = n - bai * 100;
	 if (yu1 >= 50)
	 {
	  wushi = 1;
	 }
	 else
	 {
	  wushi = 0;
	 }

	 yu2 = yu1 - wushi * 50;
	 ershi = (yu2 - yu2 % 20) / 20;

	 yu3 = yu2 - ershi * 20;
	 shi = (yu3 - yu3 % 10) / 10;

	 yu4 = yu3 - shi * 10;
	 wu = (yu4 - yu4 % 5) / 5;

	 yu5 = yu4 - wu * 5;
	 yi = yu5;

	 System.out.printf("%d\n",bai);
	 System.out.printf("%d\n",wushi);
	 System.out.printf("%d\n",ershi);
	 System.out.printf("%d\n",shi);
	 System.out.printf("%d\n",wu);
	 System.out.printf("%d\n",yi);
		return 0;
	}


}

