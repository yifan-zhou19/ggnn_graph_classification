package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 char[][] jjl = new char[n][256];
		 for (int i = 0;i < n;i++)
		 {
			 jjl[i] = new Scanner(System.in).nextLine();
		 }
		 for (int g = 0;g < n;g++)
		 {
			 for (int k = 0;jjl[g][k] != '\0';k++)
			 {
				 if (jjl[g][k] == 'A')
				 {
					 jjl[g][k] = 'T';
				 }
				 else if (jjl[g][k] == 'T')
				 {
					 jjl[g][k] = 'A';
				 }
				 else if (jjl[g][k] == 'C')
				 {
					 jjl[g][k] = 'G';
				 }
				 else if (jjl[g][k] == 'G')
				 {
					 jjl[g][k] = 'C';
				 }
			 }
		 }
		 for (int m = 0;m < n;m++)
		 {
			 System.out.println(jjl[m]);
		 }
		 return 0;
	}


}

