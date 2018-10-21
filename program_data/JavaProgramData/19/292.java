package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		String x = new String(new char[20]);
		String y = new String(new char[20]);
		char[][] z = new char[100][20];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				z[i] = tempVar.charAt(0);
			}
			if (System.in.read() != ' ')
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto hell;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	hell:
	;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 x = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 y = tempVar3.charAt(0);
		 }
		 for (j = 0;j <= i;j++)
		 {
			 if (strcmp(x,z[j]) == 0)
			 {
				 z[j][0] = 0;
			 }
		 }
		 for (j = 0;j <= i;j++)
		 {
			 if (z[j][0] == 0)
			 {
				 System.out.printf("%s",y);
			 }
			 else
			 {
				 System.out.printf("%s",z[j]);
			 }
			 if (j != i)
			 {
				 System.out.print(" ");
			 }
		 }
	}




}

