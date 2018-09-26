package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[500]);
	  String t = new String(new char[5]);
	  char[][] g =
	  {
		  {0, '\0', '\0', '\0', '\0'}
	  };
	  char c;
	  int[] a = new int[500];
	  int n;
	  int i;
	  int j;
	  int max = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  System.in.read();
	  s = new Scanner(System.in).nextLine();
	  for (i = 0;s.charAt(i + n - 1);i++)
	  {
		for (j = 0;j < n;j++)
		{
		  t = tangible.StringFunctions.changeCharacter(t, j, s.charAt(i + j));
		}
		for (j = 0;g[j][0];j++)
		{
		  if (!strcmp(t,g[j]))
		  {
			a[j]++;
			if (a[j] > max)
			{
				max = a[j];
			}
			break;
		  }
		}
		if (!g[j][0])
		{
		  g[j] = t;
		  a[j]++;
		  if (a[j] > max)
		  {
			  max = a[j];
		  }
		}
	  }
	  if (max == 1)
	  {
		  System.out.print("NO");
	  }
	  else
	  {
		System.out.printf("%d\n",max);
		for (j = 0;g[j][0];j++)
		{
		  if (a[j] == max)
		  {
			  System.out.println(g[j]);
		  }
		}
	  }
	}
}

