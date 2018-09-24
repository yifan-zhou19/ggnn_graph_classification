package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int a1;
	public static int b1;
	public static int t;
	public static int m;
	public static String p;
	public static final String a = "\0";
	public static final String b = "\0";
	public static String[] d = {"\0"};


		public static void Main()
		{

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		b = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
		a1 = a.length();
		b1 = b.length();
	  for (i = 0;i < a1;i++)
	  {
		  for (j = 0;j < b1;j++)
		  {
		 d[i][j] = a.charAt(i + j);
		  }
	  }
	  for (i = 0;i < a1;i++)
	  {
	   if (strcmp(d[i],b) == 0)
	   {
		   break;
	   }
	  }

	   System.out.printf("%d",i);
		}


}

