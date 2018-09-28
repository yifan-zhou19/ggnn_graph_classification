package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int[] age = new int[100];
		  int a;
		  int[] ageb = new int[100];
		  int c;
		  int t;
		  int m;
		  char[][] ID = new char[100][100];
		  char[][] IDb = new char[100][100];
		  String IDc = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  ID[i] = tempVar2.charAt(0);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  age[i] = Integer.parseInt(tempVar3);
						  }
		  }
		  i = 0;
		  c = 0;
		  while (i < n)
		  {
					if (age[i] >= 60)
					{
					ageb[c] = age[i];
					IDb[c] = ID[i];
					c++;
					}
					i++;
		  }
		  for (i = 0;i <= c - 1;i++)
		  {
			 for (a = 0;a < c - i - 1;a++)
			 {
			 if (ageb[a] < ageb[a + 1])
			 {
					t = ageb[a];
					IDc = IDb[a];
					ageb[a] = ageb[a + 1];
					IDb[a] = IDb[a + 1];
					ageb[a + 1] = t;
					IDb[a + 1] = IDc;
			 }
			 }
		  }
			 for (i = 0;i <= c - 1;i++)
			 {
			 System.out.printf("%s\n",IDb[i]);
			 }
			 i = 0;
			 while (i < n)
			 {
					if (age[i] < 60)
					{
					System.out.printf("%s\n",ID[i]);
					}
					i++;
			 }
			 System.in.read();
			 System.in.read();
	}

}

