package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[500]);
		  int c;
		  int d;
		  int e;
		  int f;
		  int g;
		  int h;
		  int i;
		  int k;
		  int m;
		  int[] j = new int[500];
		  for (d = 0;d < 500;d++)
		  {
		  j[d] = 0;
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  e = a.length();
		  String b = new String(new char[c]);
		  for (d = 0;d < e - c + 1;d++)
		  {
				  for (f = 0,g = d;f < c;f++,g++)
				  {
				  b = tangible.StringFunctions.changeCharacter(b, f, a.charAt(g));
				  }
				  for (i = 0,h = d;h < e - c + 1;h++)
				  {
					  for (m = 0;m < c;m++)
					  {
						  if (b.charAt(m) - a.charAt(h + m) == 0)
						  {
						  i++;
						  }
					  }
					  if (m == c)
					  {
						  if (i == c)
						  {
							  j[d]++;
						  }
						  i = 0;
					  }
				  }
		  }
		  for (d = 0,k = j[0];d < e - c;d++)
		  {
				  if (j[d] > k)
				  {
				  k = j[d];
				  }
		  }
		  if (k == 1)
		  {
				  System.out.print("NO");
		  }
		  else
		  {
				  System.out.printf("%d\n",k);
				  for (d = 0;d < e - c;d++)
				  {
						if (j[d] == k)
						{
							for (f = d;f < d + c;f++)
							{
							System.out.printf("%c",a.charAt(f));
							}
							System.out.print("\n");
						}
				  }
		  }
	}
}

