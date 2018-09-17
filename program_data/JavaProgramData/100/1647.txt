package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[300]);
	int i;
	int j;
	int[] sum = new int[200];
	int m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	for (i = 0;a.charAt(i) != '\0';i++)
	{
		 for (j = 65;j <= 90;j++)
		 {
			 if (a.charAt(i) == j)
			 {
				  sum[j]++;
				  m++;
			 }
		 }
		  for (j = 97;j <= 122;j++)
		  {
			 if (a.charAt(i) == j)
			 {
				 sum[j]++;
				 m++;
			 }
		  }
	}
		 if (m > 0)
		 {
			  for (j = 65;j <= 122;j++)
			  {
				  if (sum[j] != 0)
				  {
				  System.out.printf("%c=%d\n",j,sum[j]);
				  }
			  }
		 }

		 if (m == 0)
		 {
			System.out.print("No");
		 }
	return 0;
	}
}

