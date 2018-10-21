package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_x = new int[100];
	public static int Main()
	{
	int n;
	int i;
	int j;
	int m;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static int x[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  for (j = 1;j <= m;j++)
	  {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 Main_x[j] = Integer.parseInt(tempVar3);
		 }
	  }
	  for (j = m; ;j--)
	  {
			if ((Main_x[j] + j * 3) <= 60)
			{
			   System.out.printf("%d\n",60 - j * 3);
			break;
			}
		 if ((Main_x[j] + j * 3) > 60 && (Main_x[j] + (j - 1) * 3) <= 60)
		 {
			   System.out.printf("%d\n",Main_x[j]);
			break;
		 }
	  }
	}
	}

}

