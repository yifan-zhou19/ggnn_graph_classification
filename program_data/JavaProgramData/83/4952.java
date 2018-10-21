package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[] xuefen = new int[100];
		int[] fenshu = new int[100];
		float d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (b = 1;b <= a;b++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xuefen[b - 1] = Integer.parseInt(tempVar2);
			}
		}
		for (c = 1;c <= a;c++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				fenshu[c - 1] = Integer.parseInt(tempVar3);
			}
		}
		 int e;
		 float f;
		 float g = 0F;
		 for (e = 0;e < a;e++)
		 {
			 if (fenshu[e] < 60)
			 {
				 f = 0F;
			 }
			 else if (fenshu[e] >= 60 && fenshu[e] <= 63)
			 {
				 f = 1F;
			 }
			 else if (fenshu[e] >= 64 && fenshu[e] <= 67)
			 {
				 f = 1.5F;
			 }
			 else if (fenshu[e] >= 68 && fenshu[e] <= 71)
			 {
				 f = 2F;
			 }
			 else if (fenshu[e] >= 72 && fenshu[e] <= 74)
			 {
				 f = 2.3F;
			 }
			 else if (fenshu[e] >= 75 && fenshu[e] <= 77)
			 {
				 f = 2.7F;
			 }
			 else if (fenshu[e] >= 78 && fenshu[e] <= 81)
			 {
				 f = 3F;
			 }
			 else if (fenshu[e] >= 82 && fenshu[e] <= 84)
			 {
				 f = 3.3F;
			 }
			 else if (fenshu[e] >= 85 && fenshu[e] <= 89)
			 {
				 f = 3.7F;
			 }
			 else if (fenshu[e] >= 90 && fenshu[e] <= 100)
			 {
				 f = 4F;
			 }
			 g = g + f * xuefen[e];
		 }
		 int i;
		 float h;
		 for (i = 0;i < a;i++)
		 {
			 h = h + xuefen[i];
		 }
		 float j;
		 j = g / h;
		 System.out.printf("%.2f",j);
	}
}

