package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100000]);
		  int b;
		  int c;
		  int d;
		  int e;
		  int f;
		  int h;
		  int[] g = new int[100000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  b = Integer.parseInt(tempVar);
		  }
		  for (c = 0;c < b;c++)
		  {
		  for (h = 0;h < 100000;h++)
		  {
		  g[h] = 0;
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  e = a.length();
		  for (d = 0;d < e-1;d++)
		  {
		  for (f = d + 1;f < e;f++)
		  {
							if (a.charAt(f) == a.charAt(d))
							{
							g[f]++;
							g[d]++;
							}
		  }
							if (f == e && g[d] == 0)
							{
							System.out.printf("%c\n",a.charAt(d));
							break;
							}
		  }
		  if (d == e-1)
		  {
		  System.out.print("no\n");
		  }
		  }
	}
}

