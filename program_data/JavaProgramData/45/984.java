package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] zfc = new char[2][51];
	 int a;
	 int b;
	 int i;
		 for (i = 0;i < 2;i++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 zfc[i] = tempVar.charAt(0);
			 }
		 }
		 a = String.valueOf(zfc[1]).length();
		 b = String.valueOf(zfc[0]).length();
		 for (i = 0;i < a;i++)
		 {
			 if (zfc[1][i] == zfc[0][0] && zfc[1][i + 1] == zfc[0][1])
			 {
				break;
			 }
		 }
		 System.out.printf("%d",i);
		  return 0;
	}

}

