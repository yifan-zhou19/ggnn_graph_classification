package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
	int max = 0;
	int store;
	int m;
	int i;
	int[][] x = new int[26][1000];
	int[] coun = new int[27];
	int flag;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= m;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				store = Integer.parseInt(tempVar2);
			}
		 for (;;)
		 {
				 String tempVar3 = ConsoleInput.scanfRead(null, 1);
				 if (tempVar3 != null)
				 {
					 c = tempVar3.charAt(0);
				 }
			  if (c < 65 || c>90)
			  {
				  break;
			  }
			  else
			  {
				  x[c - 64][i] = store;
				  coun[c - 64]++;
			  }
		 }
	}
	for (i = 1;i <= 26;i++)
	{
		   if (coun[i] > max)
		   {
			 max = coun[i];
		  flag = i + 64;
		   }
	}
	System.out.printf("%c\n", flag);
	System.out.printf("%d\n", coun[flag - 64]);
	for (i = 1;i <= 1000;i++)
	{
			if (x[flag - 64][i] != 0)
			{
		 System.out.printf("%d\n", x[flag - 64][i]);
			}
	}

	}
}

