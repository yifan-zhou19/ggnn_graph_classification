package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int y1;
		 int m1;
		 int d1;
		 int y2;
		 int m2;
		 int d2;
		 int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 int i;
		 int j;
		 int l1 = 0;
		 int l2 = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 y1 = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m1 = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 d1 = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 y2 = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 m2 = Integer.parseInt(tempVar5);
		 }
		 String tempVar6 = ConsoleInput.scanfRead();
		 if (tempVar6 != null)
		 {
			 d2 = Integer.parseInt(tempVar6);
		 }

		 for (i = 1;i < m1;i++)
		 {
			 l1 += m[i];
		 }
		 l1 += d1;
		 if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		 {
			 if (m1 > 2)
			 {
			 l1 += 1;
			 }
		 }

		 for (i = 1;i < m2;i++)
		 {
			 l2 += m[i];
		 }
		 l2 += d2;
		 if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		 {
			 if (m2 > 2)
			 {
			 l2 += 1;
			 }
		 }

		 if (y1 != y2)
		 {
			 for (j = y1;j < y2;j++)
			 {
				 l2 += 365;
				 if ((j % 4 == 0 && j % 100 != 0) || (j % 400 == 0))
				 {
					 l2 += 1;
				 }
			 }
		 }

		 System.out.printf("%d",l2 - l1);


	}
}

