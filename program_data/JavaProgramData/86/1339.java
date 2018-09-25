package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int i;
	int j;
	int k;
	int tiaohuai;
	int[] b = new int[20];
	int count = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (a = 0;a < n;a++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 tiaohuai = Integer.parseInt(tempVar2);
		 }
		 if (tiaohuai == 0)
		 {
			 System.out.print("60\n");
			 continue;
		 }
		 for (i = 0,k = 0;i < tiaohuai;i++,k++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
		 }
	for (i = 0,k = 0;i < tiaohuai;i++,k++)
	{
			 count = b[i] + 3 * i;
			 if (count > 60)
			 {
				 j = 60 - 3 * i;
				 System.out.printf("%d\n",j);
				 break;
			 }
			 count = count + 3;
			 if (count > 60)
			 {
				 System.out.printf("%d\n",b[i]);
				 break;
			 }
	}
			 if (count < 60)
			 {
				 System.out.printf("%d\n",60 - tiaohuai * 3);
			 }

	 }
	 return 0;
	}
}

