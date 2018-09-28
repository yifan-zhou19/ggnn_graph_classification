package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int[] d = new int[100];
		  int e;
		  int f;
		  int g;
		  int i;
		  int j;
		  int x;
		  int y;
		  int z;
		  char[][] c = new char[100][100]; //g?60?????
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  for (b = 0;b < a;b++)
		  {
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   c[b] = tempVar2.charAt(0);
						   }
						   String tempVar3 = ConsoleInput.scanfRead(" ");
						   if (tempVar3 != null)
						   {
							   d[b] = Integer.parseInt(tempVar3);
						   }

		  }
		  for (e = 0;e < a;e++)
		  {
						  if (d[e] >= 60)
						  {
							  i = e;
						  break;
						  }
		  }
		  for (e = 0,g = 0;e < a;e++)
		  {

						  if (d[e] >= 60)
						  {
						  g = g + 1;
						  }
		  }
		  for (x = 1;x <= g;x++)
		  {
			  for (e = 0;e < a;e++)
			  {
						  if (d[e] >= 60)
						  {
									  if (d[i] < d[e])
									  {
									  i = e;
									  }
						  }
			  }
			  System.out.printf("%s\n",c[i]);
			  d[i] = 0;
		  }
		  for (z = 0;z < a;z++)
		  {
						  if (d[z] != 0)
						  {
						  System.out.printf("%s\n",c[z]);
						  }
		  }
		  System.in.read();
		  System.in.read();
	}
}

