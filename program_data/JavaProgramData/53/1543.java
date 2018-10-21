package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_b = new int[1000];
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int b[1000];
		int n;
		int i;
		int j;
		int k = 0;
		int w;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 c = Integer.parseInt(tempVar2);
						 }
						 w = 0;
						 for (j = 0;j < k;j++)
						 {
							 if (c == Main_b[j])
							 {
							 w++;
						 break;
							 }
						 }
						 if (w == 0)
						 {
							 Main_b[k] = c;
						 k++;
						 }
		}
						 System.out.printf("%d",Main_b[0]);
	 for (i = 1;i < k;i++)
	 {
	 System.out.printf(",%d",Main_b[i]);
	 }
	}

}

